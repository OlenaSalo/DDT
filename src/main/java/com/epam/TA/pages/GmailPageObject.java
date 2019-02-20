package com.epam.TA.pages;
import com.epam.TA.componet.Button;
import com.epam.TA.componet.TextInput;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GmailPageObject extends GmailBasePage{


    @FindBy( id = "identifierId")
    private TextInput loginInput;

    @FindBy(xpath = "//div[contains(@id,'Next')]")
    private Button nextButton;

    @FindBy(xpath = "//div//input[@type='password']")
    private WebElement pswInput;


    public TextInput getLoginInput(){ return loginInput;}

    public void getPswInput(String psw) { sendPsw(pswInput, psw); }

    public Button getNextButton(){ return nextButton; }



}
