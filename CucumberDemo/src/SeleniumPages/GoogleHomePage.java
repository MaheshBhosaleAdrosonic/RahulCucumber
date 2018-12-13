package SeleniumPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import common.BasePage;

public class GoogleHomePage extends BasePage {

	public void initializeWebEnvirnoment() {
		System.setProperty("webdriver.chrome.driver", "E:\\Mahesh\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void openURLInBrowser() {
		driver.get("http://www.google.com");
	}

	public void checkSearchBoxIsDisplayed() {
		if (driver.findElement(By.name("q")).isDisplayed()) {
			System.out.println("Search text box is displayed");
		} else {
			System.out.println("Search text box is NOT displayed");
		}
	}

	public void checkGoogleSearchButtonIsDisplayed() {
		if (driver.findElement(By.name("btnK")).isDisplayed()) {
			System.out.println("Google Search button is displayed");
		} else {
			System.out.println("Google Search button is NOT displayed");
		}
	}

	public void checkImFeelingLuckyButtonIsDisplayed() {
		if (driver.findElement(By.name("btnI")).isDisplayed()) {
			System.out.println("I'm Feeling Lucky button is displayed");
		} else {
			System.out.println("I'm Feeling Lucky button is NOT displayed");
		}
	}

	public void searchOnGoogleHomepage(String keyword) {
		driver.findElement(By.name("q")).sendKeys(keyword);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("btnK")).click();
	}
}
