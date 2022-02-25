package sample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Axis4 {
    public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\revathi\\OneDrive\\Documents\\Book1.xlsx");
		Workbook book=new XSSFWorkbook();
		Sheet s = book.createSheet("sheet0");
		Row r = s.createRow(1);
		Cell c = r.createCell(0);
		c.setCellValue("kishore");
		FileOutputStream str=new FileOutputStream(f);
		book.write(str);
		
	}  
	
    
}
