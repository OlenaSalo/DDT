package com.epam.TA.pages;

import com.epam.TA.componet.Alert;
import com.epam.TA.componet.Button;
import com.epam.TA.componet.CheckBox;
import com.epam.TA.componet.TextInput;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class GmailHomePage extends GmailBasePage
{


    @FindBy(xpath = "//*[@class = 'oZ-x3 xY']//div[@role='checkbox']") //
    private List<CheckBox> selectMsg;

    @FindBy(xpath="//*[@id=':4']/div/div[1]/div[1]/div/div/div[2]/div[3]")
    private Button deleteButton;

    @FindBy(xpath = "//div[@class='vh']//span[@id='link_undo']")
    private Button canceledButton;

    @FindBy(xpath = "//*[@id='aso_search_form_anchor']/div/input")
    private TextInput search;

    @FindBy(xpath = "//div[@class='vh']//span[@class='aT']")
    private Alert canceledAlert;

    @FindBy(xpath = "//*[@id='aso_search_form_anchor']/button[4]")
    private Button searchButton;

    @FindBy(xpath = "//*[@class='Dj']/span/span[2]")
    private WebElement mailInTrash;



    public List<CheckBox> getSelectMsg(){ return selectMsg;}

    public Button getDeleteButton(){return deleteButton;}

    public  Button getCanceledButton(){return canceledButton;}

    public  Alert getCanceledAlert(){return canceledAlert;}

    public  TextInput getSearch(){return search;}

    public Button getSearchButton(){return searchButton;}

    public  WebElement getMailInTrash( ){return mailInTrash;}



}
