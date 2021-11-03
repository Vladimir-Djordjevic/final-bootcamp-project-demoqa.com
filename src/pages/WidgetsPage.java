package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WidgetsPage {

	WebDriver driver;
	WebDriverWait wdwait;
	WebElement widgetsHeader;

	public WidgetsPage(WebDriver driver, WebDriverWait wdwait) {

		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getWidgetsHeader() {
		return driver.findElement(By.className("main-header"));
	}

	public String textWidgetsHeader() {
		return this.getWidgetsHeader().getText();
	}

}
