package org.altansoft;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginObjects {
	@FindBy(how=How.ID,using="email")
	public static WebElement userName;
	
	@FindBy(how=How.ID,using="pass")
	public static WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	public static WebElement btnSubmit;
	
	
	

}
