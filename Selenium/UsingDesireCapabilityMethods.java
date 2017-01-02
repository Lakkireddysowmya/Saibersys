package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UsingDesireCapabilityMethods {
public static void main(String[] args) {
	// download IEdriver server from http://www.seleniumhq.org/download/
	// for chrome desiredcapabilities.chorme();
	DesiredCapabilities desirecapabilities = DesiredCapabilities.internetExplorer();
	 //setting the browser name 
	desirecapabilities.setBrowserName("IE");
	desirecapabilities.getBrowserName();
	String version =desirecapabilities.getVersion();
	System.out.println("version of the IE using: "+version);
	//setting version
	 //desirecapabilities.setVersion(<version name goes here");
	//
	System.setProperty("webdriver.ie.driver","C:\\selenium\\IEDriverServer.exe");
	
	WebDriver driver = new InternetExplorerDriver(desirecapabilities);
	driver.get("http://automationpractice.com/index.php");
	
	driver.close();
	
}

}
