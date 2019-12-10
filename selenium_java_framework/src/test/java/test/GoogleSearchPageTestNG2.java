package test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObject;

public class GoogleSearchPageTestNG2 {

	private static WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}

	
	@Test
	public  void googleSearchTest2() {



		GoogleSearchPageObject SearchPageObject = new GoogleSearchPageObject(driver);

		driver.get("https://www.google.com/");

		SearchPageObject.setTextInSearchBox("Automation");
		SearchPageObject.submitSearch();

		
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.quit();
		driver.close();
		System.out.println("Test completed successfully");
	}
}