package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStorePage {

	WebDriver driver;
	WebDriverWait wdwait;
	WebElement bookStoreHeader;

	public BookStorePage(WebDriver driver, WebDriverWait wdwait) {
		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getBookStoreHeader() {
		return driver.findElement(By.className("main-header"));
	}

	public String textBookStoreHeader() {
		return this.getBookStoreHeader().getText();
	}

}
