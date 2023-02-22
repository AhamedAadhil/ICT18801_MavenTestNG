package com.ict18801.assignment.pages;

import com.ict18801.assignment.base.TestBase;
import com.ict18801.assignment.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class UsersPage extends TestBase {
    @FindBy(xpath = "//div[contains(text(),'Users')]")
    WebElement usersText;
    @FindBy(xpath = "//div[contains(text(),'New User')]")
    WebElement newUserButton;
    @FindBy(xpath = "//div[contains(@class,'create_user_sliding_panel sliding_panel components_panelContainer')]")
    WebElement newUserSidePannel;
    @FindBy(xpath = "//div[contains(text(),'Add User')]")
    WebElement addUserText;
    @FindBy(xpath = "//input[@placeholder='First Name' and @id='createUserPanel_firstNameField']")
    WebElement firstname;

    @FindBy(xpath = "//input[@placeholder='MI' and @id='createUserPanel_middleNameField']")
    WebElement middlename;
    @FindBy(xpath = "//input[@placeholder='Last Name' and @id='createUserPanel_lastNameField']")
    WebElement lastname;
    @FindBy(xpath = "//input[@placeholder='Email' and @id='createUserPanel_emailField']")
    WebElement email;
    @FindBy(xpath = "//div[contains(text(),'Save & Send Invitation')]")
    WebElement saveButton;

    public UsersPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean validateUsersText() {
        return usersText.isDisplayed();
    }

    public boolean clickNewUserButton() {
        newUserButton.click();
        String cssValue = newUserSidePannel.getCssValue("display");
        return cssValue.contains("block") && addUserText.isDisplayed();
    }

    public void fillTheForm(String fname, String lname, String mname, String mail) {
        clickNewUserButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
        firstname.sendKeys(fname);
        middlename.sendKeys(mname);
        lastname.sendKeys(lname);
        email.sendKeys(mail);
        saveButton.click();
    }
}
