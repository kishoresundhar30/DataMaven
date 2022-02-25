package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Axis1 {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();
		File f=new File("C:\\Users\\revathi\\OneDrive\\Documents\\Book1.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet s = w.getSheet("Sheet1");
		int physicalNumberOfRows = s.getPhysicalNumberOfRows();
		System.out.println("row count "+physicalNumberOfRows);
		Row r = s.getRow(3);
		int physicalNumberOfCells = r.getPhysicalNumberOfCells();
		System.out.println("cell count" +physicalNumberOfRows);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		    Row row = s.getRow(i);
		    for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
			}
		}
	}

}
