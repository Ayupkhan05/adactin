package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.BaseClass;

public class LoginPageAdactin extends BaseClass {
	public LoginPageAdactin() {
		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(id = "username"), @FindBy(xpath = "//input[@type='text']") })
	private WebElement loginUserNameAda;

	@FindAll({ @FindBy(id = "password"), @FindBy(xpath = "//input[@type='password']") })
	private WebElement loginPassAda;

	@FindAll({ @FindBy(id = "login"), @FindBy(xpath = "//input[@type='Submit']") })
	private WebElement submitBtnAda;

	public WebElement getLoginUserNameAda() {
		return loginUserNameAda;
	}

	public WebElement getLoginPassAda() {
		return loginPassAda;
	}

	public WebElement getSubmitBtnAda() {
		return submitBtnAda;
	}

	
	
	
}
