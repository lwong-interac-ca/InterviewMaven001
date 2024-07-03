package ca.interac.applicationsAndTechnology.qa.certification.interview.miniTestProject001;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Using any tool/library of your choice please perform the following:
 * 
 * Perform a HTTP GET request against https://dummyjson.com/todos, and
 * write one or more tests to assert the following:
 * 1) A JSON response was received
 * 2) "Watch a classic movie" is one of the todo items
 * 3) Each user (identified by userId) has only one todo item. If failed,
 * 		all the user's todo items should be reported along with the userid
 * 
 * To aid in rapid root-cause analysis of test failures, logging of the
 * appropriate level is encouraged. Screenshots may also be taken.
 * 
 * The test case should reasonably favour false-positive (thus, the logging
 * requirement above) over false-negative.
 */
public class RESTTest_GetAndAssertions {
	
	private Logger logger = LogManager.getFormatterLogger();
	
	@BeforeClass
	public void beforeClass() {
		logger.atDebug().log("Test class starting %s", RESTTest_GetAndAssertions.class.getCanonicalName());
	}

	@AfterClass
	public void afterClass() {
		logger.atDebug().log("Test class ended %s", RESTTest_GetAndAssertions.class.getCanonicalName());
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
