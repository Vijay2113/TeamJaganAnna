package Repositary;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReader {
	private String excelFilepath;
	private static Workbook wb;
	Sheet sh;
	Row rw;
	Cell cl;

	public ExcelReader(String excelFilepath) throws Exception {
		this.excelFilepath = excelFilepath;
		//FileInputStream f = ;
		  BufferedInputStream bis = new BufferedInputStream(new FileInputStream(excelFilepath));
		  //Workbook wb = new XSSFWorkbook(f);
		  wb = WorkbookFactory.create(bis);
		
	}
          //Getting RowCount
	public int getRowCount(String SheetName) {
		int rowcount=0 ;
		rowcount = wb.getSheet(SheetName).getLastRowNum() + 1;
		return rowcount;
	}
         // Getting Cell Data
	@SuppressWarnings("deprecation")
	public static String getExcelData(String Sheetname, int rownumber, int columnnumber) {
		// TODO Auto-generated method stub
		String CellValue = "";
		//wb.getSheet(Sheetname).getRow(rownumber).getCell(columnnumber);
		if (wb.getSheet(Sheetname).getRow(rownumber).getCell(columnnumber)
				.getCellType() ==CellType.NUMERIC) {

			CellValue = wb.getSheet(Sheetname).getRow(rownumber).getCell(columnnumber).getStringCellValue().trim();
		} else {
			CellValue = String
					.valueOf(wb.getSheet(Sheetname).getRow(rownumber).getCell(columnnumber).getNumericCellValue())
					.trim();
		}
		return CellValue;
	}
           //Entering  the CellValue
	public void setCellValue(String SheetName, int rownumber, int columnnumber, String value) throws IOException {
		wb.getSheet(SheetName).createRow(rownumber).createCell(columnnumber).setCellValue(value);
		FileOutputStream fop = new FileOutputStream(excelFilepath);
		wb.write(fop);
		fop.close();

	}
	
	public Sheet getSheet(String sheetName)
	{
		 sh =wb.getSheet(sheetName);
		return sh;
	}
	
	public Row getRow(String sheetName,int rowNum)
	{
		 sh=getSheet(sheetName);
		 rw=sh.getRow(rowNum);
		return rw;
	}
	
	public Cell getCell(String sheetName,int rowNum,int cellNum)
	{
		 rw=getRow(sheetName,rowNum);
		 cl=rw.getCell(cellNum);
		return cl;
	}
	public int getCellCount(int rows) {
		int roww = sh.getLastRowNum() + 1;
		 System.out.println("Total number of Rows"+roww);
		Row row = sh.getRow(rows);
	     int colCount = row.getLastCellNum();
	     return colCount;
	}
}













/*package com.smartcitizen.object.repositary;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	private String excelFilepath;
	private static Workbook wb;
	Sheet sh;
	Row rw;
	Cell cl;

	public ExcelReader(String excelFilepath) throws Exception {
		this.excelFilepath = excelFilepath;
		FileInputStream f = new FileInputStream(excelFilepath);
		wb = WorkbookFactory.create(f);

	}
          //Getting RowCount
	public int getRowCount(String SheetName) {
		int rowcount=0 ;
		rowcount = wb.getSheet(SheetName).getLastRowNum() + 1;
		return rowcount;
	}
         // Getting Cell Data
	@SuppressWarnings("deprecation")
	public static String getExcelData(String Sheetname, int rownumber, int columnnumber) {
		// TODO Auto-generated method stub
		String CellValue = "";
		//wb.getSheet(Sheetname).getRow(rownumber).getCell(columnnumber);
		if (wb.getSheet(Sheetname).getRow(rownumber).getCell(columnnumber)
				.getCellType() == Cell.CELL_TYPE_STRING) {

			CellValue = wb.getSheet(Sheetname).getRow(rownumber).getCell(columnnumber).getStringCellValue().trim();
		} else {
			CellValue = String
					.valueOf(wb.getSheet(Sheetname).getRow(rownumber).getCell(columnnumber).getNumericCellValue())
					.trim();
		}
		return CellValue;
	}
           //Entering  the CellValue
	public void setCellValue(String SheetName, int rownumber, int columnnumber, String value) throws IOException {
		 wb.getSheet(SheetName).createRow(rownumber).createCell(columnnumber).setCellValue(value);
		FileOutputStream fop = new FileOutputStream(excelFilepath);
		wb.write(fop);
		fop.close();

	}
	
	public Sheet getSheet(String sheetName)
	{
		 sh =wb.getSheet(sheetName);
		return sh;
	}
	
	public Row getRow(String sheetName,int rowNum)
	{
		 sh=getSheet(sheetName);
		 rw=sh.getRow(rowNum);
		return rw;
	}
	
	public Cell getCell(String sheetName,int rowNum,int cellNum)
	{
		 rw=getRow(sheetName,rowNum);
		 cl=rw.getCell(cellNum);
		return cl;
	}
	public int getCellCount(int rows) {
		int roww = sh.getLastRowNum() + 1;
		 System.out.println("Total number of Rows"+roww);
		Row row = sh.getRow(rows);
	     int colCount = row.getLastCellNum();
	     return colCount;
	}
}
*/
