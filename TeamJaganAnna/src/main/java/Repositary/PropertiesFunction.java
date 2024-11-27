package Repositary;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Properties;
import java.util.Set;

public class PropertiesFunction {
	
	private static  String FilePath;
	private FileInputStream fip;
	static Properties pr;
	@SuppressWarnings("static-access")
	public PropertiesFunction(String FilePath) throws IOException {
		this.FilePath=FilePath;
		fip= new FileInputStream(FilePath);
		pr=new Properties();
		pr.load(fip);
		
	}
	public  String getPropertyValue(String Key) {
		String key=pr.getProperty(Key);

       return key;
	}
	public  void setPropertyValue(String key,String value) throws IOException {
		pr.setProperty(key, value);
		FileOutputStream fop=new FileOutputStream(FilePath);
		pr.store(fop, "Sucessfully Entered data");
		

	}
	public  void removeproperty(String key) throws IOException {
	
		pr.remove(key);
		FileOutputStream fop=new FileOutputStream(FilePath);
		pr.store(fop, "Sucessfully Removed data");

	}
  public LinkedHashMap<String, String> getAllProperties() {
	  LinkedHashMap<String, String> map=new LinkedHashMap<>();
	Set<Object>keys=pr.keySet();
	for (Object key : keys) {
		  String keyone =(String)key;
		String value=  pr.getProperty(keyone);
		map.put(keyone, value);
		
		
	}

	return map;
}

}
