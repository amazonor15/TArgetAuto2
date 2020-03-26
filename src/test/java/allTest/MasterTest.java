package allTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import allPages.HomePage;

public class MasterTest {

	private static MasterTest intstance;

	WebDriver taxi;	
	
	 HomePage fromMH;
	
	private MasterTest(){

	}

	public WebDriver getTaxi(String driverValue) {
		
		if (taxi==null) {
			if (driverValue.contains("chrome")) {
				System.setProperty("webdriver.chrome.driver", "/Users/shahid2/eclipse-workspace/TargetAuto2/Browser/chromedriver");
				taxi=new ChromeDriver();
			} else if (driverValue.contains("firefox")) {
				System.setProperty("webdriver.gecko.driver", "/Users/shahid2/eclipse-workspace/TargetAuto2/Browser/geckodriver");
				taxi=new FirefoxDriver();
			}
		}
		
		return taxi;
		
	}

	public static  MasterTest getIntstance() {

		if (intstance==null) {
			intstance=new MasterTest();
		}	
		return intstance;

	}


	public HomePage getHomePage() {

		if (fromMH==null) {
			fromMH=new HomePage(taxi);
		}	
		return fromMH;

	}





}
