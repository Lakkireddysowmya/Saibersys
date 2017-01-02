package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {
public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_query_top")));
	    //waits 10 seconds until the icon is visible
	    driver.findElement(By.id("search_query_top")).click();
	    driver.close();
		
}
}
