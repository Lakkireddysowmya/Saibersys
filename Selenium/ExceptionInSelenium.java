package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExceptionInSelenium {

	public static void main(String[] args) {
		/*They are many execptions in selenium and can be caught using try catch block
		 * all the exceptions can be caught using catch(exeception e) below is an example of NoSuchElementException 
		 * */
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		try{ // actual id = search_query_top
			driver.findElement(By.id("query_top")).sendKeys("this will not work");
		}
		catch(NoSuchElementException e)
		{
		System.out.println( "execption found and caught. This way it will not stop the execution of the program");	
		}
		driver.close();
	}
	
}
