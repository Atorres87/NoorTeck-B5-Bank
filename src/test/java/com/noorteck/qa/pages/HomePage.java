package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	@FindBy(xpath = "//*[text() = 'Transfer']")
	WebElement clickTransfer;

	@FindBy(xpath = "//*[text() = 'Loans']")
	WebElement clickLoan;

	@FindBy(xpath = "//*[text() = 'LogOut']")
	WebElement clickLogOut;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickTransfer() {
		click(clickTransfer);
	}

	public void clickLoan() {
		click(clickLoan);
	}

	public void clickLogOut() {
		click(clickLogOut);
	}

}
