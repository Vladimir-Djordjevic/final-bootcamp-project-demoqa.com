package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage {
	WebDriver driver;
	WebDriverWait wdwait;
	WebElement AlertsHeader;
	WebElement buttonAlert;
	WebElement buttonTimerAlert;
	WebElement buttonConfirmBoxAlert;
	WebElement buttonPromptAlert;
	Alert alert;
	WebElement alertResult;
	WebElement promptResult;

	public AlertsPage(WebDriver driver, WebDriverWait wdwait) {

		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getAlertsHeader() {
		return driver.findElement(By.className("main-header"));
	}

	public String textFromAlertsHeader() {
		return this.getAlertsHeader().getText();
	}

	public WebElement getButtonAlert() {
		return driver.findElement(By.id("alertButton"));
	}

	public void clickButtonAlert() {
		this.getButtonAlert().click();
	}

	public WebElement getButtonTimerAlert() {
		return driver.findElement(By.id("timerAlertButton"));
	}

	public void clickButtonTimerAlert() {
		this.getButtonTimerAlert().click();
	}

	public WebElement getButtonConfirmBoxAlert() {
		return driver.findElement(By.id("confirmButton"));
	}

	public void clickButtonConfirmBoxAlert() {
		this.getButtonConfirmBoxAlert().click();
	}

	public WebElement getButtonPromptAlert() {
		return driver.findElement(By.id("promtButton"));
	}

	public void clickButtonPromptAlert() {
		this.getButtonPromptAlert().click();
	}

	public Alert alertPop() {
		wdwait.until(ExpectedConditions.alertIsPresent());
		return this.driver.switchTo().alert();
	}

	public WebElement getAlertResult() {
		return driver.findElement(By.id("confirmResult"));
	}

	public String textAlertResult() {
		return this.getAlertResult().getText();
	}

	public WebElement getPromptResult() {
		return driver.findElement(By.id("promptResult"));
	}
	public String textPromptResult() {
		return this.getPromptResult().getText();
	}
	

}
