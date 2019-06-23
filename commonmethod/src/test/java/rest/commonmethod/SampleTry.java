package rest.commonmethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SampleTry extends CommonMethod {
	public static InputStream i;
	public static Properties p;

	@Test(enabled = false)
	public void clickOnbtn() {

		CommonMethod.browserIntilization("fiReFox");
		// CommonMethod.clickOnbtnjavasCriptExcetor(driver.findElement(By.xpath("//button[@id='u_0_15']")));
		// CommonMethod.clickonanybtnofpageusingjs("Log in",
		// "//button[@id='u_0_15']] |//input[@type='submit'");
		CommonMethod.clickDropdownBtnandSelectoption(driver.findElement(By.id("day")), "//select[@name='birthday_day']",
				11);
		// CommonMethod.clickOnDropdownBntandSelectoption(driver.findElement(By.id("day")),"//select[@name='birthday_day']",9);

	}

	@Test
	public void loadpro() throws IOException {

		i = new FileInputStream("properties/uicomparison.properties");
		p = new Properties();
		p.load(i);

		String list = p.getProperty("uifield");
		String[] array = list.split(",");

		for (int i = 0; i < array.length; i++) {

			System.out.println("value from prop" + "      " + array[i]);
		}

	}

}
