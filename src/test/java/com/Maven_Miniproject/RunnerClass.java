package com.Maven_Miniproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.PageObjectModel_POM.POM_Demo1;

public class RunnerClass extends Base_Class {
	public static WebDriver driver = Base_Class.getbrowser("chrome");
	public static POM_Demo1 om = new POM_Demo1(driver);
public static void main(String[] args)throws AWTException {
	url("http://automationpractice.com/index.php");
	Maximize();
	implictwait();
	inputvalue_element(om.getWomen());
	inputvalue_element(om.getDresses());
	inputvalue_element(om.getCasualDresses());
	inputvalue_element(om.getScrollbar());
	inputvalue_element(om.getFrame());
	inputvalue_element(om.getAddtocart());
	inputvalue_element(om.getProceedtocheckout());
	inputvalue_element(om.getQuantity());
	toclear(om.getQuantity());
	datainvoke(om.getQuantity(), "5");
	inputvalue_element(om.getProceedtocheckout1());
	inputvalue_element(om.getEmailAddress());
	inputvalue_element(om.getCreateAccount_Button());
	inputvalue_element(om.getMr());
	inputvalue_element(om.getFirstname());
	inputvalue_element(om.getLastname());
	inputvalue_element(om.getPassword());
	inputvalue_element(om.getDays());
	select("1", om.getDays());
	inputvalue_element(om.getMonths());
	
	inputvalue_element(om.getYears());
	select1(om.getYears(), "1993");
	inputvalue_element(om.getAddress());
	datainvoke(om.getAddress(), "No 285, Old Mahabalipuram Rd, Kumaran Nagar, Elcot Sez, Karapakkam, Chennai, Tamil Nadu 600119");
	inputvalue_element(om.getCity());
	datainvoke(om.getCity(), "Chennai");
	inputvalue_element(om.getState());
	//datainvoke(om.getState(), action());
	inputvalue_element(om.getPostcode());
	datainvoke(om.getPostcode(), "60780");
	inputvalue_element(om.getCountry());
	//data
	inputvalue_element(om.getMobile());
	datainvoke(om.getMobile(), "1234567890");
	inputvalue_element(om.getAlias());
	datainvoke(om.getAlias(), "1-4-5, 5th Cross St");
	inputvalue_element(om.getRegister());
	inputvalue_element(om.getProcesstoaddress());
	inputvalue_element(om.getCheckbox());
	inputvalue_element(om.getProcessCarrier());
	inputvalue_element(om.getPaybybankwire());
	inputvalue_element(om.getIconfirmmyorder());
	
	
	
	
	
	
	
	
	WebElement CasualDresses = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?id_category=9&controller=category'])[3]"));
	inputvalue_element(CasualDresses);
	WebElement scrollbar = driver.findElement(By.xpath("//html[@lang='en']"));
	scroll(scrollbar);
	WebElement frame = driver.findElement(By.className("right-block"));
	inputvalue_element(frame);
	WebElement Addtocart = driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']"));
	inputvalue_element(Addtocart);
	WebElement Proceedtocheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	inputvalue_element(Proceedtocheckout);
	WebElement Quantity = driver.findElement(By.xpath("//input[@name='quantity_3_13_0_0']"));
	//toclear(Quantity);
	//datainvoke(Quantity, "5");
	WebElement Proceedtocheckout1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
	inputvalue_element(Proceedtocheckout1);
	WebElement EmailAddress = driver.findElement(By.id("email_create"));
	datainvoke(EmailAddress, "nooruku@gmail.com");
	WebElement CreateAccount_Button = driver.findElement(By.id("SubmitCreate"));
	inputvalue_element(CreateAccount_Button);
	WebElement Mr = driver.findElement(By.id("id_gender1"));
	inputvalue_element(Mr);
	WebElement firstname = driver.findElement(By.id("customer_firstname"));
    datainvoke(firstname, "Vettu");
	WebElement lastname = driver.findElement(By.id("customer_lastname"));
	datainvoke(lastname, "Aruval");
	WebElement Password = driver.findElement(By.id("passwd"));
    datainvoke(Password, "James@gos123");
	//scroll1();
	WebElement days = driver.findElement(By.id("days"));
	select("1", days);
	WebElement months = driver.findElement(By.xpath("//div[@class='col-xs-4'][2]"));
	action();
	WebElement years = driver.findElement(By.id("years"));
	select1(years, "1993");
	WebElement Address = driver.findElement(By.id("address1"));
	datainvoke(Address, "No 285, Old Mahabalipuram Rd, Kumaran Nagar, Elcot Sez, Karapakkam, Chennai, Tamil Nadu 600119");
	WebElement city = driver.findElement(By.name("city"));
	datainvoke(city, "Chennai");
	WebElement state = driver.findElement(By.id("id_state"));
	inputvalue_element(state);
	action();
	WebElement postcode = driver.findElement(By.id("postcode"));
	postcode.sendKeys("60780");
	WebElement Country = driver.findElement(By.id("id_country"));
	Country.click();
	action1();
	WebElement Mobile = driver.findElement(By.id("phone_mobile"));
	datainvoke(Mobile, "1234567890");
	WebElement alias = driver.findElement(By.id("alias"));
	datainvoke(alias, "1-4-5, 5th Cross St");
	WebElement Register = driver.findElement(By.id("submitAccount"));
	inputvalue_element(Register);
	WebElement processtoaddress = driver.findElement(By.name("processAddress"));
	inputvalue_element(processtoaddress);
	WebElement checkbox = driver.findElement(By.id("cgv"));
	inputvalue_element(checkbox);
	WebElement processCarrier = driver.findElement(By.name("processCarrier"));
	processCarrier.click();
	WebElement paybybankwire = driver.findElement(By.className("bankwire"));
	inputvalue_element(paybybankwire);
	WebElement Iconfirmmyorder = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
	inputvalue_element(Iconfirmmyorder);

}
}
