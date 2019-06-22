	package rest.commonmethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTry extends CommonMethod
{
	@Test	
	public  void clickOnbtn(){
		
		CommonMethod.browserIntilization("fiReFox");
		//CommonMethod.clickOnbtnjavasCriptExcetor(driver.findElement(By.xpath("//button[@id='u_0_15']")));
		//CommonMethod.clickonanybtnofpageusingjs("Log in", "//button[@id='u_0_15']] |//input[@type='submit'");
		CommonMethod.clickDropdownBtnandSelectoption(driver.findElement(By.id("day")),"//select[@name='birthday_day']", 11);
		//CommonMethod.clickOnDropdownBntandSelectoption(driver.findElement(By.id("day")),"//select[@name='birthday_day']",9);
		
		
	
		
		
		
	}

}
