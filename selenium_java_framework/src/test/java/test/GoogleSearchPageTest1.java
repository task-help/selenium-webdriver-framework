package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObject;

public class GoogleSearchPageTest1 {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearchTest();
		
	}

	public static void googleSearchTest() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		GoogleSearchPageObject SearchPageObject = new GoogleSearchPageObject(driver);
		
		driver.get("https://www.google.com/");
		
		SearchPageObject.setTextInSearchBox("Automation");
		SearchPageObject.submitSearch();
		
		driver.close();
	}
}