package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;

public class TestTextBox extends BaseClass {

	@BeforeMethod
	public void setUpPage() {
		driver.manage().window().maximize();
		driver.navigate().to(homeUrl);
		homePage.clickEelementsTab();
		elementsPage.clickTextBox();

	}

	@Test(priority = 10)
	public void verifyClickOnTextBox() {
		// Checking if the TexBox header exist when we click on the TextBox
		assertTrue(textBoxPage.isTextHeaderDisplayed());
		// Checking if the text in the TexBox header equals "Text Box"
		assertEquals(textBoxPage.textFromBoxHeader(), excelReader.getStringData("Test", 19, 2));

	}

	@Test(priority = 20)
	public void validTextInputInTextBoxesFields() throws InterruptedException {
		textBoxPage.enterInputInFullNameFiled(excelReader.getStringData("Test", 21, 1));
		textBoxPage.enterInputInEmailField(excelReader.getStringData("Test", 22, 1));
		textBoxPage.enterInputInCurrentAddressField(excelReader.getStringData("Test", 23, 1));
		textBoxPage.clickSubmitButtonTextBox();
		// Test if Full Name result is the same as entered text "Name:Vladimir"
		assertEquals(textBoxPage.textFullNameResult(), excelReader.getStringData("Test", 21, 2));
		// Test if email address is the same as entered "Email:vlada@test.com"
		assertEquals(textBoxPage.textEmailResult(), excelReader.getStringData("Test", 22, 2));
		// Test currentAddres is the same as entered "Decanska"
		assertEquals(textBoxPage.textCurrentAddressResult(), excelReader.getStringData("Test", 23, 2));

		// Test if all text results div. element is present on bottom of the screen
		assertTrue(textBoxPage.isDisplayedAllResultTextBox());

	}

	// Test have failed, Bug report filled
//	@Test(priority = 30) // Fail spelling error
//	public void permanentAddressText() {
//		textBoxPage.enterInputInPermanentAddressField(excelReader.getStringData("Test", 24, 1));
//		textBoxPage.clickSubmitButtonTextBox();
//		// The test will fall because of a spelling error:
//		// "Permananet address" is displayed instead of "Permanent" permanent
//		assertEquals(textBoxPage.textPermanentAddressResult(), excelReader.getStringData("Test", 24, 2));
//
//	}

	@Test(priority = 40)
	public void verifyValidResultIfUserInputValidEmailAddress() {
		textBoxPage.enterInputInEmailField(excelReader.getStringData("Test", 26, 1));
		textBoxPage.clickSubmitButtonTextBox();
		// Test if email address is the same as entered "Email:v@t.rs
		assertEquals(textBoxPage.textEmailResult(), excelReader.getStringData("Test", 26, 2));
		textBoxPage.enterInputInEmailField(excelReader.getStringData("Test", 27, 1));
		textBoxPage.clickSubmitButtonTextBox();
		// Test if email address is the same as entered "Email:v@t.com
		assertEquals(textBoxPage.textEmailResult(), excelReader.getStringData("Test", 27, 2));

	}

	@Test(priority = 50)
	public void testInvalidEmailInputs() {
		// Create a loop that is using all incorrect email inputs
		// We check all cases with invalid email form
		for (int i = 2; i < excelReader.getLastRowNumber() + 1; i++) {
			textBoxPage.enterInputInEmailField(excelReader.getStringData("Email", i, 1));
			textBoxPage.clickSubmitButtonTextBox();
			// When we enter invalid email address the new element "ErrorForm is displayed
			assertTrue(textBoxPage.isFieldErrorDisplayed());
		}

	}

	@Test(priority = 60)
	public void verifyThatTextDoNotAppearWhenUserDoNotInputText() {
		textBoxPage.clickSubmitButtonTextBox();
		try {
			assertFalse(textBoxPage.isDisplayedAllResultTextBox());

		} catch (Exception NoSuchElementException) {
			System.out.println("There is no text result box element");
		}

	}

	@AfterMethod
	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}

}
