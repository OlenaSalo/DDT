package com.epam.TA.pages;

import com.epam.TA.DriverManager;
import com.epam.TA.componet.CheckBox;
import com.epam.TA.componet.TextInput;
import com.epam.TA.decorator.CustomFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailBasePage {
private WebDriver driver;
private WebDriverWait wait;
    public GmailBasePage(){
        driver = DriverManager.getInstance().getDriver();
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(new CustomFieldDecorator(driver), this);
    }

    public void sendPsw(WebElement webElement, String psw)
    {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.sendKeys(psw);
    }

}


