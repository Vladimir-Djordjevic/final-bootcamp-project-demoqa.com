package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormsPage {
	WebDriver driver;
	WebDriverWait wdwait;
	WebElement formsHeader;

	public FormsPage(WebDriver driver, WebDriverWait wdwait) {

		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getFormsHeader() {
		return driver.findElement(By.className("main-header"));
	}

	public String textFormsHeader() {
		return this.getFormsHeader().getText();
	}

}
