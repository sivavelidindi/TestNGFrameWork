package frameWork;

import org.openqa.selenium.WebDriver;

public class BrowserActions extends Browsers {
	public static void openURL(WebDriver driver,String url) {
		driver.get(url);
	}
	public static String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	public static boolean verifyPageTitle(WebDriver driver,String expectedPageTitle) {
		String actualPageTitle=driver.getTitle();
		if(actualPageTitle.equals(expectedPageTitle)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void closeBrowserWindow(WebDriver driver) {
		driver.quit();
	}

}
