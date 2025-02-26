package ecommerce;

import org.testng.annotations.Test;

public class GetMethods extends BaseClass {

	@Test
	public void testData() {

		// Get the Title

		String Title_of_the_page = driver.getTitle();
	    System.out.println("Title_of_the_page:" + Title_of_the_page);
	    
	    //Get the url of the page
	    
	    String URL_of_the_Page=driver.getCurrentUrl();
	    System.out.println("URL_Of_the_page:" +URL_of_the_Page);
	    
	    //return page source
	    
	    String page_url=driver.getPageSource();
	   // System.out.println("Page_URL_of_the_page:" +page_url);
	    

	}
	
	@Test
	public void conditionStatement() {
		//isSelected 
		//isEnabled
		//isDisplayed
		
	}
	
	@Test
	public void Browser_methods() {
		driver.quit();
		driver.close();
	}
	
	
}
