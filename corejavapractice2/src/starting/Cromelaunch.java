package starting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cromelaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\jars\\chromedriver_win32/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.google.com/");
	}

}
