package com.agentvarifyingprimaryemail.utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConfigFile 
{
	static FileInputStream fis;
	static XSSFWorkbook wbook;
	static XSSFSheet sheet;



	public static String[] getValue(String name,int rowid) {
		try {
			 fis = new FileInputStream("C:\\Users\\funak\\AutomationTester\\AgentVarifyingPrimaryEmail\\src\\main\\java\\com\\agentvarifyingprimaryemail\\excel\\CreateInstitution.xlsx");
				wbook = new XSSFWorkbook(fis);
				sheet = wbook.getSheet(name);
			String value=null;
				int rows = sheet.getLastRowNum();
				int columncount = sheet.getRow(rowid).getLastCellNum();
				
				String [] ss=new String[columncount];
				for (int i = 0; i < columncount; i++) {
							
							if (sheet.getRow(rowid).getCell(i).getCellType() == CellType.NUMERIC) {
								
								Long in = new Double(sheet.getRow(rowid).getCell(i).getNumericCellValue()).longValue();
								
							value= String.valueOf(in);
							ss[i]=value;
							} else {
								value= sheet.getRow(rowid).getCell(i).toString();
								ss[i]=value;
							}
}  
				return ss;		

			
		} catch (Exception e) {
		System.out.println("getvalue");
		return null;		

		}
	
					
	}
}
