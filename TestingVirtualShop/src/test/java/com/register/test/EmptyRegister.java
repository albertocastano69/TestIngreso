package com.register.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.search.test.Base;

public class EmptyRegister extends Base{
	By sign = By.className("login");
	By email = By.id("email_create");
	By BtnCreate = By.id("SubmitCreate");
	By RadioButton1 = By.id("id_gender1");
	By FristName = By.id("customer_firstname");
	By LastName = By.id("customer_lastname");
	By password = By.id("passwd");
	By dropdownListDays = By.name("days");
	By dropDownListMonth = By.name("months");
	By dropDownListYear = By.name("years");
	By Company = By.id("company");
	By Address = By.id("address1");
	By City = By.id("city");
	By State = By.name("id_state");
	By PostalCode = By.id("postcode");
	By Contry = By.name("id_country");
	By Ainformation = By.id("other");
	By HomePhone = By.id("phone");
	By MobilePhone = By.id("phone_mobile");
	By AddressAlias = By.id("alias");
	By errorList = By.xpath("//*[@id=\"center_column\"]/div/p");
	By BtnRegister = By.id("submitAccount");
	

	public EmptyRegister(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void EmptyrequiredFields() throws InterruptedException {
		if (isDisplayed(sign)) {
			click(sign);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(BtnCreate));
			type("julio@gmail.com", email);
			click(BtnCreate);
			wait.until(ExpectedConditions.presenceOfElementLocated(BtnRegister));
			click(BtnRegister);
			
		} else {
			System.out.println("NO FIELD FOUND");

		}
		
	}
	
	public String ErrorAnswer() {
		return getText(errorList);
	}

}
