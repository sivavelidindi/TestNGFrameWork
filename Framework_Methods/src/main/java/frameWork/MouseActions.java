package frameWork;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActions extends BasicActions {
	public static void mouseClick(WebDriver driver,WebElement element) {
		Actions actions=new Actions(driver);
		actions.click(element);
		actions.build().perform();
	}
	public static void mouseRightClick(WebDriver driver,WebElement element) {
		Actions actions=new Actions(driver);
		actions.contextClick(element);
		actions.build().perform();
		
	}
	
	public static void clickOnEnter(WebDriver driver) {
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();	
	}
	public static void moveToElementWithoutCoordinates(WebDriver driver,WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element);
		actions.build().perform();	
	}
}
