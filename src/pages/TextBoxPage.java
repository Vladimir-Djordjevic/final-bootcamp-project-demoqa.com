package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {
	WebDriver driver;
	WebDriverWait wdwait;
	WebElement textBoxHeader;
	WebElement fullNameField;
	WebElement emailField;
	WebElement currentAddressField;
	WebElement permanentAddressField;
	WebElement submitButtonTextBox;
	WebElement fullNameResult; 
	WebElement emailResult; 
	WebElement currentAddressResult; 
	WebElement permanentAddressResult; 
	WebElement allResultsTextBox;
	WebElement fieldError;

	public TextBoxPage(WebDriver driver, WebDriverWait wdwait) {

		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getTextBoxHeader() {
		return driver.findElement(By.className("main-header"));
	}

	public String textFromBoxHeader() {
		return this.getTextBoxHeader().getText();
	}

	public boolean isTextHeaderDisplayed() {
		return this.getTextBoxHeader().isDisplayed();
	}

	public WebElement getFullNameField() {
		return driver.findElement(By.id("userName"));
	}

	public void enterInputInFullNameFiled(String input) {
		this.getFullNameField().clear();
		this.getFullNameField().sendKeys(input);
	}

	public WebElement getEmailField() {
		return driver.findElement(By.id("userEmail"));
	}

	public void enterInputInEmailField(String input) {
		this.getEmailField().clear();
		this.getEmailField().sendKeys(input);
	}

	public WebElement getCurrentAddressField() {
		return driver.findElement(By.id("currentAddress"));
	}

	public void enterInputInCurrentAddressField(String input) {
		this.getCurrentAddressField().clear();
		this.getCurrentAddressField().sendKeys(input);
	}

	public WebElement getPermanentAddressField() {
		return driver.findElement(By.id("permanentAddress"));
	}

	public void enterInputInPermanentAddressField(String input) {
		this.getPermanentAddressField().clear();
		this.getPermanentAddressField().sendKeys(input);
	}

	public WebElement getSubmitButtonTextBox() {
		return driver.findElement(By.id("submit"));
	}

	public void clickSubmitButtonTextBox() {
		this.getSubmitButtonTextBox().click();
	}

	public WebElement getFullNameResult() {
		return driver.findElement(By.id("name"));
	}

	public String textFullNameResult() {
		return this.getFullNameResult().getText();
	}

	public WebElement getEmailResult() {
		return driver.findElement(By.id("email"));
	}

	public String textEmailResult() {
		return this.getEmailResult().getText();
	}

	public WebElement getCurrentAddressResult() {
		return driver.findElement(By.xpath("//p[@id='currentAddress']"));
	}

	public String textCurrentAddressResult() {
		return this.getCurrentAddressResult().getText();
	}

	public WebElement getPermanentAddressResult() {
		return driver.findElement(By.xpath("//p[@id='permanentAddress']"));
	}

	public String textPermanentAddressResult() {
		return this.getPermanentAddressResult().getText();
	}

	public WebElement getAllResultsTextBox() {
		return driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12"));
	}

	public boolean isDisplayedAllResultTextBox() {
		return this.getAllResultsTextBox().isDisplayed();
	}

	public WebElement getFieldError() {
		return driver.findElement(By.cssSelector(".mr-sm-2.field-error.form-control"));
	}

	public boolean isFieldErrorDisplayed() {
		return this.getFieldError().isDisplayed();
	}

}
