package pack1;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NoSendkeys {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://automationpractice.com/index.php?controller=contact");
	JavascriptExecutor javaex = (JavascriptExecutor)driver;	
	javaex.executeScript(	"document.getElementById('email').value='lavanya';");
	
	
	}
	
}
