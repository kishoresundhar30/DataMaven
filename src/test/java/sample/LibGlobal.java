package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
    public class LibGlobal {
	      WebDriver driver;
    public void browserconfiqchrome() {
	    WebDriverManager.chromedriver().setup();
	      driver=new ChromeDriver();
        }
    public void openurl(String url) {
		driver.get(url);

	}
    public void MaximizeWindow() {
    driver.manage().window().maximize();
	  }
    public WebElement LocateById(String id) {
   WebElement findElement = driver.findElement(By.id(id));
   return findElement;
   }
    public WebElement LocateByname(String name) {
   WebElement findElement = driver.findElement(By.name(name));
   return findElement;
}
    public WebElement locateByXpath(String xpath) {
     WebElement findElement = driver.findElement(By.xpath(xpath));
     return findElement;
}
    public void inputText(WebElement element,String Value) {
  element.sendKeys(Value);
}
    public void click(WebElement element) {
  element.click();
}
  
 }
