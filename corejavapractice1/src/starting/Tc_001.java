package starting;


public class Tc_001 extends BaseTest
{
			
	public static void main(String[] args) throws Exception
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		selectOption("amazondropdown_id","Books");
		
		type("amazonsearchtext_name","Harry Potter");
		
		clickElement("amazonsearchbutton_xpath");
		
		
		//Driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		//Driver.findElement(By.name("url")).sendKeys("harry porter");
		//Driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		//selectOption("searchDropdownBox","Books");
		//type("url","harry portter");
		//clickElement("//select[@id='searchDropdownBox']");
		
		
	}

	
}
