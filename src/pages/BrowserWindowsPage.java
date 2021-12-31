package pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserWindowsPage {

	WebDriver driver;
	WebDriverWait wdwait;
	WebElement browserWindowsHeader;
	WebElement newTabButton;
	WebElement newWindowButton;
	WebElement newWindowMessageButton;
	WebElement newSamplePage;
	WebElement newWindowMessageText;
	ArrayList<String> listOfWindows;

	public BrowserWindowsPage(WebDriver driver, WebDriverWait wdwait) {
		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getTextBrowserWindowsHeader() {
		return driver.findElement(By.className("main-header"));
	}

	public String textFromBrowserWindowsHeader() {
		return this.getTextBrowserWindowsHeader().getText();
	}

	public WebElement getNewTabButton() {
		return driver.findElement(By.id("tabButton"));
	}

	public void clickNewTabButton() {
		this.getNewTabButton().click();
	}

	public WebElement getNewWindowButton() {
		return driver.findElement(By.id("windowButton"));
	}

	public void clickNewWindowButton() {
		this.getNewWindowButton().click();
	}

	public WebElement getNewWindowMessageButton() {
		return driver.findElement(By.id("messageWindowButton"));
	}

	public void clickNewWindowMessageButton() {
		this.getNewWindowMessageButton().click();
	}

	public WebElement getNewSamplePage() {
		return driver.findElement(By.id("sampleHeading"));
	}

	public String textNewSamplePage() {
		return this.getNewSamplePage().getText();
	}

	public WebElement getNewWindowMessageText() {
		return driver.findElement(By.xpath("/html/body"));

	}

	public String textNewWindowMessage() {
		return this.getNewWindowMessageText().getText();
	}

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
