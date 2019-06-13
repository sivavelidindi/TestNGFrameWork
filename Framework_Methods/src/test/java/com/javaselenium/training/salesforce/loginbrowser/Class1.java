package com.javaselenium.training.salesforce.loginbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameWork.BasicActions;
import frameWork.BrowserActions;
import frameWork.Browsers;

public class Class1 {
	public static void main(String[] args) {
		WebDriver driver=BrowserActions.openChromeBrowser();
		//BrowserActions.openURL(driver, "https://www.facebook.com");
		//System.out.println(BrowserActions.verifyPageTitle(driver, "Facebook – log in or sign up"));
		//BrowserActions.closeBrowserWindow(driver);
		//WebElement username=userName(driver);
		//BasicActions.enterText(username, "abcd@gmail.com");
		BasicActions.openURL(driver, "https://www.toolsqa.com/automation-practice-form/");
		BasicActions.selectValueByVisibleTexts(driver.findElement(By.xpath("//select[@id='selenium_commands']")), "Browser Commands:Switch Commands:WebElement Commands");
		//System.out.println("Hello World");
	}
	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.id("email"));
	}
	public static WebElement passwordText(WebDriver driver) {
		return driver.findElement(By.id("pass"));
	}
}
