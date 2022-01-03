package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class LoansPage extends CommonUI {

	@FindBy(css = "#mat-input-3")
	WebElement enterName;

	@FindBy(css = "mat-input-4")
	WebElement enterAddress;

	@FindBy(xpath = "//*[@class='mat-select-placeholder ng-tns-c12-12 ng-star-inserted']")
	WebElement selectLoanType;

	@FindBy(css = "#mat-input-5")
	WebElement enterYearsToPayLoan;

	@FindBy(xpath = "//*[@class='mat-button']")
	WebElement clickNext;

	@FindBy(css = "#mat-input-6")
	WebElement enterAmount;

	@FindBy(css = "mat-input-7")
	WebElement entermotherMaidenName;

	@FindBy(css = "#mat-input-8")
	WebElement enterSsNumber;

	@FindBy(xpath = "//*[text()='Next']")
	WebElement clickNextButton;

	@FindBy(xpath = "//*[text()='Back']")
	WebElement clickBack;

	@FindBy(xpath = "//*[text()='Confirm']")
	WebElement clickConfirm;

	@FindBy(xpath = "//*[text()='Back']")
	WebElement clickBackbutton;

	@FindBy(xpath = "//*[text()='Reset']")
	WebElement clickReset;

	public LoansPage() {
		PageFactory.initElements(driver, this);

	}

	public void enterName(String name) {
		enter(enterName, name);
	}
	public void enterAddress(String address) {
		enter(enterAddress, address);
	}
	
	
	
	
	
	
	
	
	
	
	
}