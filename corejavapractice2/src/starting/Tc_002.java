package starting;

import org.apache.log4j.Logger;

public class Tc_002 extends BaseTest 
{ 
	private static final Logger Log=Logger.getLogger(Tc_002.class);
	
	public static void main(String[] args) throws Exception
	{ 
		
        init();
        Log.info("-----started Tc-002-----");
        Log.info("initialising the dependency files ....");
        
		
		launch("chromebrowser");
		Log.info("opening the browser:-"+p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		Log.info("Navigated to:-"+childProp.getProperty("amazonurl"));
		
		selectOption("amazondropdown_id","Books");
		Log.info("selected the option books by using the Locater:-"+orprop.getProperty("amazondropdown_id"));
		
		type("amazonsearchtext_name","Harry Potter");
		Log.info("Entered the test Harry Potter by using locater:-"+orprop.getProperty("amazonsearchtext_name"));
		
		clickElement("amazonsearchbutton_xpath");
		Log.info("click on search button by using locater:-"+orprop.getProperty("amazonsearchbutton_xpath"));
		Log.info("-----Ended Tc_002-----");
		
		
	}

}
