package org.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	// Launch Drivers
	public static void launchChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchEdgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	public static void launchFirefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	// Launch URL
	public static void launchUrl(String url) {
		driver.get(url);
	}

	// Send Text and Click
	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void toClick(WebElement element) {
		element.click();
	}

	// Actions
	public static void curserToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		;
	}

	public static void dragDrop(WebElement element, WebElement element1) {
		Actions a = new Actions(driver);
		a.dragAndDrop(element, element1).perform();
		;
	}

	public static void mouseDoubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
		;
	}

	public static void mouseRightClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}

	// Robot
	public static void pressEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void copy() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	public static void paste() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	public static void tab() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void selectAll() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
	}

	public static void deleteSelected() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);

	}

	public static void selectAndDelete() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);

	}

	// Screen Shots
	public static void takeSnap(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Dear\\Desktop\\.idea\\eclips\\BaseClass\\Imeage\\" + filename + ".png");
		FileUtils.copyFile(source, dest);
	}

	// Implicit wait
	public static void ImpliciteWait() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
	}

	// Window control
	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void closeCurrentPage() {
		driver.close();
	}

	public void closeBrowser() {
		driver.quit();
	}

	public static void toGetParrentWindoeId() {
		String parrentWindowId = driver.getWindowHandle();
	}

	public static void toGetAllWindoeId() {
		Set<String> allWindowId = driver.getWindowHandles();
	}

	// Frames
	public static void enterFrameUsingId(String id) {
		driver.switchTo().frame(id);
	}

	public static void enterFrameUsingName(String name) {
		driver.switchTo().frame(name);
	}

	public static void enterFrameUsingwebElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void enterFrameUsingindex(int index) {
		driver.switchTo().frame(index);
	}

	public static void moveToParentFrame() {
		driver.switchTo().parentFrame();
	}

	// Alert
	public static void toAcceptAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void toDismissAlert() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	public static void sendTextToAlert(String text) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(text);
	}

	// Get Web page Details
	public static void getTitleOfWebPage() {
		String title = driver.getTitle();
		System.out.println("Title of Current Web Page: " + title);
	}

	public static void getUrlOfWebPage() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL of the Web Page: " + currentUrl);
	}

	// Excel Actions
	public static String excelRead(String fileName, String sheetName, int rowNo, int cellNo) throws IOException {
		File f = new File("C:\\Users\\Dear\\Desktop\\.idea\\eclips\\DataDriven\\Excel\\" + fileName + ".xlsx");
		FileInputStream in = new FileInputStream(f);
		Workbook w = new XSSFWorkbook();

		// Workbook w = new XSSFWorkbook(in);
		Sheet sheet = w.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int type = cell.getCellType();
		String value;
		if (type == 1) {
			value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date d = cell.getDateCellValue();
			SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yyyy");
			value = simple.format(d);
		} else {
			double d = cell.getNumericCellValue();
			long l = (long) d;
			value = String.valueOf(l);
		}
		return value;
	}

	private void excelWrite(String sheetName, String fileName, int rowNo, int cellNo, String cellValues)
			throws IOException {
		File f = new File("C:\\Users\\Dear\\Desktop\\.idea\\eclips\\BaseClass\\ExcelSheets\\" + fileName + ".xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet(sheetName);
		Row r = s.createRow(rowNo);
		Cell c = r.createCell(cellNo);
		c.setCellValue(cellValues);
		FileOutputStream output = new FileOutputStream(f);
		w.write(output);
	}

	// SelectClass

	public static void selectDropDown(WebElement element, int a) {
		Select s = new Select(element);
		s.selectByIndex(a);
	}

	public static void selectDropDownByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}

	public static void selectDropDownByText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void deSelectDropDown(WebElement element, int a) {
		Select s = new Select(element);
		s.deselectByIndex(a);
	}

	public static void deSelectDropDownByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	public static void deSelectDropDownByText(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public static void deSelectAllDropDown(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

}
