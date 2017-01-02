package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Select  month = new Select( driver.findElement(By.id("month")));
		month.selectByVisibleText("Aug");
		Select day =new Select( driver.findElement(By.id("day")));
		day.selectByIndex(6);
		Select year = new Select(  driver.findElement(By.id("year")));
		//note: it is not as same as visible value. get the value of the element using firebug
		year.selectByValue("2001");
	}
}
