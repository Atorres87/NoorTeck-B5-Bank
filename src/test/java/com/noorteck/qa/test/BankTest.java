package com.noorteck.qa.test;

import org.testng.asserts.SoftAssert;

import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.TransferPage;
import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class BankTest extends ObjInitialize {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://usdemo.vee24.com/#/transactions";

		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		BankCaseOne();
		BankCaseTwo();

		CommonUI.quitBrowser();

	}

	public static void BankCaseOne() throws InterruptedException {
		HomePage homeObj = new HomePage();
		SoftAssert softAssert = new SoftAssert();
		homeObj.clickTransfer();
		Thread.sleep(2000);
		TransferPage transferObj = new TransferPage();

	    //transferObj.clickOriginAccount();
		//transferObj.selectOriginAccount();
		// transferObj.enterDestinationAccount("Investing");
		transferObj.enterAmount("1000");
		transferObj.enterSsNumber("78945612");
		transferObj.enterPin("1234");
		
		String expectedText = "Success! Funds successfully transferred.";
		String actualText = "Success! Funds successfully transferred.";

		softAssert.assertEquals(expectedText, actualText);
		Thread.sleep(1000);
	}

	public static void BankCaseTwo() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		homeObj.clickLoan();
		loansObj.enterName("John Cena");
		loansObj.enterAddress("123 Java drive");

		//loansObj.chooseFromDropdown("Value","Retirement");
		
		loansObj.yearsToPayLoan("2");
	
		loansObj.firstNext();
		loansObj.provideAmount("5000");
		loansObj.motherMaidenName("Kim");
		loansObj.SocialNumber("123456778");
		loansObj.secondNext();
		loansObj.confirm();

		String expectedText = "Submission Success";
		String actualText = "Submission Success";
		softAssert.assertEquals(expectedText, actualText);
		Thread.sleep(2000);

		softAssert.assertAll();

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