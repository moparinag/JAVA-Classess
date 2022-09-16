package com.Pages.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class nopCommerceLogin {

	public WebElement getUsername() {
		return Username;
	}

	public void setUsername(WebElement username) {
		Username = username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(WebElement password) {
		Password = password;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		LoginBtn = loginBtn;
	}

	@FindBy(id="Email")
	private WebElement Username;
	
	@FindBy(id="Password")
	private WebElement Password;
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	private WebElement LoginBtn;
}
