package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;

public class TestCheckBox extends BaseClass {

	@BeforeMethod
	public void setUpPage() {
		driver.manage().window().maximize();
		driver.navigate().to(homeUrl);
		homePage.clickEelementsTab();
		elementsPage.clickCheckBox();

	}

	@Test(priority = 10)
	public void verifyHeaderCheckBox() {
		assertEquals(checkBoxPage.textBoxMainHeader(), excelReader.getStringData("Test", 54, 2));
		System.out.println();
	}
}
