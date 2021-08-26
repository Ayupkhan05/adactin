package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.BaseClass;

public class PageThreeDetails extends BaseClass{
	
	
	public PageThreeDetails() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="//input[@name='radiobutton_0']"), @FindBy(id="radiobutton_0")})
	private WebElement radioBtn;
	
	@FindAll({@FindBy(xpath="//input[@name='continue']"), @FindBy(id="continue")})
	private WebElement continueBtn;
	
	@FindAll({@FindBy(xpath="//input[@name='cancel']"), @FindBy(id="cancel")})
	private WebElement cancelBtn;

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	
	
	

}
