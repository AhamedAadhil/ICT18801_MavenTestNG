package com.ict18801.assignment.pages;

import com.ict18801.assignment.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage extends TestBase {
    @FindBy(xpath = "//div[contains(text(),'Users')]")
    WebElement usersText;

    public UsersPage(){
        PageFactory.initElements(driver,this);
    }
    public boolean validateUsersText(){
        return usersText.isDisplayed();
    }
}
