package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.poi.ss.format.CellDateFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Axis {
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		File f=new File("C:\\Users\\revathi\\OneDrive\\Documents\\Book1.xlsx");
		FileInputStream fin=new FileInputStream(f);
	    Workbook w=new XSSFWorkbook(fin) ;
	    Sheet s = w.getSheet("Sheet1");
	    Row r = s.getRow(1);
	    Cell cell = r.getCell(3);
		 System.out.println(cell);
		 int cellType = cell.getCellType();
		 System.out.println(cellType);
		 if(cellType==1) {
			 String stringCellValue = cell.getStringCellValue();
			 System.out.println(stringCellValue);
		 }else if (cellType==0) {
			 if (DateUtil.isCellDateFormatted(cell)) {
				Date datecellvalue=cell.getDateCellValue();
				SimpleDateFormat sim=new SimpleDateFormat("dd/MM/YYYY");
				String format=sim.format(datecellvalue);
				System.out.println(format);
			}else {
				double numeicallvalue=cell.getNumericCellValue();
				long l=(long)numeicallvalue;
				String valueof=String.valueOf(l);
				System.out.println(valueof);
				
			}
			 
				 
			 }
			
	
		 
	}
}