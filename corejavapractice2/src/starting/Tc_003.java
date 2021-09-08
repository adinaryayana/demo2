package starting;

import com.relevantcodes.extentreports.LogStatus;

public class Tc_003 extends BaseTest
{
	public static void main(String[] args) throws Exception
	{
		init();
		test=report.startTest("Tc_003");
        test.log(LogStatus.INFO ,"-----started Tc_003-----");
        test.log(LogStatus.INFO,"initialising the dependency files ....");
        
		
		launch("chromebrowser");
		test.log(LogStatus.PASS,"opening the browser:-"+p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO,"Navigated to:-"+childProp.getProperty("amazonurl"));
		
		selectOption("amazondropdown_id","Books");
		test.log(LogStatus.FAIL,"selected the option books by using the Locater:-"+orprop.getProperty("amazondropdown_id"));
		
		type("amazonsearchtext_name","Harry Potter");
		test.log(LogStatus.INFO,"Entered the test Harry Potter by using locater:-"+orprop.getProperty("amazonsearchtext_name"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.ERROR,"click on search button by using locater:-"+orprop.getProperty("amazonsearchbutton_xpath"));
		
		test.log(LogStatus.INFO,"-----Ended Tc_002-----");
		
		report.endTest(test);
		report.flush();
		
		
	}
	

}
