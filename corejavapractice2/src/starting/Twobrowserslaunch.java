package starting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Twobrowserslaunch {
	public static void main(String[] args) {
		WebDriver Driver;
		System.setProperty("webdriver.chrome.driver", "E:\\jars\\chromedriver_win32/chromedriver.exe");
		 Driver=new ChromeDriver();
		Driver.get("https://www.google.com/");
		
		System.setProperty("webdriver.gecko.driver", "E:\\jars\\geckodriver-v0.27.0-win64/geckodriver.exe");
		 Driver=new FirefoxDriver();
		Driver.get("https://www.amazon.in/");
		
		
	}

}
