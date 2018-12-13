package SeleniumPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import common.BasePage;

public class AutomationPractice extends BasePage {

//	Actions action = new Actions(driver);

	public void initializeWebEnvirnoment() {
		try {
			Runtime.getRuntime().exec("taskkill /im chrome.exe /f /t");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver", "E:\\Mahesh\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void openURLInBrowser() {
		driver.get("http://automationpractice.com/index.php");
	}

	public boolean loginIntoApplication(String username, String password) {

		WebElement hdrYourLogo = driver.findElement(By.xpath("//div[@id='header_logo']"));

		if (hdrYourLogo.isDisplayed()) {

			driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();

			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);

			driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);

			driver.findElement(By.id("SubmitLogin")).click();

			verifyHomePageIsDisplayed();
		}

		else {
			return false;
		}
		return true;
	}

	public boolean verifyHomePageIsDisplayed() {

		WebElement hdrHomePage = driver.findElement(By.xpath("//h1[text()='My account']"));

		if (hdrHomePage.isDisplayed()) {
			System.out.println("Home page is Displayed...");
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	//	driver.findElement(By.xpath("//a[normalize-space()='Sign out']")).click();

		return true;
	}

	public boolean productAddIntoCartInApplication(String elePrinted) {

		Actions action = new Actions(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement lnkHome = driver.findElement(By.xpath("//a[@title='Return to Home']"));
		lnkHome.click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement lnkProduct = driver.findElement(
				By.xpath("//div[@class='product-container']//a[@title='Printed Dress']//img[@title='"+elePrinted+"']"));

		js.executeScript("arguments[0].scrollIntoView(true);", lnkProduct);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		action.moveToElement(lnkProduct).build().perform();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement btnAddToCart = driver.findElement(By.xpath(
				"//h5/a[normalize-space()='"+elePrinted+"']//ancestor::div[@class='right-block']//following-sibling::div[@class='button-container']//a"));

		btnAddToCart.click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();

		return true;

	}

	public boolean viewTheCart() {

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (driver.findElement(By.xpath("//h1[@id='cart_title']")).isDisplayed()) {

			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			String product = driver.findElement(By.xpath("//table[@id='cart_summary']//p[@class='product-name']//a"))
					.getText();

			if (product.equalsIgnoreCase("Printed Dress")) {

				System.out.println("Verified Product is in the Card.....");
			}

		}

		return true;

	}

	public boolean tearDownEnvirnoment() {
		driver.quit();
		return true;
	}
}
