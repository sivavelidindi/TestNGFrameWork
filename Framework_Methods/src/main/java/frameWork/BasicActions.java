package frameWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasicActions extends BrowserActions{
	public static void enterText(WebElement element,String textValue) {
		element.sendKeys(textValue);
	}
	public static void selectValueByVisibleText(WebElement element,String textValue) {
		Select dd=new Select(element);
		dd.selectByVisibleText(textValue);
	}
	public static void selectValueByVisibleTexts(WebElement element,String textValuesSeperatedByColon) {
		Select dd=new Select(element);
		String[] textvalues=textValuesSeperatedByColon.split(":");
		for(String textvalue:textvalues) {
			dd.selectByVisibleText(textvalue);
		}
	}
	public static void checkACheckBox(WebElement element) {
		boolean status=element.isSelected();
		
		if(!status) {
			element.click();
		}
	}

}
