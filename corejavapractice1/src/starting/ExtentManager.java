package starting;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager extends BaseTest
{
	public static ExtentReports report;
	public static ExtentReports getInstance()
	{
		if(report==null)
		{
			report= new ExtentReports(projectpath+"//HtmlReports//htmlreport.html");
			report.loadConfig(new File(projectpath+"//exentreportconfig.xml"));
			report.addSystemInfo("selenium language binding","3.141.59").addSystemInfo("Environment", parentProp.getProperty("env"));
		}
		return report;
		
		
	}
}	
	
	
