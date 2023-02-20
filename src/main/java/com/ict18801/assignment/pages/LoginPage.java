package com.ict18801.assignment.pages;

import com.ict18801.assignment.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    //PageFactory/ OR(Object Repo)
    @FindBy(name = "username")
    WebElement username;
    @FindBy(name = "pwd")
    WebElement password;
    @FindBy(id = "loginButton")
    WebElement loginButton;
    @FindBy(xpath = "//div[contains(@class,'atLogoImg')]")
    WebElement logo;

    //Constructor to init Elements
    public LoginPage() {
        PageFactory.initElements(driver, this);//LoginPage.this  instead of this keyword
    }

    //Actions
    public String validateLoginPageTitle() {
        return driver.getTitle();
    }

    public boolean validateLogo() {
        return logo.isDisplayed();
    }

    public HomePage login(String un, String pw) {
        username.sendKeys(un);
        password.sendKeys(pw);
        loginButton.click();
        return new HomePage();
    }

}
