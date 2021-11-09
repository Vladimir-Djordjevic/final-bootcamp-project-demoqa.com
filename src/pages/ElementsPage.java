package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage {
	WebDriver driver;
	WebDriverWait wdwait;
	WebElement elementsHeader;
	WebElement textBox;
	WebElement checkBox;
	WebElement radioButton;
	List<WebElement> listaTabovaElements;

	public ElementsPage(WebDriver driver, WebDriverWait wdwait) {
		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getHeader() {
		return driver.findElement(By.className("main-header"));
	}

	public String textHeader() {
		return this.getHeader().getText();
	}

	public boolean isHeaderDisplayed() {
		return this.getHeader().isDisplayed();

	}

	public WebElement getTextBox() {
		listaTabovaElements = driver.findElements(By.cssSelector(".btn.btn-light "));
		return listaTabovaElements.get(0);
	}

	public void clickTextBox() {
		this.getTextBox().click();
	}

	public WebElement getCheckBox() {
		listaTabovaElements = driver.findElements(By.cssSelector(".btn.btn-light "));
		return listaTabovaElements.get(1);
	}

	public void clickCheckBox() {
		this.getCheckBox().click();
	}

	public WebElement getRadioButton() {
		listaTabovaElements = driver.findElements(By.cssSelector(".btn.btn-light "));
		return listaTabovaElements.get(2);
	}
	
	public void clickRadioButton() {
		this.getRadioButton().click();
	}
	

}
