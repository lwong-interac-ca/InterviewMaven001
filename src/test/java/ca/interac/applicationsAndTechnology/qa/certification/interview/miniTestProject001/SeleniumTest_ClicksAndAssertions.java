package ca.interac.applicationsAndTechnology.qa.certification.interview.miniTestProject001;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Using Selenium Webdriver, do the following task on the Interac website
 * (https://www.interac.ca):
 * 
 * Create a script to ensure that "Tier 2" flat-fee per transaction for
 * "Contactless Payment Interchange Structure" is $0.025. For the purposes
 * of this exercise, please use Selenium to navigate to the Fees page, linked
 * to at the bottom of the Interac homepage. 
 * 
 * To aid in rapid root-cause analysis of test failures, logging of the
 * appropriate level is encouraged. Screenshots may also be taken.
 * 
 * The test case should reasonably favour false-positive (thus, the logging
 * requirement above) over false-negative.
 */
public class SeleniumTest_ClicksAndAssertions {
	
	private WebDriver webdriver = null;
	private Logger logger = LogManager.getFormatterLogger();
	
	@BeforeClass
	public void beforeClass() {
		logger.atDebug().log("Test class starting %s", SeleniumTest_ClicksAndAssertions.class.getCanonicalName());
	}

	@AfterClass
	public void afterClass() {
		logger.atDebug().log("Test class ended %s", SeleniumTest_ClicksAndAssertions.class.getCanonicalName());
	}

	@BeforeMethod
	public void beforeMethod() {
		
	}

	@AfterMethod
	public void afterMethod() {
		
	}
	
	@BeforeTest
	public void beforeTest() {
		
	}

	@AfterTest
	public void afterTest() {
		
	}
	
	@Test
	public void test() {
		
	}
	

}
