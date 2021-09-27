package com.register.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.search.test.SearchNotFound;

public class PersonalInfoRegisterTest {
	private WebDriver driver;
	PersonalInformationRegister personalInformationRegister;
	
	@Before
	public void setUp() throws Exception {
		personalInformationRegister = new PersonalInformationRegister(driver);
		driver = personalInformationRegister.chromeDriverConnection();
		personalInformationRegister.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		personalInformationRegister.requiredFields();
		assertEquals("There are 3 errors", personalInformationRegister.ErrorAnswer());
	}

}
