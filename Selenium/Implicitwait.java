package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicitwait {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		//implicit wait. the Document object module will wait for certain amount of time when trying to find an element
		//this implict will be set for the life of the webdriver.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.get("https://www.irctc.co.in");
		
		
		
	}

}
