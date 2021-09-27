package com.search.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmptySearch extends Base {

	By Search = By.id("search_query_top");
	By Btnsearch = By.xpath("//*[@id=\"searchbox\"]/button");
	By AlertText = By.xpath("//*[@id=\"center_column\"]/p");
	By countResult = By.className("heading-counter");
	
	
	
	public EmptySearch(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void checkSearch() {
		if (isDisplayed(Search)) {
			type("", Search);
			click(Btnsearch);
			WebDriverWait wait = new WebDriverWait(driver, 7);
			wait.until(ExpectedConditions.presenceOfElementLocated(AlertText));
			
		
			
		}else {
			System.out.println("Search was not found");
		}
		
	}
	
	public String SearchAnswer() {
		return getText(AlertText);
		
	}
}
