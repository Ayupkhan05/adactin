package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.BaseClass;

public class PageTwoDetails extends BaseClass{
	
	public PageTwoDetails() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(id="location"), @FindBy(xpath="//select[@name='location']")	})
	private WebElement locationDropDown;
	
	@FindAll({@FindBy(id="hotels"), @FindBy(xpath="//select[@name='hotels']"), @FindBy(className="search_combobox")})
	private WebElement hotelDropDownBtn;

	@FindAll({@FindBy(xpath="//select[@name='room_type']"), @FindBy(id="room_type")})
	private WebElement roomDropDownBtn;

	@FindAll({@FindBy(id="room_nos"), @FindBy(xpath="//select[@name='room_nos']")})
	private WebElement numberDropDownBtn;

	@FindAll({@FindBy(id="datepick_in"), @FindBy(xpath="//input[@name='datepick_in']"),@FindBy(xpath="(//input[@type='text'])[2]")})
	private WebElement checkInDate;
	
	@FindAll({@FindBy(id="datepick_out"), @FindBy(xpath="//input[@name='datepick_out']"),@FindBy(xpath="(//input[@type='text'])[3]")})
	private WebElement checkOutDate;
	
	@FindAll({@FindBy(id="adult_room"), @FindBy(xpath="//select[@name='adult_room']")})
	private WebElement adultDropDownBtn;
	
	@FindAll({@FindBy(id="child_room"), @FindBy(xpath="//select[@name='child_room']")})
	private WebElement childDropDownBtn;
	
	@FindAll({@FindBy(id="Submit"), @FindBy(xpath="//input[@name='Submit']")})
	private WebElement searchBtn;

	@FindAll({@FindBy(id="Reset"), @FindBy(xpath="//input[@name='Reset']")})
	private WebElement reSetBtn;

	public WebElement getLocationDropDown() {
		return locationDropDown;
	}

	public WebElement getHotelDropDownBtn() {
		return hotelDropDownBtn;
	}

	public WebElement getRoomDropDownBtn() {
		return roomDropDownBtn;
	}

	public WebElement getNumberDropDownBtn() {
		return numberDropDownBtn;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultDropDownBtn() {
		return adultDropDownBtn;
	}

	public WebElement getChildDropDownBtn() {
		return childDropDownBtn;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getReSetBtn() {
		return reSetBtn;
	}
	
	
	
}
