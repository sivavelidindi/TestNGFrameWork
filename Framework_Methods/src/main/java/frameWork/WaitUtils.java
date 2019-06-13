package frameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils extends MouseActions{
	public static void sleep(int timeInSeconds) {
		try {
			Thread.sleep(timeInSeconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void implictWait(WebDriver driver,int timeinSeconds) {
		driver.manage().timeouts().implicitlyWait(timeinSeconds, TimeUnit.SECONDS);
	}
	public static void explictWaitForElementClickable(WebDriver driver,int timeinSeconds,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, timeinSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static void explictWaitForElementVisibility(WebDriver driver,int timeinSeconds,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, timeinSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
