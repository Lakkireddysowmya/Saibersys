package pack1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadInselenium {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://notepad-plus-plus.org/download/v7.2.2.html");
		driver.findElement(By.xpath(".//*[@id='main']/div/ul[1]/li[1]/strong/a/img")).click();
		//using autoit download autoit file from https://drive.google.com/file/d/0B6vnknygMB3IeVYzSjdyY0I5VmM/view
		Runtime.getRuntime().exec("C:\\selenium\\Script To Download File.exe");

		//driver.close();
		
		/*FirefoxProfile firefoxprofile = new FirefoxProfile();
		firefoxprofile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
		WebDriver driver = new FirefoxDriver(firefoxprofile);
		driver.get("https://notepad-plus-plus.org/download/v7.2.2.html");
		driver.findElement(By.xpath(".//*[@id='main']/div/ul[1]/li[1]/strong/a/img")).click();*/
		
	}

}
