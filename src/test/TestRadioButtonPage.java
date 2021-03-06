package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;

public class TestRadioButtonPage extends BaseClass {

	@BeforeMethod
	public void setUpPage() {
		driver.manage().window().maximize();
		driver.navigate().to(homeUrl);
		homePage.clickEelementsTab();
		elementsPage.clickRadioButton();

	}

	@Test(priority = 10)
	public void verifyElementsArePresentRadioButtonPage() {
		String headerRadioButton = excelReader.getStringData("Test", 54, 2);
		String question = excelReader.getStringData("Test", 56, 2);
		String radioButtonYes = excelReader.getStringData("Test", 57, 2);
		String radioButtonImpressive = excelReader.getStringData("Test", 58, 2);
		String radioButtonNo = excelReader.getStringData("Test", 59, 2);
		// Assert that all elements of the page are present
		assertEquals(radioButtonPage.textHeaderRadio(), headerRadioButton);
		assertEquals(radioButtonPage.question(), question);
		assertEquals(radioButtonPage.textRadioButtonYes(), radioButtonYes);
		assertEquals(radioButtonPage.textRadioButtonImpressive(), radioButtonImpressive);
		assertEquals(radioButtonPage.textRadioButtonNo(), radioButtonNo);

	}

	@Test(priority = 20)
	public void verifyClicksOnRadioButtons() {
		String textWhenRadioButtonYes = excelReader.getStringData("Test", 61, 2);
		String textWhenRadioButtonImpressive = excelReader.getStringData("Test", 63, 2);
		// Verify if text appears "You have selected Yes" when user click on "Yes" radio
		radioButtonPage.clickYesRadioButton();
		assertEquals(radioButtonPage.textWhenSelectedRadioButton(), textWhenRadioButtonYes);
		// Verify if text appears "You have selected Impressive" when user clicks on
		// "Impressive" radio button
		radioButtonPage.clickImpressiveRadioButton();
		assertEquals(radioButtonPage.textWhenSelectedRadioButton(), textWhenRadioButtonImpressive);
		// Verify that cannot be clicked on No radio button
		// Text is still "You have selected Impressive"
		radioButtonPage.clickNoRadioButton();
		assertEquals(radioButtonPage.textWhenSelectedRadioButton(), textWhenRadioButtonImpressive);

	}

	@AfterMethod
	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}

}
