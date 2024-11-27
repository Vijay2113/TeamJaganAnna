package Repositary;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class TextFilesUtilities {
	String filePath;
	File file;
	FileWriter fw;
	BufferedWriter bw;
	FileReader fr;
	BufferedReader br;
	public TextFilesUtilities(String filePath) throws IOException
	{
		file = new File(filePath);
		file.createNewFile();
		fw = new FileWriter(file);
		bw = new BufferedWriter(fw);
		fr = new FileReader(file);
		br = new BufferedReader(fr);
	}
	
	public String getData() throws IOException
	{
		String data=null;
		if (br!=null)
			data = br.readLine();
		else
			System.out.println("BR is null...plz cross check");
		return data;
	}
	
	public List<String> getAllData() throws IOException
	{
		List<String> data = new ArrayList<String>();
		if (br!=null) {
			while(br.ready())
			{
				String datas = br.readLine();
				data.add(datas);
			}
		}
		else
		{
			System.out.println("BR is null...plz cross check");
		}
		return data;
	}
	
	public void writeData(int data) throws IOException
	{
		bw.write(data);
		bw.flush();
	}
	
	public void writeData(String data) throws IOException
	{
		bw.write(data);
		bw.flush();
	}

}
