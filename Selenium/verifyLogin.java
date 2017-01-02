package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyLogin {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("Lavanya.xyz.com");
	driver.findElement(By.id("pass")).sendKeys("Password");
	driver.findElement(By.id("u_0_n")).click();
	
}
}
