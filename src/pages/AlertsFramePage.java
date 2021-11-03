package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsFramePage {
	WebDriver driver;
	WebDriverWait wdwait;
	WebElement alertsHeader;
	WebElement browserWindows;
	WebElement alerts;

	public AlertsFramePage(WebDriver driver, WebDriverWait wdwait) {
		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getAlertsHeader() {
		return driver.findElement(By.className("main-header"));
	}

	public String textAlertsHeader() {
		return this.getAlertsHeader().getText();
	}

	public WebElement getBrowserWindows() {
		return driver.findElement(By.cssSelector(
				"div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-3:nth-child(1) div.left-pannel div.accordion div.element-group:nth-child(3) div.element-list.collapse.show ul.menu-list li.btn.btn-light:nth-child(1) > span.text:nth-child(2)"));
	}

	public void clickBrowserWindows() {
		this.getBrowserWindows().click();
	}

	public WebElement getAlerts() {
		return driver.findElement(By.cssSelector(
				"div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-3:nth-child(1) div.left-pannel div.accordion div.element-group:nth-child(3) div.element-list.collapse.show ul.menu-list li.btn.btn-light:nth-child(2) > span.text:nth-child(2)"));
	}

	public void clickAlerts() {
		this.getAlerts().click();
	}

}
