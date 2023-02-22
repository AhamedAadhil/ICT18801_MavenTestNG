package com.ict18801.assignment.tests;

import com.ict18801.assignment.base.TestBase;
import com.ict18801.assignment.pages.HomePage;
import com.ict18801.assignment.pages.LoginPage;
import com.ict18801.assignment.pages.UsersPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsersPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    UsersPage usersPage;

    public UsersPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        usersPage = homePage.ClickUsers();
    }

    @Test
    public void validateUsersTextTest() {
        boolean isVisible = usersPage.validateUsersText();
        Assert.assertTrue(isVisible, "The text Users is not visible");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
