package rest.commonmethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonMethod {
	public static WebDriver driver;
	public static WebElement ele;
	public static List<WebElement> listele;

	
	
	
	public static void browserIntilization(String browserName) {

		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "G:\\geckodriver0.24\\geckodriver.exe");
			System.out.println("debug 1");
			driver = new FirefoxDriver();
			System.out.println("debug2");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("debug3");
			driver.get("https://www.facebook.com/");
			System.out.println("debug4");

		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
		} else {

			System.out.println("add new browser for setup");
		}

	}

	public static void clickOnbtnjavasCriptExcetor(WebElement ele) {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);

	}

	public static void clickonanybtnofpageusingjs(String buttonname, String xpath) {

		listele = driver.findElements(By.xpath(xpath));

		for (int i = 0; i < listele.size(); i++) {

			if (listele.get(i).getText().equalsIgnoreCase(buttonname))

				listele.get(i).click();
		}

	}

	public static void clickDropdownBtnandSelectoption(WebElement btn,String optionxpath, int index) {

		if (btn.isDisplayed()&& (btn.isEnabled()))
				{


				btn.click();
			}
       ele = driver.findElement(By.xpath(optionxpath));
		Select s = new Select(ele);
		s.selectByIndex(index);

	}

}
