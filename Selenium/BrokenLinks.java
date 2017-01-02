package pack1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {
public static void main(String[] args) throws IOException {
	int workingLinks =0;
	int nonWorkingLinks =0;
	WebDriver driver = new FirefoxDriver();
	driver.get("http://facebook.com");
	//storing all the existing links using tagname "a"
	List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
	
	for(WebElement e : listOfLinks)
	{
		//getting the URl and saving in URL class
		URL u = new URL(e.getAttribute("href"));
		//opening each connection
	HttpURLConnection urlconnection = (HttpURLConnection)u.openConnection();
	urlconnection.connect();
	// 200 is the Http response when links work fine 
	if(urlconnection.getResponseCode()==200)
	{
		workingLinks++; //increasing the count when link works
	}
	else
	{
		nonWorkingLinks++; //increasing the count when link fails
	}
	urlconnection.disconnect();
	}
	
	System.out.println("Total Number of Links: "+listOfLinks.size());
	System.out.println("No of working links: "+workingLinks);
	System.out.println("No of non working Links: "+nonWorkingLinks);
	driver.close();
	
	
	
	
}
}
