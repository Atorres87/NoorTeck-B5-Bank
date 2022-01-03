package com.noorteck.qa.test;

import com.noorteck.qa.pages.LoansPage;
import com.noorteck.qa.pages.TransferPage;
import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class BankTest extends ObjInitialize {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://usdemo.vee24.com/#/transactions";

		CommonUI UIObj = new CommonUI();
		ObjInitialize Obj = new ObjInitialize();
		BankTest bankObj = new BankTest();
		LoansPage loansObj = new LoansPage();
		TransferPage transferObj = new TransferPage();

		UIObj.openBrowser("chrome");

		UIObj.navigate(url);

		bankObj.BankCaseTwo();

		UIObj.quitBrowser();

	}

	public void BankCaseOne() throws InterruptedException {

		transferObj.clickTransferFund();
		transferObj.selectOriginAccount("Rainy Day");
		transferObj.enterDestinationAccount("Investing");
		transferObj.enterAmount("1000");
		transferObj.enterSsNumber("78945612");
		transferObj.enterPin("1234");

		String expectedText = "Success! Funds successfully transferred.";
		String actualText = "Success! Funds successfully transferred.";
		if (actualText.contains(expectedText)) {
			System.out.println("Text verified");
		} else {
			System.out.println("wrong Test");
		}
	}

	public void BankCaseTwo() throws InterruptedException {

		homeObj.clickLoan();
		loansObj.enterName("John Cena");
		loansObj.enterAddress("5050 nw 50 st");
		loansObj.selectLoanType("Retirement");
		loansObj.yearsToPayLoan("2");
		loansObj.firstNext();
		loansObj.provideAmount("5000");
		loansObj.motherMaidenName("Java");
		loansObj.SocialNumber("12345678");
		loansObj.secondNext();
		loansObj.confirm();

		String expectedText = "Submission Success";
		String actualText = "Submission Success";
		if (actualText.contains(expectedText)) {
			System.out.println("Text verified");
		} else {
			System.out.println("wrong Test");

		}

	}
}

/**
 * -------------------------------------- INSTRUCTIONS
 * --------------------------------------------
 * 
 * ---> Create JAVA CLASS for each page of the application ---> Inspect the
 * elements and store the values ---> Create the class constructor ---> Create
 * the methods
 * 
 * ---> DONT FORGET ***** EACH PAGE CLASS SHOULD INHERIT CommonUI Class
 * ******************* ---> DONT FORGET ***** DECLARE PAGE CLASS OBJECT in
 * CONSTANTS CLASS ******************* ---> DONT FOGET ***** INITIALIZE PAGE
 * CLASS OBJECTS IN ObjInitialize JAVA ClASS ******************* ---> DONT FOGET
 * ***** CHANGE JAVA VERSION TO 1.8 *******************
 * 
 * 
 * 
 * ---> For each test case create a method then call those methods from main
 * method. ---> DONT FORGET ***** Refer to the INSTRUCTION PDF file for the test
 * cases to automate **************
 * 
 * ---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
 * ---> Once pushed add US to the project then send picture in MENTORS GROUP
 * CHAT Crystal: --> Koritzerc23@gmail.com Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com Fahim: --> NTKBatch5
 * 
 * 
 */