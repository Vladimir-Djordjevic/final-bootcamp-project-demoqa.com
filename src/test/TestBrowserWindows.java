package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;

public class TestBrowserWindows extends BaseClass {

	@BeforeMethod
	public void setUpPage() {
		driver.manage().window().maximize();
		driver.navigate().to(homeUrl);
		homePage.clickAlertsFrameTab();
		alertsFramePage.clickBrowserWindows();

	}

	@Test(priority = 10)
	public void verifyClickOnBrowserWindows() {
		// Verify if the Header Browser is displayed
		assertTrue(browserWindowsPage.getTextBrowserWindowsHeader().isDisplayed());
		// Verify if the text in the BrowserWindows header page is equal to "Browser
		// Windows"
		assertEquals(browserWindowsPage.textFromBrowserWindowsHeader(), excelReader.getStringData("Test", 29, 2));

	}

	@Test(priority = 20)
	public void verifyClickOnNewTabButton() throws InterruptedException {
		browserWindowsPage.clickNewTabButton();
		// We must switch to the second tab (child) window so we can verify text
		browserWindowsPage.nextWindow();
		// Verify if the text in the new Sample page is equal to "This is a sample page"
		assertEquals(browserWindowsPage.textNewSamplePage(), excelReader.getStringData("Test", 31, 2));
		// Close a new window and switch to the first window (parent) for further
		// testing
		browserWindowsPage.firstWindow();

	}

	@Test(priority = 30)
	public void verifyClickOnNewWindowButton() {
		browserWindowsPage.clickNewWindowButton();
		// We must switch to the new window tab so we can verify text
		browserWindowsPage.nextWindow();
		// Verify if the text in the new Sample page is equal to "This is a sample page"
		assertEquals(browserWindowsPage.textNewSamplePage(), excelReader.getStringData("Test", 33, 2));
		// Close a new window and switch to the first window (parent) for further
		// testing
		browserWindowsPage.firstWindow();
	}

//	@Test(priority = 40) // 
//	public void verifyClickOnNewWindowMessageButton() throws InterruptedException {
//		browserWindowsPage.clickNewWindowMessageButton();
//		// We must switch to the new window tab so we can verify message
//		browserWindowsPage.nextWindow();
//
//	}

	@AfterMethod
	public void deleteCookies() {
		driver.manage().deleteAllCookies();

	}

}
