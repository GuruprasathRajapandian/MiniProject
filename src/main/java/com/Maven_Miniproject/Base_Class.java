package com.Maven_Miniproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;

	public static WebDriver getbrowser (String types) {
		if (types.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (types.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		}
		return driver;
	}

	public static void inputvalue_element(WebElement element) {
		element.click();
	}

	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void scroll1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,350):");
	}

	public static void url(String url) {
		driver.get(url);

	}

	public static void Maximize() {
		driver.manage().window().maximize();
	}

	public static void implictwait() {
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	public static void datainvoke(WebElement element, String ss) {
		element.sendKeys(ss);
	}

	public static void toclear(WebElement element) {
		element.clear();
	}

	public static void select(String selectedvalue, WebElement days) {
		Select s = new Select(days);
		s.selectByValue(selectedvalue);
	}
	public static void select1(WebElement years, String selectedvalue1) {
		Select s = new Select(years);
		s.selectByValue(selectedvalue1);
	}
	public static void select2(WebElement months, String selectedtext) {
		Select s = new Select(months);
        s.deselectByVisibleText(selectedtext);
	}

	public static void action() throws AWTException {
		Actions aa = new Actions(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void action1() throws AWTException {
		Actions aa = new Actions(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
}
