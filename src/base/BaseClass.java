package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.AlertsFramePage;
import pages.AlertsPage;
import pages.BookStorePage;
import pages.BrowserWindowsPage;
import pages.ElementsPage;
import pages.FormsPage;
import pages.HomePage;
import pages.InteractionsPage;
import pages.RadioButtonPage;
import pages.TextBoxPage;
import pages.TrainingPage;
import pages.WidgetsPage;

public class BaseClass {

	/*
	 * Uvod: Tokom testiranja koristim EclipseIDE, u kome su ubacene Selenium i
	 * ostale bibljioteke, koje su potrebne da bi se testiranje izvrsilo. Tokom
	 * testiranja koristim POM zato sto olaksava oraganizovanje i odrzavanje
	 * koda.Elemente definisem na jednom mestu (na stranicama za testiranje) koje
	 * kasnije koristim da bih testirao aplikaciju u test clasama. Koristim TesNG
	 * kako bih koristio anotacije: Before Class , After Class , Before Method,
	 * After Method i Test. Na ovaj nacin se ne ponavalja kod i lakse se vrsi
	 * testiranje. Da bih lakse radio Assert testove i izbegao "Hardkodiranje"
	 * koristim DataDrivenTesting (ApachePoi).Tako se direkno iz Excel tabele unose
	 * podaci koji su mi potrebni za testiranje. Testiranje trenutno izvrsavam na
	 * Chrome browseru jer trenutno ga koristi najvise korisnika Ako bude potrebe da
	 * se testira i na drugim browserima, treba ucitati i ubaciti u directory
	 * driver. Na primer gecko driver za Firefox.
	 */

	// U base clasi cu deklarisati driver ,webdriver i sve stranice koje cu dalje da
	// testiram.

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
	protected RadioButtonPage radioButtonPage;

	// Ovaj deo koda se izvrsava samo jednom na pocetku testiranja @BeforeClass
	// anotacija
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
		radioButtonPage = new RadioButtonPage(driver, wdwait);

	}

	// Na kraju testiranja zatvori i ugasi driver
	@AfterClass
	public void tearUp() {
		driver.close();
		driver.quit();
	}

}
