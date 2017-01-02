package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadInSelenium {
public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.filedropper.com/");
}
}
