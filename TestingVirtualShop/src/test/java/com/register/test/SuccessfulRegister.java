package com.register.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.search.test.Base;

import bsh.org.objectweb.asm.Type;

public class SuccessfulRegister extends Base {
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
	By success = By.xpath("//*[@id=\"center_column\"]/h1");
	By BtnRegister = By.id("submitAccount");
	public SuccessfulRegister(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void requiredFields() throws InterruptedException {
		if (isDisplayed(sign)) {
			click(sign);
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.presenceOfElementLocated(BtnCreate));
			type("julio@gmail.com", email);
			click(BtnCreate);
			wait.until(ExpectedConditions.presenceOfElementLocated(BtnRegister));
			click(RadioButton1);
			type("Julio", FristName);
			type("Jaramillo", LastName);
			type("Abc123", password);
			SelectDropDownListDays();
			SelectDropDownListMoth();
			SelectDropDownListYear();
			type("ING", Company);
			type("CALLE96#98-25", Address);
			type("Pasadena", City);
			SelectDropDownListState();
			type("00000", PostalCode);
			SelectDropDownListCountry();
			type("3636359", Ainformation);
			type("365857", HomePhone);
			type("3012569658", MobilePhone);
			type("home", AddressAlias);
			click(BtnRegister);

		} else {
			System.out.println("NO FIELD FOUND");

		}

	}
	
	public String SelectDropDownListDays() {
		WebElement dropdownList = findElement(dropdownListDays);
		List<WebElement> options = dropdownList.findElements(By.xpath("option"));
		for (int i = 0; i < options.size(); i++) {
			if (getText(options.get(i)).equals("2  ")) {
				click(options.get(i));
			}
		}

		String selectedOptions = "";
		for (int i = 0; i < options.size(); i++) {
			if (options.get(i).isSelected())
				selectedOptions = getText(options.get(i));
			
		}
		return selectedOptions;
	}
	
	public String SelectDropDownListMoth() {
		Select selectList = new Select(findElement(dropDownListMonth));
		selectList.selectByVisibleText("April ");
		return getText(selectList.getFirstSelectedOption());
	}
	
	public String SelectDropDownListYear() {
		Select selectList = new Select(findElement(dropDownListYear));
		selectList.selectByVisibleText("2004  ");
		return getText(selectList.getFirstSelectedOption());
	}
	
	public String SelectDropDownListState() {
		Select selectList = new Select(findElement(State));
		selectList.selectByVisibleText("California");
		return getText(selectList.getFirstSelectedOption());
	}
	
	public String SelectDropDownListCountry() {
		Select selectList = new Select(findElement(Contry));
		selectList.selectByVisibleText("United States");
		return getText(selectList.getFirstSelectedOption());
	}
	
	public String SuccessAnswer() {
		return getText(success);
	
	}

}
