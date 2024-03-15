package com.Ranka.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Excel {
	public static String getData(String sheet,int row,int cell)
	{
		String val=" ";
		try {
			FileInputStream fis=new FileInputStream("./Excel/filename.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheet);
			Row r=s.getRow(row);
			Cell c=r.getCell(cell);
			
			val=c.toString();
		}
		catch (Exception e) {
			System.out.println("file not found");
			e.printStackTrace();
		}
		return val;
	}

}
