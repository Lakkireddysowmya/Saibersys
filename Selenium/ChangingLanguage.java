package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class ChangingLanguage {
//******this doesn't work for internet explorer 
public static void main(String[] args) {
	//for Firefox
	
	FirefoxProfile fireFoxProfile = new FirefoxProfile();
	// setting language to telugu using firefoz profile
	fireFoxProfile.setPreference("intl.accept_languages", "te");
	WebDriver driver = new FirefoxDriver(fireFoxProfile);
	driver.get("https://www.facebook.com/");
	
}
}
