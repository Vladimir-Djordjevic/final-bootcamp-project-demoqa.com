package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage {
	WebDriver driver;
	WebDriverWait wdwait;
	WebElement header;
	WebElement text;
	WebElement radioButtonYes;
	WebElement radioButtonImpressive;
	WebElement radioButtonNo;
	WebElement selectedText;

	public RadioButtonPage(WebDriver driver, WebDriverWait wdwait) {
		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getHeader() {
		return driver.findElement(By.className("main-header"));
	}

	public String textHeaderRadio() {
		return this.getHeader().getText();
	}

	public WebElement getText() {
		return driver.findElement(By.className("mb-3"));
	}

	public String question() {
		return getText().getText();
	}

	public WebElement getRadioButtonYes() {
		return driver.findElement(By.xpath("//label[text()='Yes']"));
	}

	public void clickYesRadioButton() {
		this.getRadioButtonYes().click();
	}

	public String textRadioButtonYes() {
		return getRadioButtonYes().getText();
	}

	public WebElement getRadioButtonImpressive() {
		return driver.findElement(By.xpath("//label[text()='Impressive']"));
	}

	public void clickImpressiveRadioButton() {
		this.getRadioButtonImpressive().click();;
	}

	public String textRadioButtonImpressive() {
		return getRadioButtonImpressive().getText();
	}

	public WebElement getRadioButtonNo() {
		return driver.findElement(By.xpath("//label[text()='No']"));
	}

	public void clickNoRadioButton() {
		this.getRadioButtonNo();
	}
	public String textRadioButtonNo() {
		return getRadioButtonNo().getText();
	}

	public WebElement getSelectedText() {
		return driver.findElement(By.className("mt-3"));
	}

	public String textWhenSelectedRadioButton() {
		return getSelectedText().getText();

	}

}
