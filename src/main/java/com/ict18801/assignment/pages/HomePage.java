package com.ict18801.assignment.pages;

import com.ict18801.assignment.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    @FindBy(xpath = "//a[contains(@class,'userProfileLink username ')]")
    WebElement username;
    @FindBy(xpath = "//td[contains(text(),'Enter Time-Track')]")
    WebElement timeTrack;
    @FindBy(xpath = "//a[contains(@class,'content tasks')]")
    WebElement tasks;
    @FindBy(xpath = "//a[contains(@class,'content reports')]")
    WebElement reports;
    @FindBy(xpath = "//div[contains(text(),'Users')]")
    WebElement users;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String validateTitle() {
        logger.info(driver.getTitle());
        return driver.getTitle();
    }

    public boolean VerifyUsername() {
        logger.info(username.isDisplayed());
        return username.isDisplayed();
    }

    public TimeTrackPage ClickTimeTrack() {
        timeTrack.click();
        return new TimeTrackPage();
    }

    public TasksPage ClickTasks() {
        tasks.click();
        return new TasksPage();
    }

    public ReportsPage ClickReports() {
        reports.click();
        return new ReportsPage();
    }

    public UsersPage ClickUsers() {
        users.click();
        return new UsersPage();
    }
}
