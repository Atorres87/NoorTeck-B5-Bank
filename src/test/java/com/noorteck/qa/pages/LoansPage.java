package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class LoansPage extends CommonUI {

	@FindBy(css = "#mat-input-3")
	WebElement enterName;

	@FindBy(css = "#mat-input-4")
	WebElement enterAddress;

	@FindBy(xpath = "//mat-select[@id='mat-select-2']")
	WebElement selectLoanType;

	@FindBy(css = "#mat-input-5")
	WebElement enterYearsToPayLoan;

	@FindBy(xpath = "//*[@class='mat-button']")
	WebElement clickNext;

	@FindBy(css = "#mat-input-6")
	WebElement enterAmount;

	@FindBy(css = "#mat-input-7")
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
	WebElement clickReset;;

	public LoansPage() {
		PageFactory.initElements(driver, this);

	}

	public void enterName(String name) {
		enter(enterName, name);
	}

	public void enterAddress(String address) {
		enter(enterAddress, address);
	}

	public void chooseFromDropdown(String methodName, String indexValue) {
		selectFromDropdown(selectLoanType,methodName, indexValue);
	}

	public void yearsToPayLoan(String yearsToPay) {
		enter(enterYearsToPayLoan, yearsToPay);
	}

	public void firstNext() {
		click(clickNext);
	}

	public void provideAmount(String amount) {
		enter(enterAmount, amount);
	}

	public void motherMaidenName(String madenName) {
		enter(entermotherMaidenName, madenName);
	}

	public void SocialNumber(String social) {
		enter(enterSsNumber, social);
	}

	public void secondNext() {
		click(clickNextButton);
	}

	public void clickBack() {
		click(clickBack);
	}

	public void confirm() {
		click(clickConfirm);
	}

	public void backButton() {
		click(clickBackbutton);
	}

	public void reset() {
		click(clickReset);
	}

}
