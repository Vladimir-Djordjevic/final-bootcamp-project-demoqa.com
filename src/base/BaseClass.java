package base;

import java.io.IOException;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.AlertsFramePage;
import pages.AlertsPage;
import pages.BookStorePage;
import pages.BrowserWindowsPage;
import pages.CheckBoxPage;
import pages.ElementsPage;
import pages.FormsPage;
import pages.HomePage;
import pages.InteractionsPage;
import pages.RadioButtonPage;
import pages.TextBoxPage;
import pages.TrainingPage;
import pages.WidgetsPage;

public class BaseClass {

	protected WebDriver driver;
	protected WebDriverWait wdwait;
	protected String homeUrl;
	protected ExcelReader excelReader;
	protected HomePage homePage;
	protected ElementsPage elementsPage;
	protected TextBoxPage textBoxPage;
	protected TrainingPage trainingPage;
	protected FormsPage formsPage;
	protected AlertsFramePage alertsFramePage;
	protected WidgetsPage widgetsPage;
	protected InteractionsPage interactionsPage;
	protected BookStorePage bookStorePage;
	protected BrowserWindowsPage browserWindowsPage;
	protected AlertsPage alertsPage;
	protected CheckBoxPage checkBoxPage;
	protected RadioButtonPage radioButtonPage;

	@BeforeClass
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		wdwait = new WebDriverWait(driver, 6);
		excelReader = new ExcelReader("TestCases\\ZavrsniProjekat.xlsx");
		homeUrl = excelReader.getStringData("Test", 0, 1);
		homePage = new HomePage(driver, wdwait);
		elementsPage = new ElementsPage(driver, wdwait);
		textBoxPage = new TextBoxPage(driver, wdwait);
		trainingPage = new TrainingPage(driver, wdwait);
		formsPage = new FormsPage(driver, wdwait);
		alertsFramePage = new AlertsFramePage(driver, wdwait);
		widgetsPage = new WidgetsPage(driver, wdwait);
		interactionsPage = new InteractionsPage(driver, wdwait);
		bookStorePage = new BookStorePage(driver, wdwait);
		browserWindowsPage = new BrowserWindowsPage(driver, wdwait);
		alertsPage = new AlertsPage(driver, wdwait);
		checkBoxPage = new CheckBoxPage(driver, wdwait);
		radioButtonPage = new RadioButtonPage(driver, wdwait);

	}

	@AfterClass
	public void tearUp() {
		driver.close();
		driver.quit();
	}

}
