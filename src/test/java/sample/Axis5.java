package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Axis5 {
 public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\revathi\\OneDrive\\Documents\\Book1.xlsx");
	FileInputStream st=new FileInputStream(f);
	Workbook book =new XSSFWorkbook(st);
	Sheet s = book.getSheet("sheet0");
	Row r = s.getRow(1);
	Cell c = r.getCell(0);
	String value = c.getStringCellValue();
	if (value.equals("kishore")) {
		c.setCellValue("vicky");
	}
	FileOutputStream str=new FileOutputStream(f);
	book.write(str);
	
}
}
