package com.ict18801.assignment.pages;

import com.ict18801.assignment.base.TestBase;
import com.ict18801.assignment.util.TestUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ApproveTTPage extends TestBase {
    @FindBy(xpath = "//td/div[contains(text(),'Approve Time-Track')]")
    WebElement ttPageHeadingText;
    @FindBy(xpath = "//div[@id='selectAllButton']")
    WebElement selectAllButton;
    //    @FindBy(xpath = "//div[@id='deselectAllButton']")
//    WebElement deSelectAllButton;
    @FindBy(xpath = "//div/span[@id='approveButton']")
    WebElement approveAllButton;
    @FindBy(xpath = "//div/span[@id='rejectButton']")
    WebElement rejectAllButton;
    @FindBy(xpath = "//tbody[2]/tr[2]/td[2]/span[1][contains(text(),'Approved')]")
    WebElement approvalText;
    @FindBy(xpath = "//tbody[2]/tr[2]/td[2]/span[1][contains(text(),'Reject')]")
    WebElement rejectText;

    public ApproveTTPage() {
        PageFactory.initElements(driver, this);
    }

    public String validateTitle() {
        return driver.getTitle();
    }

    public boolean acceptAlltt() {
        selectAllButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
        approveAllButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
        return approvalText.isDisplayed();
    }

    public boolean rejectAlltt() {
        selectAllButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
        rejectAllButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
        return rejectText.isDisplayed();
    }

}
