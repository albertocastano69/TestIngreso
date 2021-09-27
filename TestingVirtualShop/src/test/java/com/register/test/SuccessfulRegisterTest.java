package com.register.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SuccessfulRegisterTest {
	private WebDriver driver;
	SuccessfulRegister successfulRegister;
	
	
	@Before
	public void setUp() throws Exception {
		successfulRegister = new SuccessfulRegister(driver);
		driver = successfulRegister.chromeDriverConnection();
		successfulRegister.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		successfulRegister.requiredFields();
		assertEquals("There are 3 errors", successfulRegister.SuccessAnswer());
		
	}

}
