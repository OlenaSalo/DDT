package com.epam.TA.componet;
import com.epam.TA.decorator.Element;
import org.openqa.selenium.*;


public class Button extends Element {

    public Button(WebElement webElement) {
        super(webElement);
    }


    public void click() {
        if (webElement.isEnabled()) {
            webElement.click();
        }
    }

}
