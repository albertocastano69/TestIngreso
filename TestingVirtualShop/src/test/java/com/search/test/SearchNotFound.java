package com.search.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bsh.org.objectweb.asm.Type;

public class SearchNotFound extends Base{

	By Search = By.id("search_query_top");
	By Btnsearch = By.xpath("//*[@id=\"searchbox\"]/button");
	By AlertText = By.xpath("//*[@id=\"center_column\"]/p");
	By countResult = By.className("heading-counter");
	
	public SearchNotFound(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void checkSearch() {
		if (isDisplayed(Search)) {
			type("perro", Search);
			click(Btnsearch);
			WebDriverWait wait = new WebDriverWait(driver, 7);
			wait.until(ExpectedConditions.presenceOfElementLocated(AlertText));
			
		
			
		}else {
			System.out.println("Search was not found");
		}
		
	}
	
	public String SearchAnswer() {
		assertEquals(driver.findElement(AlertText).getText(), "No results were found for your search \"perro\"");
		return getText(AlertText);
		
	}

}
