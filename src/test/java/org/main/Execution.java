package org.main;

import java.awt.AWTException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPageAdactin;
import org.pojo.PageFourDetails;
import org.pojo.PageThreeDetails;
import org.pojo.PageTwoDetails;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utils.BaseClass;

import net.bytebuddy.implementation.bytecode.constant.SerializedConstant;

public class Execution extends BaseClass {

	public LoginPageAdactin a;
	public PageTwoDetails a2;
	public PageThreeDetails a3;
	public PageFourDetails a4;
	@BeforeClass
	private void browserLaunch() {
		launchChromeBrowser();
		launchUrl("https://adactinhotelapp.com/index.php");
		maxWindow();
	}
//
//	@AfterClass
//	private void browserEnd() throws InterruptedException {
//		Thread.sleep(2000);
//		closeBrowser();
//	}

	@Parameters({ "username", "password" })
	@Test(groups = "smoke")
	private void testCase1(String user, String pass) {
		ImpliciteWait();
		a = new LoginPageAdactin();
		enterText(a.getLoginUserNameAda(), user);
		enterText(a.getLoginPassAda(), pass);
		toClick(a.getSubmitBtnAda());
	}
	
	@Test
	private void testCase2() {
		ImpliciteWait();
		a2=new PageTwoDetails();
		selectDropDown(a2.getLocationDropDown(), 2);
	
		
		
//		
//	}
//	
//	
//	@Test(groups = { "smoke", "sanity" })
//	private void testCase23()throws InterruptedException, AWTException {
//		ImpliciteWait();
//		a2 = new PageTwoDetails();
//		selectDropDown(a2.getLocationDropDown(), 3);
//		selectDropDownByText(a2.getHotelDropDownBtn(), "Hotel Sunshine");
//		selectDropDown(a2.getRoomDropDownBtn(), 2);
//		selectDropDown(a2.getNumberDropDownBtn(), 3);
//
//		tab();
//		selectAndDelete();
//		enterText(a2.getCheckInDate(), "18/08/2021");
//		tab();
//		selectAndDelete();
//		enterText(a2.getCheckOutDate(), "21/08/2021");
//
//		selectDropDown(a2.getAdultDropDownBtn(), 2);
//		selectDropDown(a2.getChildDropDownBtn(), 2);
//
//		Thread.sleep(2000);
//
//		toClick(a2.getSearchBtn());
//	}
//
//	@Test
//	private void testCase3() {
//		ImpliciteWait();
//		a3=new PageThreeDetails();
//		toClick(a3.getRadioBtn());
//		toClick(a3.getContinueBtn());
//	}
//
//	@Test()
//	private void testCase4() throws InterruptedException {
//		ImpliciteWait();
//		a4=new PageFourDetails();
//		enterText(a4.getFirstName(), "Ayupkhan");
//		enterText(a4.getLastName(), "j");
//		enterText(a4.getBillingAddress(), "Chennai");
//		enterText(a4.getCreditCordNumber(), "1234432112344321");
//		selectDropDown(a4.getCordType(), 2);
//		selectDropDown(a4.getExpDateMonth(), 2);
//		selectDropDown(a4.getExpDateYear(), 2);
//		enterText(a4.getCvvNumber(), "654");
//		
//		Thread.sleep(2000);
//		toClick(a4.getConfirmBtn());
//		
	}
	
	}
	
	
