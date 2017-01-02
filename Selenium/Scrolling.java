package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class Scrolling {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.dtelepathy.com/blog/inspiration/long-page-scrolling-designs");
	
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("html/body/div[4]/div[4]/a")));
	action.perform();
	
}
}
