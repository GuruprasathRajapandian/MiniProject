package com.PageObjectModel_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Demo1 {
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement Women;
	public POM_Demo1(WebDriver driver2) {
		this.driver = driver2;            
		PageFactory.initElements(driver, this);  //(this word represent the whole class @findby elements)
	}
	public WebElement getWomen() {
		return Women;
	}
	@FindBy(xpath = "(//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category'])[3]")
	private WebElement Dresses;
	
	public WebElement getDresses() {
		return Dresses;
	}
	public WebElement getCasualDresses() {
		return CasualDresses;
	}
	public WebElement getScrollbar() {
		return Scrollbar;
	}
	public WebElement getFrame() {
		return frame;
	}
	public WebElement getAddtocart() {
		return Addtocart;
	}
	public WebElement getProceedtocheckout() {
		return Proceedtocheckout;
	}
	public WebElement getQuantity() {
		return Quantity;
	}
	public WebElement getProceedtocheckout1() {
		return Proceedtocheckout1;
	}
	public WebElement getEmailAddress() {
		return EmailAddress;
	}
	public WebElement getCreateAccount_Button() {
		return CreateAccount_Button;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getDays() {
		return days;
	}
	public WebElement getMonths() {
		return months;
	}
	public WebElement getYears() {
		return years;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return State;
	}
	public WebElement getPostcode() {
		return postcode;
	}
	public WebElement getCountry() {
		return Country;
	}
	public WebElement getMobile() {
		return Mobile;
	}
	public WebElement getAlias() {
		return alias;
	}
	public WebElement getRegister() {
		return Register;
	}
	public WebElement getProcesstoaddress() {
		return processtoaddress;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getProcessCarrier() {
		return processCarrier;
	}
	public WebElement getPaybybankwire() {
		return paybybankwire;
	}
	public WebElement getIconfirmmyorder() {
		return Iconfirmmyorder;
	}
	@FindBy(xpath = "(//a[@href='http://automationpractice.com/index.php?id_category=9&controller=category'])[3]")
    private WebElement CasualDresses;
	
    @FindBy(xpath = "//html[@lang='en']")
    private WebElement Scrollbar;
    @FindBy(className = "right-block")
    private WebElement frame;
    @FindBy(xpath = "//a[@class='button ajax_add_to_cart_button btn btn-default']")
    private WebElement Addtocart;
    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement Proceedtocheckout;
    @FindBy(xpath = "//input[@name='quantity_3_13_0_0']")
    private WebElement Quantity;
    @FindBy(xpath = "//a[@title='Proceed to checkout'])[2]\"")
    private WebElement Proceedtocheckout1;
    @FindBy(id = "email_create")
    private WebElement EmailAddress;
    @FindBy(id = "SubmitCreate")
    private WebElement CreateAccount_Button;
    @FindBy(id = "id_gender1")
    private WebElement Mr;
    public WebElement getMr() {
		return Mr;
	}
	public void setMr(WebElement mr) {
		Mr = mr;
	}
	@FindBy(id = "customer_firstname")
    private WebElement firstname;
    @FindBy(id = "customer_lastname")
    private WebElement lastname;
    @FindBy(id = "passwd")
    private WebElement Password;
    @FindBy(id = "days")
    private WebElement days;
    @FindBy(xpath = "//div[@class='col-xs-4'][2]")
    private  WebElement months;
    @FindBy(id = "years")
    private WebElement years;
    @FindBy(id = "address1")
    private WebElement Address;
    @FindBy(name = "city")
    private WebElement city;
    @FindBy(id = "id_state")
    private  WebElement State;
    @FindBy(id = "postcode")
    private WebElement postcode;
    @FindBy(id = "id_country")
    private WebElement Country;
    @FindBy(id = "phone_mobile")
    private WebElement Mobile;
    @FindBy(id = "alias")
    private WebElement alias;
    @FindBy(id = "submitAccount")
    private WebElement Register;
    @FindBy(name = "processAddress")
    private WebElement processtoaddress;
    @FindBy(id = "cgv")
    private  WebElement checkbox;
    @FindBy(name = "processCarrier")
    private WebElement processCarrier;
    @FindBy(className = "bankwire")
    private  WebElement paybybankwire;
    @FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
    private WebElement Iconfirmmyorder;
    
    
    
    //Collection of Webelement and stored in a seperate class and make it as private.
    //@FindBy (Used to mark a field on a Page Object to indicate an alternative mechanism for locating the element or a list of elements. Used in conjunction with org.openqa.selenium.support.
    //PageFactorythis allows users to quickly and easily create PageObjects.)/*
    
}
