package pojoutility;


import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Repositary.ExcelAPI;
import Repositary.PropertiesFunction;
import Repositary.TextFilesUtilities;

;

@SuppressWarnings("unused")
public class PojoUtility {
	
	
	private static String Config="D:\\IPAC Projects\\TeamJaganAnna\\src\\main\\java\\Config\\Config.properties";
	private static String OrgFile="D:\\IPAC Projects\\TeamJaganAnna\\src\\main\\java\\OrgProperties\\Or_properties.properties";
	private static String ExcelFile="D:\\IPAC Projects\\TeamJaganAnna\\src\\main\\java\\Envapdata\\ExcellSheet.xlsx";
	private static String  TextFile="D:\\IPAC Projects\\TeamJaganAnna\\src\\main\\java\\Config\\Text.file";
	
	
	public static PropertiesFunction getConfig() throws IOException {
		PropertiesFunction pr=new PropertiesFunction(Config);
		return pr;
	}
	public static ExcelAPI getExcelData() throws Exception{
		
		ExcelAPI er=new ExcelAPI(ExcelFile);
		return er;
		
	}
public static TextFilesUtilities getTextData() throws IOException {
		
		TextFilesUtilities tr=new TextFilesUtilities(TextFile);
		return tr;
		
	}
public static PropertiesFunction getOrgFile() throws IOException {
	PropertiesFunction pr=new PropertiesFunction(OrgFile);
	return pr;
}


}
