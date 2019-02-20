package com.epam.TA.componet;

import com.epam.TA.decorator.Element;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TextInput extends Element {


    public TextInput(WebElement webElement) {
        super(webElement);
    }


    public void sendMsgToField(CharSequence... charSequences) {
            webElement.clear();
            webElement.sendKeys(charSequences);
    }

}
