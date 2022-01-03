package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class TransferPage extends CommonUI{

	
	@FindBy(xpath = "//*[@class = mat-select-placeholder ng-tns-c12-2 ng-star-inserted")
	WebElement originAccount;
	
	@FindBy(xpath = "//*[@class = 'mat-select-placeholder ng-tns-c12-4 ng-star-inserted']")
	WebElement destinationAccount;
	
	@FindBy(css = "#mat-input-0")
	WebElement totalAmount;
	
	@FindBy(css ="#mat-input-1")
	WebElement enterSsNumber;
	
	@FindBy(css ="#mat-input-2")
	WebElement atmPin;
	
	@FindBy(xpath ="//*[text()= 'Transfer Funds']")
	WebElement clickTransferFund;
	
	//need successful message
	
	public TransferPage() {
		PageFactory.initElements(driver, this);
	}
	public void enterOrigenAccount(String account) {
		enter(originAccount, account);
	}
	public void enterDestinationAccount(String account) {
		enter(destinationAccount, account);
	}
	public void enterAmount(String amount) {
		enter(totalAmount, amount);
	}
	public void enterSsNumber(String ssNumber) {
		enter(enterSsNumber, ssNumber);
	}
	public void enterPin(String Pin) {
		enter(atmPin, Pin);
	}
	public void clickTransferFund() {
		click(clickTransferFund);
	}
	
	
	
	
	
	
	
	
	
	
}
