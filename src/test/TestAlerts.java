package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;

public class TestAlerts extends BaseClass {

	@BeforeMethod
	public void setUpPage() {
		driver.manage().window().maximize();
		driver.navigate().to(homeUrl);
		homePage.clickAlertsFrameTab();
		alertsFramePage.clickAlerts();

	}

	@Test(priority = 10)
	public void verifyThatWhenUserClickOnAlertsNewPageAlertsIsOpened() {
		// Verify if the Alert Header is displayed
		assertTrue(alertsPage.getAlertsHeader().isDisplayed());
		// Verify that Alert Header text is equal "Alerts"
		assertEquals(alertsPage.textFromAlertsHeader(), excelReader.getStringData("Test", 38, 2));

	}

	@Test(priority = 20)
	public void verifyFirstAlert() {
		alertsPage.clickButtonAlert();
		// Verify that text in alert window is equal "You clicked a button"
		assertEquals(alertsPage.alertPop().getText(), excelReader.getStringData("Test", 40, 2));
		// Accept or dismiss alert so test will end
		alertsPage.alertPop().accept();

	}

	@Test(priority = 30)
	public void verifySecond5SecondsAlert() {
		alertsPage.clickButtonTimerAlert();
		// Verify that text of alert is equal "This alert appeared after 5 seconds"
		assertEquals(alertsPage.alertPop().getText(), excelReader.getStringData("Test", 42, 2));
		// accept alert
		alertsPage.alertPop().accept();
	}

	@Test(priority = 40)
	public void verifyAlertConfirmOkButton() {
		alertsPage.clickButtonConfirmBoxAlert();
		// Verify text inside Alert box is "Do you confirm action?"
		assertEquals(alertsPage.alertPop().getText(), excelReader.getStringData("Test", 44, 2));
		alertsPage.alertPop().accept();
		// Verify that text appears equals "You selected Ok"
		assertEquals(alertsPage.textAlertResult(), excelReader.getStringData("Test", 46, 2));

	}

	@Test(priority = 50)
	public void verifyAlertConfirmCancelButton() {
		alertsPage.clickButtonConfirmBoxAlert();
		// Verify text inside Alert box is "Do you confirm action?"
		assertEquals(alertsPage.alertPop().getText(), excelReader.getStringData("Test", 44, 2));
		alertsPage.alertPop().dismiss();
		// Verify that text appears equals "You selected Cancel"
		assertEquals(alertsPage.textAlertResult(), excelReader.getStringData("Test", 48, 2));

	}

	@Test(priority = 60) // Multiple tests on prompt
	public void verifyAlertPromptActions() {
		alertsPage.clickButtonPromptAlert();
		alertsPage.alertPop().sendKeys(excelReader.getStringData("Test", 52, 1));
		// Verify that text inside prompt equals “Please enter your name”
		assertEquals(alertsPage.alertPop().getText(), excelReader.getStringData("Test", 50, 2));
		alertsPage.alertPop().accept();
		// Verify if result of prompt is visible when user enter a text
		assertTrue(alertsPage.getPromptResult().isDisplayed());
		// Verify if text of prompt result equals "You entered Vlada"
		assertEquals(alertsPage.textPromptResult(), excelReader.getStringData("Test", 52, 2));

		alertsPage.clickButtonPromptAlert();
		alertsPage.alertPop().accept();
		// Verify if result of prompt is not visible when user doesn't enter any text
		// and accept alert
		try {
			assertFalse(alertsPage.getPromptResult().isDisplayed());
		} catch (Exception NoSuchElementException) {
			System.out.println("There is no prompt result (ok slected with no text )");
		}
		alertsPage.clickButtonPromptAlert();
		alertsPage.alertPop().dismiss();
		// Verify if result of prompt is not visible when user doesn't enter any text
		// and cancel alert
		try {
			assertFalse(alertsPage.getPromptResult().isDisplayed());
		} catch (Exception NoSuchElementException) {
			System.out.println("There is no prompt result (cancel)");
		}
		alertsPage.clickButtonPromptAlert();
		alertsPage.alertPop().sendKeys(excelReader.getStringData("Test", 52, 1));
		alertsPage.alertPop().dismiss();
		// Verify if result of prompt is not visible when user enters text "Vlada",
		// But click on cancel button
		try {
			assertFalse(alertsPage.getPromptResult().isDisplayed());
		} catch (Exception NoSuchElementException) {
			System.out.println("There is no prompt result (cancel with text)");
		}

	}

	@AfterMethod
	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}

}
