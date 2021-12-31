package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	WebDriverWait wdwait;
	WebElement header;
	WebElement elementsTab;
	WebElement footer;
	WebElement joinNowButton;
	WebElement formsTab;
	WebElement alertsFrameTab;
	WebElement widgetsTab;
	WebElement interactionsTab;
	WebElement bookStoreTab;

	ArrayList<String> listOfWindows; // declare array list of windows so we can switch to new windows
	List<WebElement> listaTabova;

	public HomePage(WebDriver driver, WebDriverWait wdwait) {

		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getElementsTab() {
		listaTabova = driver.findElements(By.cssSelector(".card.mt-4.top-card"));
		return listaTabova.get(0);
	}

	public void clickEelementsTab() {
		this.getElementsTab().click();
	}

	public WebElement getFooter() {
		return driver.findElement(
				By.cssSelector("body:nth-child(2) div:nth-child(4) footer:nth-child(3) > span:nth-child(1)"));
	}

	public String textFooter() {
		return this.getFooter().getText();
	}

	public WebElement getJoinNowButton() {
		return driver.findElement(By.className("banner-image"));
	}

	public void clickJoinNowButton() {
		this.getJoinNowButton().click();
	}

	public WebElement getHeader() {
		return driver.findElement(By.cssSelector("header"));
	}

	public void clickHeader() {
		this.getHeader().click();
	}

	public boolean isHeaderDisplayed() {
		return this.getHeader().isDisplayed();
	}

	public WebElement getFormsTab() {
		listaTabova = driver.findElements(By.cssSelector(".card.mt-4.top-card"));
		return listaTabova.get(1);
	}

	public void clickFormsTab() {
		this.getFormsTab().click();
	}

	public WebElement getAlertsFrameTab() {
		List<WebElement> listaTabova = driver.findElements(By.cssSelector(".card.mt-4.top-card"));
		return listaTabova.get(2);
	}

	public void clickAlertsFrameTab() {
		this.getAlertsFrameTab().click();
	}

	public WebElement getWidgetsTab() {
		List<WebElement> listaTabova = driver.findElements(By.cssSelector(".card.mt-4.top-card"));
		return listaTabova.get(3);
	}

	public void clickWidgetsTab() {
		this.getWidgetsTab().click();
	}

	public WebElement getInteractionsTab() {
		List<WebElement> listaTabova = driver.findElements(By.cssSelector(".card.mt-4.top-card"));
		return listaTabova.get(4);
	}

	public void clickInteractionsTab() {
		this.getInteractionsTab().click();
	}

	public WebElement getBookStoreTab() {
		List<WebElement> listaTabova = driver.findElements(By.cssSelector(".card.mt-4.top-card"));
		// This will scroll the page till an element is found
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", listaTabova.get(5));
		return listaTabova.get(5);

	}

	public void clickBookStoreTab() {

		this.getBookStoreTab().click();
	}

	// Initialize list of windows and switch to second one
	public void nextWindow() {
		listOfWindows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(listOfWindows.get(1));
	}

	public void firstWindow() {
		driver.close();
		listOfWindows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(listOfWindows.get(0));
	}

}
