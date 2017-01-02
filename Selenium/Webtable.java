package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://en.wikipedia.org/wiki/List_of_universities_and_higher_education_colleges_in_London");
	//clicking on the second row of a table.
	driver.findElement(By.xpath(".//*[@id='mw-content-text']/table[1]/tbody/tr[2]/td[1]/a")).click();
	driver.close();
}
}
