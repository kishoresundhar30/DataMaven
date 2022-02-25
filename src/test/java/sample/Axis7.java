package sample;

import org.openqa.selenium.WebElement;

public class Axis7{
public static void main(String[] args) {
	LibGlobal l=new LibGlobal();
	l.browserconfiqchrome();
	l.openurl("https://www.facebook.com/");
	l.MaximizeWindow();
	WebElement txtEmail = l.LocateById("email");
	l.inputText(txtEmail, "testing");
	WebElement txtpass = l.LocateByname("pass");
	l.inputText(txtpass, "1234567");
	WebElement btnlogin = l.LocateByname("login");
			l.click(btnlogin);
	
}
}
