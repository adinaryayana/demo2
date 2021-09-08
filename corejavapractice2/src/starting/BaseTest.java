package starting;


import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest {
	public static WebDriver Driver;
	public static String projectpath=System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties parentProp;
	public static Properties childProp;
	public static Properties orprop;
	public static ExtentReports report;
	public static ExtentTest test;


	
	public static void init() throws Exception
	{
	    
		fis=new FileInputStream(projectpath+ "/data.properties");
		p=new Properties();
		p.load(fis);
		
		fis=new FileInputStream(projectpath+"/environment.properties");
		parentProp=new Properties();
		parentProp.load(fis);
		String e = parentProp.getProperty("env");
		System.out.println(e);
		
		fis=new FileInputStream(projectpath+"/"+e+".properties");
		childProp=new Properties();
		childProp.load(fis);
		String value = childProp.getProperty("amazonurl");
		System.out.println(value);
		
		fis=new FileInputStream(projectpath+"/or.properties");
		orprop=new Properties();
		orprop.load(fis);
		
		fis=new FileInputStream(projectpath+"/Log4jconfig.properties");
		PropertyConfigurator.configure(fis);
		
		report=ExtentManager.getInstance();
	}
	
	public static void launch(String browser)
	{
		
		if(p.getProperty(browser).equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\jars\\chromedriver_win32/chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\Hari\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3");
			Driver=new ChromeDriver(option);
			
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\jars\\geckodriver-v0.27.0-win64/geckodriver.exe");
			Driver=new FirefoxDriver();
		}
	}
	public static void navigateUrl(String url)
	{
		Driver.get(childProp.getProperty(url));
	}
	
	public static void clickElement(String locatorKey) {
		//Driver.findElement(By.xpath(locater)).click();
		//Driver.findElement(By.xpath(orprop.getProperty(locaterKey))).click();
		
		getElement(locatorKey).click();
		
	}

	

	public static void type(String locatorKey, String text) {
		//Driver.findElement(By.name(locater)).sendKeys(text);
		//Driver.findElement(By.name(orprop.getProperty(locatorKey))).sendKeys(text);
		getElement(locatorKey).sendKeys(text);

		
	}

	public static void selectOption(String locatorKey, String item) {
		//Driver.findElement(By.id(locater)).sendKeys(item);
		//Driver.findElement(By.id(orprop.getProperty(locatorKey))).sendKeys(item);
		getElement(locatorKey).sendKeys(item);
	
	}
	

	public static WebElement getElement(String locatorKey)
	{
		WebElement element=null;
		
		if(locatorKey.endsWith("_id"))
		{
			element=Driver.findElement(By.id(orprop.getProperty(locatorKey)));
			
		}
		else if(locatorKey.endsWith("_name"))
		{
			element=Driver.findElement(By.name(orprop.getProperty(locatorKey)));
			
		}
		else if(locatorKey.endsWith("_classname"))
		{
			element=Driver.findElement(By.className(orprop.getProperty(locatorKey)));
		}
		else if(locatorKey.endsWith("_xpath"))
		{
			element=Driver.findElement(By.xpath(orprop.getProperty(locatorKey)));
		}
		else if(locatorKey.endsWith("_cssSelector"))
		{
			element=Driver.findElement(By.cssSelector(orprop.getProperty(locatorKey)));
		}
		else if(locatorKey.endsWith("_linkText"))
		{
			element=Driver.findElement(By.linkText(orprop.getProperty(locatorKey)));
		}
		else if(locatorKey.endsWith("_partiallinkText"))
		{
			element=Driver.findElement(By.partialLinkText(orprop.getProperty(locatorKey)));
		}
		
			return element;
		
		
	}

	
	}




