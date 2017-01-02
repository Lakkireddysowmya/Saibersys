package pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class MultipleWindow {

public static void main(String[] args){
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	//saving irctc window 
	String mainWindow = driver.getWindowHandle();
	//saving all the popups
	Set<String> popups = driver.getWindowHandles();
	for(String window: popups) //foreach loop
	{
		driver.switchTo().window(window);
		driver.findElement(By.xpath(".//*[@id='demon_content']/div[2]/input")).click();
	}
	//switching back to main window
	driver.switchTo().window(mainWindow);
	driver.findElement(By.id("usernameId")).sendKeys("Lavanya");
	driver.close();
}
	
}
