package com.qa.FlipkartShopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPages {

	WebDriver driver;

	public FlipkartPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement Username;

	public WebElement getUsername() {
		return Username;
	}

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement Password;

	public WebElement getPassword() {
		return Password;
	}

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
	WebElement GetLogin;

	public WebElement GetLogin() {
		return GetLogin;
	}

	@FindBy(name = "q")
	WebElement SearchItem;

	public WebElement SearchItem() {
		return SearchItem;
	}

	@FindBy(xpath = "/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img")
	WebElement SelectItem;

	public WebElement SelectItem() {
		return SelectItem;
	}

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")
	WebElement BuyNow;

	public WebElement BuyNow() {
		return BuyNow;
	}

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button")
	WebElement Continue;

	public WebElement Continue() {
		return Continue;
	}

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[4]/button")
	WebElement Login;

	public WebElement Login() {
		return Login;
	}

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div[3]/span[2]/button")
	WebElement ContinueForPurchase;

	public WebElement ContinueForPurchase() {
		return ContinueForPurchase;
	}
	
	
	
	@FindBy(xpath="[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div")
	WebElement Verification;

	public WebElement GetVerification() {
		return Verification;
	}
}
