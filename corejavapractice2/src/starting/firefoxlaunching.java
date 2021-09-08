package starting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxlaunching {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\jars\\geckodriver-v0.27.0-win64/geckodriver.exe");
		WebDriver Driver=new FirefoxDriver();
		Driver.get("https://www.amazon.in/");
		
		
		
	}

}
