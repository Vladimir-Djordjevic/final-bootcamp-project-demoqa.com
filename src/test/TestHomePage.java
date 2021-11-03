package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;

public class TestHomePage extends BaseClass {

	@BeforeMethod
	public void setUpPage() {
		driver.manage().window().maximize();
		driver.navigate().to(homeUrl);

	}

	@Test(priority = 10)
	public void verifyThatHeaderOfTheSiteIsPresent() {
		// Test if the site has a header element
		assertTrue(homePage.isHeaderDisplayed());
	}

	@Test(priority = 20) // Fail test - wrong year in the Footer of the site
	public void verifyFooterOfTheSite() {
		// Test that the footer of the site is visible
		assertTrue(homePage.getFooter().isDisplayed());

		// The test will fail because the year on site is 2020 instead of 2021
		assertEquals(homePage.textFooter(), excelReader.getStringData("Test", 3, 2));

	}

	@Test(priority = 30)
	public void linksHomePage() throws InterruptedException {
		homePage.clickJoinNowButton();
		// Create a list of tabs and switch to new one
		homePage.nextWindow();
		// Test if header text of Selenium Training Page equals "Selenium Certification
		// Training |
		// Enroll Now | Study Online"
		assertEquals(trainingPage.textHeaderTrainingPage(), excelReader.getStringData("Test", 5, 2));
		// Close a new window and switch to the first window
		homePage.firstWindow();
	}

	@Test(priority = 60)
	public void verifyClickOnAlertsFrameWindows() {
		homePage.clickAlertsFrameTab();
		// Test if the Header Alerts Frame Windows is displayed
		assertTrue(alertsFramePage.getAlertsHeader().isDisplayed());
		// Test if a text in the Alerts Frame & Window page header equals
		// "Alerts,Frame & Windows"
		assertEquals(alertsFramePage.textAlertsHeader(), excelReader.getStringData("Test", 11, 2));

	}

	@Test(priority = 70)
	public void verifyClickOnWidgets() {
		homePage.clickWidgetsTab();
		// Verify if the Header Widgets is displayed
		assertTrue(widgetsPage.getWidgetsHeader().isDisplayed());
		// Verify if a text in the Widgets Text page header equals "Widgets"
		assertEquals(widgetsPage.textWidgetsHeader(), excelReader.getStringData("Test", 13, 2));

	}

	@Test(priority = 80)
	public void verifyClickOnInteractions() {
		homePage.clickInteractionsTab();
		// Verify if the Header Interactions is displayed
		assertTrue(interactionsPage.getInteractionsHeader().isDisplayed());
		// Verify if a text in the Widgets Text page header equals "Widgets"
		assertEquals(interactionsPage.textInteractionsHeader(), excelReader.getStringData("Test", 15, 2));
	}

	@Test(priority = 90)
	public void verifyClickOnBookStoreApplication() {
		// We must scroll page so we used JavascriptExecutor
		homePage.clickBookStoreTab();
		// Verify if the Header Book Store Application is displayed
		assertTrue(bookStorePage.getBookStoreHeader().isDisplayed());
		// Verify if a text in the Book Store Text page header equals "Book Store
		// Application"
		assertEquals(bookStorePage.textBookStoreHeader(), excelReader.getStringData("Test", 17, 2));

	}

	@AfterMethod
	public void deleteCookies() {
		driver.manage().deleteAllCookies();

	}

}
