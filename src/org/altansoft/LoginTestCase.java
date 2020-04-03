package org.altansoft;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginTestCase {
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace1\\POM\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		PageFactory.initElements(driver, LoginObjects.class);
		LoginObjects.userName.sendKeys("sundar");
		LoginObjects.password.sendKeys("sundar");
		LoginObjects.btnSubmit.click();
		
		
	}

}
