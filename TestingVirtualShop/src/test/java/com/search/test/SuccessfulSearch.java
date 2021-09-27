package com.search.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuccessfulSearch extends Base{

	By Search = By.id("search_query_top");
	By Btnsearch = By.xpath("//*[@id=\"searchbox\"]/button");
	By AlertText = By.className("alert alert-warning");
	By countResult = By.cssSelector("span.heading-counter");
	
	public SuccessfulSearch(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void checkSearch() {
		if (isDisplayed(Search)) {
			type("T-shirt", Search);
			click(Btnsearch);
			WebDriverWait wait = new WebDriverWait(driver, 7);
			wait.until(ExpectedConditions.presenceOfElementLocated(countResult));
			
		
			
		}else {
			System.out.println("Search was not found");
		}
		
	}
	
	public String SearchAnswer() {
		assertEquals(driver.findElement(countResult).getText(), "1 result has been found.");
		return getText(countResult);
		
	}

}
