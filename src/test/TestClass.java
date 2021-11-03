package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;

public class TestClass extends BaseClass {

	@BeforeMethod
	public void setUpPage() {
		driver.manage().window().maximize();
		driver.navigate().to(homeUrl);
	}

//	@Test(priority = 10)
//	public void verifyThatHeaderOfTheSiteIsPresent() {
//		// Test if the site has a header element
//		assertTrue(homePage.isHeaderDisplayed());
//	}
//
//	@Test(priority = 20) // Fail test - wrong year in the Footer of the site
//	public void verifyFooterOfTheSite() {
//		// Test that the footer of the site is visible
//		assertTrue(homePage.getFooter().isDisplayed());
//
//		// The test will fail because the year on site is 2020 instead of 2021
//		assertEquals(homePage.textFooter(), excelReader.getStringData("Test", 3, 2));
//
//	}
//
//	@Test(priority = 30)
//	public void linksHomePage() throws InterruptedException {
//		homePage.clickJoinNowButton();
//		// Create a list of tabs and switch to new one
//		// and test the header of page
////		ArrayList<String> listaTabova = new ArrayList<String>(driver.getWindowHandles());
////		driver.switchTo().window(listaTabova.get(1));
//		homePage.nextWindow();
//		// Verify header text of Selenium Training Page equals "Selenium Certification
//		// Training |
//		// Enroll Now | Study Online"
//		assertEquals(trainingPage.textHeaderTrainingPage(), excelReader.getStringData("Test", 5, 2));
////		driver.close();
////		driver.switchTo().window(listaTabova.get(0));
//		homePage.firstWindow();
//		homePage.clickJoinNowButton();
//		homePage.nextWindow();
//		assertEquals(trainingPage.textHeaderTrainingPage(), excelReader.getStringData("Test", 5, 2));
//		homePage.firstWindow();
//	}
//
//	@Test(priority = 40)
//	public void verifyClickOnElementsTab() {
//		homePage.clickEelementsTab();
//		// Verify if the Header Elements is displayed when we click on the Elements Tab
//		assertTrue(elementsPage.isHeaderDisplayed());
//		// Verify if a text in the Elements header equals "Elements"
//		assertEquals(elementsPage.textHeader(), excelReader.getStringData("Test", 7, 2));
//
//	}
//
//	@Test(priority = 50)
//	public void verifyClickOnFormsTab() {
//		homePage.clickFormsTab();
//		// Verify if the Header Forms is displayed when we click on the Forms Tab
//		assertTrue(formsPage.getFormsHeader().isDisplayed());
//		// Verify if a text in the Forms header equals "Forms"
//		assertEquals(formsPage.textFormsHeader(), excelReader.getStringData("Test", 9, 2));
//
//	}

//	@Test(priority = 60)
//	public void verifyClickOnAlertsFrameWindows() {
//		homePage.clickAlertsFrameTab();
//		// Verify if the Header Alerts Frame Windows is displayed
//		assertTrue(alertsFramePage.getAlertsHeader().isDisplayed());
//		// Verify if a text in the Alerts Frame & Window page header equals
//		// "Alerts,Frame & Windows"
//		assertEquals(alertsFramePage.textAlertsHeader(), excelReader.getStringData("Test", 11, 2));
//
//	}
//
//	@Test(priority = 70)
//	public void verifyClickOnWidgets() {
//		homePage.clickWidgetsTab();
//		// Verify if the Header Widgets is displayed
//		assertTrue(widgetsPage.getWidgetsHeader().isDisplayed());
//		// Verify if a text in the Widgets Text page header equals "Widgets"
//		assertEquals(widgetsPage.textWidgetsHeader(), excelReader.getStringData("Test", 13, 2));
//
//	}
//
//	@Test(priority = 80)
//	public void verifyClickOnInteractions() {
//		homePage.clickInteractionsTab();
//		// Verify if the Header Interactions is displayed
//		assertTrue(interactionsPage.getInteractionsHeader().isDisplayed());
//		// Verify if a text in the Widgets Text page header equals "Widgets"
//		assertEquals(interactionsPage.textInteractionsHeader(), excelReader.getStringData("Test", 15, 2));
//	}
//
//	@Test(priority = 90)
//	public void verifyClickOnBookStoreApplication() {
//		// We must scroll page so we used JavascriptExecutor
//		homePage.clickBookStoreTab();
//		// Verify if the Header Book Store Application is displayed
//		assertTrue(bookStorePage.getBookStoreHeader().isDisplayed());
//		// Verify if a text in the Book Store Text page header equals "Book Store
//		// Application"
//		assertEquals(bookStorePage.textBookStoreHeader(), excelReader.getStringData("Test", 17, 2));
//
//	}
//
//	@Test(priority = 100)
//	public void verifyClickOnTextBox() {
//		homePage.clickEelementsTab();
//		elementsPage.clickTextBox();
//		// Checking if the TexBox header exist when we click on the TextBox
//		assertTrue(textBoxPage.isTextHeaderDisplayed());
//		// Checking if the text in the TexBox header equals "Text Box"
//		assertEquals(textBoxPage.textFromBoxHeader(), excelReader.getStringData("Test", 19, 2));
//
//	}
//
//	@Test(priority = 110)
//	public void validTextInputInTextBoxesFields() throws InterruptedException {
//		homePage.clickEelementsTab();
//		elementsPage.clickTextBox();
//		textBoxPage.enterInputInFullNameFiled(excelReader.getStringData("Test", 21, 1));
//		textBoxPage.enterInputInEmailField(excelReader.getStringData("Test", 22, 1));
//		textBoxPage.enterInputInCurrentAddressField(excelReader.getStringData("Test", 23, 1));
//		textBoxPage.clickSubmitButtonTextBox();
//		// Test if Full Name result is the same as entered text "Name:Vladimir"
//		assertEquals(textBoxPage.textFullNameResult(), excelReader.getStringData("Test", 21, 2));
//		// Test if email address is the same as entered "Email:vlada@test.com"
//		assertEquals(textBoxPage.textEmailResult(), excelReader.getStringData("Test", 22, 2));
//		// Test currentAddres is the same as entered "Decanska"
//		assertEquals(textBoxPage.textCurrentAddressResult(), excelReader.getStringData("Test", 23, 2));
//
//		// Test if all text results div. element is present on bottom of the screen
//		assertTrue(textBoxPage.isDisplayedAllResultTextBox());
//
//	}
//
//	@Test(priority = 111) // Fail spelling error
//	public void permanentAddress() {
//		homePage.clickEelementsTab();
//		elementsPage.clickTextBox();
//		textBoxPage.enterInputInPermanentAddressField(excelReader.getStringData("Test", 24, 1));
//		textBoxPage.clickSubmitButtonTextBox();
//		// The test will fall because of a spelling error:
//		// "Permananet address" is displayed instead of "Permanent" permanent
//		assertEquals(textBoxPage.textPermanentAddressResult(), excelReader.getStringData("Test", 24, 2));
//
//	}
//
//	@Test(priority = 120)
//	public void verifyValidResultIfUserInputValidEmailAddress() {
//		homePage.clickEelementsTab();
//		elementsPage.clickTextBox();
//		textBoxPage.enterInputInEmailField(excelReader.getStringData("Test", 26, 1));
//		textBoxPage.clickSubmitButtonTextBox();
//		// Test if email address is the same as entered "Email:v@t.rs
//		assertEquals(textBoxPage.textEmailResult(), excelReader.getStringData("Test", 26, 2));
//		textBoxPage.enterInputInEmailField(excelReader.getStringData("Test", 27, 1));
//		textBoxPage.clickSubmitButtonTextBox();
//		// Test if email address is the same as entered "Email:v@t.com
//		assertEquals(textBoxPage.textEmailResult(), excelReader.getStringData("Test", 27, 2));
//
//	}
//
//	@Test(priority = 130)
//	public void testInvalidEmailInputs() {
//		homePage.clickEelementsTab();
//		elementsPage.clickTextBox();
//		// Create a loop that is using all incorrect email inputs
//		// We check all cases with invalid email form
//		for (int i = 2; i < excelReader.getLastRowNumber() + 1; i++) {
//			textBoxPage.enterInputInEmailField(excelReader.getStringData("Email", i, 1));
//			textBoxPage.clickSubmitButtonTextBox();
//			// When we enter invalid email address the new element "ErrorForm is displayed
//			assertTrue(textBoxPage.isFieldErrorDisplayed());
//		}
//
//	}
//
//	@Test(priority = 140)
//	public void verifyThatTextDoNotAppearWhenUserDoNotInputText() {
//		homePage.clickEelementsTab();
//		elementsPage.clickTextBox();
//		textBoxPage.clickSubmitButtonTextBox();
//		try {
//			assertFalse(textBoxPage.isDisplayedAllResultTextBox());
//
//		} catch (Exception NoSuchElementException) {
//			System.out.println("There is no text result box element");
//		}
//
//	}
//
//	@Test(priority = 150)
//	public void verifyClickOnBrowserWindows() {
//		homePage.clickAlertsFrameTab();
//		alertsFramePage.clickBrowserWindows();
//		// Verify if the Header Browser is displayed
//		assertTrue(browserWindowsPage.getTextBrowserWindowsHeader().isDisplayed());
//		// Verify if the text in the BrowserWindows header page is equal to "Browser
//		// Windows"
//		assertEquals(browserWindowsPage.textFromBrowserWindowsHeader(), excelReader.getStringData("Test", 29, 2));
//
//	}
//
//	@Test(priority = 160)
//	public void verifyClickOnNewTabButton() throws InterruptedException {
//		homePage.clickAlertsFrameTab();
//		alertsFramePage.clickBrowserWindows();
//		browserWindowsPage.clickNewTabButton();
//
//		// We must switch to the second tab so we can verify text
//		ArrayList<String> listaTabova = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(listaTabova.get(1));
//
//		// Verify if the text in the new Sample page is equal to "This is a sample page"
//		assertEquals(browserWindowsPage.textNewSamplePage(), excelReader.getStringData("Test", 31, 2));
//		driver.close();
//		driver.switchTo().window(listaTabova.get(0));
//
//	}
//
//	@Test(priority = 170)
//	public void verifyClickOnNewWindowButton() {
//		homePage.clickAlertsFrameTab();
//		alertsFramePage.clickBrowserWindows();
//		browserWindowsPage.clickNewWindowButton();
//		// We must switch to the new window tab so we can verify text
//		ArrayList<String> listaTabova = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(listaTabova.get(1));
//		// Verify if the text in the new Sample page is equal to "This is a sample page"
//		assertEquals(browserWindowsPage.textNewSamplePage(), excelReader.getStringData("Test", 33, 2));
//		driver.close();
//		driver.switchTo().window(listaTabova.get(0));
//	}
//
//	@Test(priority = 180) // do not want to load
//	public void verifyClickOnNewWindowMessageButton() throws InterruptedException {
//		homePage.clickAlertsFrameTab();
//		alertsFramePage.clickBrowserWindows();
//		browserWindowsPage.clickNewWindowMessageButton();
//		// We must switch to the new window tab so we can verify message
//		ArrayList<String> listaTabova = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(listaTabova.get(0));
//
//		System.out.println(driver.getTitle());
//
//	}
//
//	@Test(priority = 190)
//	public void verifyThatWhenUserClickOnAlertsNewPageAlertsIsOpened() {
//		homePage.clickAlertsFrameTab();
//		alertsFramePage.clickAlerts();
//		// Verify that Alert Header text is equal "Alerts"
//		assertEquals(alertsPage.textFromAlertsHeader(), excelReader.getStringData("Test", 38, 2));
//	}
//
//	@Test(priority = 200)
//	public void verifyThatWhenUserClicksOnButtonAlertDisappears() {
//		homePage.clickAlertsFrameTab();
//		alertsFramePage.clickAlerts();
//		alertsPage.clickButtonAlert();
//		// Verify that text of alert is equal "You clicked a button" than accept alert
//		assertEquals(alertsPage.alertPop().getText(), excelReader.getStringData("Test", 40, 2));
//		alertsPage.alertPop().accept();
//
//	}
//
//	@Test(priority = 210)
//	public void verifyThatWhenUserClickOnOKButtonTimeAlertDisappear() {
//		homePage.clickAlertsFrameTab();
//		alertsFramePage.clickAlerts();
//		alertsPage.clickButtonTimerAlert();
//		// Verify that text of alert is equal "This alert appeared after 5 seconds" than
//		// accept alert
//		assertEquals(alertsPage.alertPop().getText(), excelReader.getStringData("Test", 42, 2));
//		alertsPage.alertPop().accept();
//	}
//
//	@Test(priority = 220)
//	public void verifyAlertConfirmOkButton() {
//		homePage.clickAlertsFrameTab();
//		alertsFramePage.clickAlerts();
//		alertsPage.clickButtonConfirmBoxAlert();
//		// Verify text inside Alert box is "Do you confirm action?"
//		assertEquals(alertsPage.alertPop().getText(), excelReader.getStringData("Test", 44, 2));
//		alertsPage.alertPop().accept();
//		// Verify that text appears equals "You selected Ok"
//		assertEquals(alertsPage.textAlertResult(), excelReader.getStringData("Test", 46, 2));
//
//	}
//
//	@Test(priority = 230)
//	public void verifyAlertConfirmCancelButton() {
//		homePage.clickAlertsFrameTab();
//		alertsFramePage.clickAlerts();
//		alertsPage.clickButtonConfirmBoxAlert();
//		// Verify text inside Alert box is "Do you confirm action?"
//		assertEquals(alertsPage.alertPop().getText(), excelReader.getStringData("Test", 44, 2));
//		alertsPage.alertPop().dismiss();
//		// Verify that text appears equals "You selected Cancel"
//		assertEquals(alertsPage.textAlertResult(), excelReader.getStringData("Test", 48, 2));
//
//	}
//
//	@Test(priority = 240)
//	public void verifyAlertPromptActions() {
//		homePage.clickAlertsFrameTab();
//		alertsFramePage.clickAlerts();
//		alertsPage.clickButtonPromptAlert();
//		alertsPage.alertPop().sendKeys(excelReader.getStringData("Test", 52, 1));
//		// Verify that text inside prompt equals “Please enter your name”
//		assertEquals(alertsPage.alertPop().getText(), excelReader.getStringData("Test", 50, 2));
//		alertsPage.alertPop().accept();
//		// Verify if result of prompt is visible when user enter text "Vlada",
//		assertTrue(alertsPage.getPromptResult().isDisplayed());
//		// Verify if text of prompt result equals "You entered Vlada"
//		assertEquals(alertsPage.textPromptResult(), excelReader.getStringData("Test", 52, 2));
//
//		alertsPage.clickButtonPromptAlert();
//		alertsPage.alertPop().accept();
//		// Verify if result of prompt is not visible when user doesn't enter any text
//		// and accept alert
//		try {
//			assertFalse(alertsPage.getPromptResult().isDisplayed());
//		} catch (Exception NoSuchElementException) {
//			System.out.println("There is no prompt result (no text )");
//		}
//		alertsPage.clickButtonPromptAlert();
//		alertsPage.alertPop().dismiss();
//		// Verify if result of prompt is not visible when user doesn't enter any text
//		// and cancel alert
//		try {
//			assertFalse(alertsPage.getPromptResult().isDisplayed());
//		} catch (Exception NoSuchElementException) {
//			System.out.println("There is no prompt result (cancel)");
//		}
//		alertsPage.clickButtonPromptAlert();
//		alertsPage.alertPop().sendKeys(excelReader.getStringData("Test", 52, 1));
//		alertsPage.alertPop().dismiss();
//		// Verify if result of prompt is not visible when user enters text "Vlada",
//		// But click on cancel button
//		try {
//			assertFalse(alertsPage.getPromptResult().isDisplayed());
//		} catch (Exception NoSuchElementException) {
//			System.out.println("There is no prompt result (cancel with text)");
//		}
//
//	}

	@AfterMethod
	public void deleteCookies() {
		driver.manage().deleteAllCookies();

	}

}
