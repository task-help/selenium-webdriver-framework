package test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportTestNG {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test1;
	private static WebDriver driver = null;

	@BeforeSuite
	public void setUp() {
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);



	}

	@BeforeTest
	public void setUpTest() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}


	@Test
	public void test1() throws Exception {
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

		driver.get("https://google.com");
		test.pass("Navigated to google.com");

		test.log(Status.INFO, "This step shows usage of log(status, details)");


		test.info("This step shows usage of info(details)");


		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());


		test.addScreenCaptureFromPath("screenshot.png");


	}
	@AfterTest
	public void tearDownTest() {
		driver.quit();
		driver.close();
		System.out.println("Test completed successfully");
	}



	@AfterSuite
	public void tearDown() {

		extent.flush();

	}
}
