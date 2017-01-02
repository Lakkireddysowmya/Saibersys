package pack1;



import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UsingLocators {

public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://automationpractice.com/index.php");	
	//byId
	driver.findElement(By.id("search_query_top")).sendKeys("dress");
	//byName
	driver.findElement(By.name("search_query")).sendKeys("dress");
	// by css selectors
		 driver.findElement(By.cssSelector(".search_query.form-control.ac_input")).sendKeys("dress");
	// by class name  
	driver.findElement(By.className("sf-with-ul")).click();
	//by tag name  finding number of div inside class "columns-container"
	WebElement divisions = driver.findElement(By.className("columns-container"));
	List divlist = divisions.findElements(By.tagName("div"));
	 System.out.println("number of divisions inside class: columns-container are "+divlist.size());
	 //by link text
	 driver.findElement(By.linkText("Our stores")).click();
	 
	 //by partial link text
	 driver.findElement(By.partialLinkText("slip")).click();
	 //by xpath
	 driver.findElement(By.xpath(".//*[@id='email_create']")).sendKeys("lavanya@xyz.com");
	
	
	
	
}

}
