package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utils.BaseClass;

public class PageFourDetails extends BaseClass{
	
	public PageFourDetails() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="//input[@name='first_name']"),@FindBy(id="first_name"),@FindBy(xpath="(//input[@type='text'])[11]")})
	private WebElement firstName;
	
	@FindAll({@FindBy(xpath="//input[@name='last_name']"),@FindBy(id="last_name"),@FindBy(xpath="(//input[@type='text'])[12]")})
	private WebElement lastName;

	@FindAll({@FindBy(xpath="//textarea[@name='address']"),@FindBy(id="address")})
	private WebElement billingAddress;

	@FindAll({@FindBy(xpath="//input[@name='cc_num']"),@FindBy(id="cc_num"),@FindBy(xpath="(//input[@type='text'])[13]")})
	private WebElement creditCordNumber;

	@FindAll({@FindBy(xpath="//select[@name='cc_type']"),@FindBy(id="cc_type")})
	private WebElement cordType;

	@FindAll({@FindBy(xpath="//select[@name='cc_exp_month']"),@FindBy(id="cc_exp_month")})
	private WebElement expDateMonth;

	@FindAll({@FindBy(xpath="//input[@name='cc_exp_year']"),@FindBy(id="cc_exp_year")})
	private WebElement expDateYear;

	@FindAll({@FindBy(xpath="//input[@name='cc_cvv']"),@FindBy(id="cc_cvv")})
	private WebElement cvvNumber;
	
	
	@FindAll({@FindBy(xpath="//input[@type='button']"),@FindBy(id="book_now")})
	private WebElement confirmBtn;

	@FindAll({@FindBy(xpath="//input[@name='cancel']"),@FindBy(id="cancel")})
	private WebElement cancelBtn;


	public WebElement getConfirmBtn() {
		return confirmBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditCordNumber() {
		return creditCordNumber;
	}

	public WebElement getCordType() {
		return cordType;
	}

	public WebElement getExpDateMonth() {
		return expDateMonth;
	}

	public WebElement getExpDateYear() {
		return expDateYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	
	
}
