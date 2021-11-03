package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InteractionsPage {
	WebDriver driver;
	WebDriverWait wdwait;
	WebElement interactionsHeader;

	public InteractionsPage(WebDriver driver, WebDriverWait wdwait) {

		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getInteractionsHeader() {
		return driver.findElement(By.className("main-header"));
	}

	public String textInteractionsHeader() {
		return this.getInteractionsHeader().getText();
	}

}
