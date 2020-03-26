package allTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage {

	MasterTest instance= MasterTest.getIntstance();


	@Test
	public void validateTitle() {
		instance.getTaxi("chrome");
		instance.getHomePage().url();
		String title = instance.getHomePage().getTitle();

		//System.out.println(title);

		Assert.assertEquals(title, "Target : Expect More. Pay Less.");
	}

	@Test
	public void ValidateSearching() throws InterruptedException {
		instance.getTaxi("firefox");	
		instance.getHomePage().url();
		instance.getHomePage().searching();
		
		Thread.sleep(2000);
		String result= instance.getHomePage().searchResult();
		
		System.out.println(result);
		
		
		Assert.assertEquals(result, "computer");
		
	}







	@AfterClass
	public void coolOff() {

		instance.taxi.close();
	}
}
