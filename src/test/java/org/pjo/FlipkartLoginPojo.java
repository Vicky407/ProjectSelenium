package org.pjo;

import org.bass.BaseClass2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPojo extends BaseClass2 {
     
	public FlipkartLoginPojo() {
		PageFactory.initElements(driver, this);
	 }
     @FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
     private WebElement mail;
     
     @FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
     private WebElement login;

	public WebElement getMail() {
		return mail;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
     
}
