package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage {
	WebDriver driver;
	WebDriverWait wdwait;
	WebElement mainHeader;

	public CheckBoxPage(WebDriver driver, WebDriverWait wdwait) {
		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getMainHeader() {
		return driver.findElement(By.className("main-header"));
	}

	public String textBoxMainHeader() {
		return this.getMainHeader().getText();
	}

}
