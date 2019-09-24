package com.babel.swift;

import java.io.IOException;
import java.text.ParseException;

import com.babel.swift.converters.ConverterFactory;
import com.babel.swift.converters.MT_Converters.I_MT_Converter;
import com.babel.swift.converters.MX_Converters.I_MX_Converter;
import com.babel.swift.exceptions.*;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mt.AbstractMT;

public class SWIFT_Message_Converter {
	private I_MT_Converter mtConverter;
	private I_MX_Converter mxConverter;
	
	public SWIFT_Message_Converter() { }

	/**
	 * Devuelve la traducción de mensaje mt a mx
	 * @param mtMessage
	 * @return
	 * @throws MTPreconditionException 
	 * @throws ParseException 
	 */
	public String mt_to_mx( String mtMessage ) throws MTTypeNotFoundException, MTParsingException, MTConversionException, MTPreconditionException {
		AbstractMT mt;
		try {
			mt = AbstractMT.parse( mtMessage );
		} catch (IOException e) {
			throw new MTParsingException();
		}
		this.mtConverter = ConverterFactory.getConverter(mt);
		return this.mtConverter.mt_to_mx(mt);
	}

	/**
	 * Devuelve la traducción de mensaje mx a mt
	 * @param mxMessage
	 * @return
	 * @throws ParseException
	 */
	public String mx_to_mt( String mxMessage ) throws MXTypeNotFoundException, MXConversionException {
		AbstractMX mx = AbstractMX.parse(mxMessage, null);
		this.mxConverter = ConverterFactory.getConverter(mx);
		return this.mxConverter.mx_to_mt(mx);
	}

	public String generateMessage (String abstractMTJson) {
		AbstractMT mt = AbstractMT.fromJson(abstractMTJson);
		return mt.message();
	}

	private String getJson( String mtMessage) {
		MT103 mt103;
		try {
			mt103 = (MT103) AbstractMT.parse(mtMessage);
			return mt103.toJson();
		}catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return "";
	}

	public static void main(String[] args) {
		SWIFT_Message_Converter converter = new SWIFT_Message_Converter();

		String jsonMessage = "{\n" +
				"  \"type\": \"MT\",\n" +
				"  \"basicHeaderBlock\": {\n" +
				"    \"applicationId\": \"F\",\n" +
				"    \"serviceId\": \"01\",\n" +
				"    \"logicalTerminal\": \"AAAAGRA0AXXX\",\n" +
				"    \"sessionNumber\": \"0057\",\n" +
				"    \"sequenceNumber\": \"000289\"\n" +
				"  },\n" +
				"  \"applicationHeaderBlock\": {\n" +
				"    \"senderInputTime\": \"0919\",\n" +
				"    \"MIRDate\": \"010321\",\n" +
				"    \"MIRLogicalTerminal\": \"BBBBGRA0AXXX\",\n" +
				"    \"MIRSessionNumber\": \"0057\",\n" +
				"    \"MIRSequenceNumber\": \"000171\",\n" +
				"    \"receiverOutputDate\": \"010321\",\n" +
				"    \"receiverOutputTime\": \"0920\",\n" +
				"    \"messagePriority\": \"N\",\n" +
				"    \"messageType\": \"103\",\n" +
				"    \"direction\": \"O\"\n" +
				"  },\n" +
				"  \"userHeaderBlock\": {\n" +
				"    \"fields\": [\n" +
				"      {\n" +
				"        \"name\": \"108\",\n" +
				"        \"mUR\": \"MT103 003 OF 045\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": \"121\",\n" +
				"        \"uniqueReference\": \"c8b66b47-2bd9-48fe-be90-93c2096f27d2\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  \"textBlock\": {\n" +
				"    \"fields\": [\n" +
				"      {\n" +
				"        \"name\": \"20\",\n" +
				"        \"reference\": \"5387354\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": \"23B\",\n" +
				"        \"type\": \"CRED\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": \"23E\",\n" +
				"        \"code\": \"PHOB\",\n" +
				"        \"additionalInformation\": \"20.527.19.60\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": \"32A\",\n" +
				"        \"date\": \"000526\",\n" +
				"        \"currency\": \"USD\",\n" +
				"        \"amount\": \"1101,50\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": \"33B\",\n" +
				"        \"currency\": \"USD\",\n" +
				"        \"amount\": \"1121,50\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": \"50K\",\n" +
				"        \"nameAndAddress\": \"FRANZ HOLZAPFEL GMBH\",\n" +
				"        \"nameAndAddress2\": \"VIENNA\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": \"52A\",\n" +
				"        \"bIC\": \"BKAUATWW\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": \"59\",\n" +
				"        \"nameAndAddress\": \"723491524\",\n" +
				"        \"nameAndAddress2\": \"C. KLEIN\",\n" +
				"        \"nameAndAddress3\": \"BLOEMENGRACHT 15\",\n" +
				"        \"nameAndAddress4\": \"AMSTERDAM\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": \"71A\",\n" +
				"        \"code\": \"SHA\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": \"71F\",\n" +
				"        \"currency\": \"USD\",\n" +
				"        \"amount\": \"10,\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": \"71F\",\n" +
				"        \"currency\": \"USD\",\n" +
				"        \"amount\": \"10,\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": \"72\",\n" +
				"        \"narrative\": \"/INS/CHASUS33\"\n" +
				"      }\n" +
				"    ]\n" +
				"  },\n" +
				"  \"trailerBlock\": {\n" +
				"    \"fields\": [\n" +
				"      {\n" +
				"        \"name\": \"MAC\",\n" +
				"        \"value\": \"75D138E4\"\n" +
				"      },\n" +
				"      {\n" +
				"        \"name\": \"CHK\",\n" +
				"        \"value\": \"DE1B0D71FA96\"\n" +
				"      }\n" +
				"    ]\n" +
				"  }\n" +
				"}";

		String mtMessage = "{1:F01AAAAGRA0AXXX0057000289}{2:O1030919010321BBBBGRA0AXXX00570001710103210920N}\n" +
				"{3:{108:MT103 003 OF 045}{121:c8b66b47-2bd9-48fe-be90-93c2096f27d2}}\n" +
				"{4:\n" +
				":20:5387354\n" +
				":23B:CRED\n" +
				":23E:PHOB/20.527.19.60\n" +
				":32A:000526USD1101,50\n" +
				":33B:EUR 1121,50\n" +
				":50K:FRANZ HOLZAPFEL GMBH\n" +
				"VIENNA\n" +
				":51A:D asdfasdfasdfasdf ASDF-AS-FD-ASD\n" +
				":52D:fasdfasdfasdfas asdfasdf asdf \n" +
				":59:723491524\n" +
				"C. KLEIN\n" +
				"BLOEMENGRACHT 15\n" +
				"AMSTERDAM\n" +
				":71A:SHA\n" +
				":71F:USD10,\n" +
				":71F:USD10,\n" +
				":72:/INS/CHASUS33\n" +
				"-}{5:{MAC:75D138E4}{CHK:DE1B0D71FA96}}";
		// converter.generateMessage(jsonMessage);
		// converter.createFromJson();
		// System.out.println(converter.getJson());
	}
	
}