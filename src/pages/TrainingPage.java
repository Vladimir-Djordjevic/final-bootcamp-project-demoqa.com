package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrainingPage {

	WebDriver driver;
	WebDriverWait wdwait;

	WebElement headerTrainingPage;

	public TrainingPage(WebDriver driver, WebDriverWait wdwait) {

		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getHeaderTrainingPage() {
		return driver.findElement(By.cssSelector(
				"div.selenium-training-page:nth-child(2) div.enroll div.container-fluid div.row:nth-child(1) div.col-12.col-lg-6.order-lg-0.d-flex.flex-column.justify-content-md-center:nth-child(2) > div.enroll__heading"));
	}

	public String textHeaderTrainingPage() {
		return this.getHeaderTrainingPage().getText();
	}

}
