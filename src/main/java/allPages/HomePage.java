package allPages;



import org.openqa.selenium.WebDriver;

public class HomePage extends MasterPage{

	String searchBar="//input[@id='search']";
	String resultofSearch="//span[text()='computer']";
	                       //span[text()='computer']
	
	public HomePage(WebDriver taxi) {
		super(taxi);
		
	}

	
	public void url() {
		getURL("https://www.target.com/");
	}
	

	public String getTitle() {
		return taxi.getTitle();
		
	}
	
	
	public void searching() {
		typeElement(searchBar, "computer");
	}
	
	
	
	public String searchResult() {
		return getText(resultofSearch);
		
	}
	
	

}
