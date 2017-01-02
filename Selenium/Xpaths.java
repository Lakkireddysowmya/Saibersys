package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpaths {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=order-slip");
		//absolute xpath. creates problem when physical location of the element changes
		driver.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a/b")).click();
		//// navigating back
		driver.navigate().back();
		//using relative path. short and accurate even if the physical place changes 
		driver.findElement(By.xpath("//a[contains(@title,'View my shopping cart')]")).click();	
		driver.close();
	}

}
