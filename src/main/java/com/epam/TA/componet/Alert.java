package com.epam.TA.componet;

import com.epam.TA.decorator.Element;
import org.openqa.selenium.WebElement;

public class Alert extends Element {
    public Alert(WebElement webElement) {
        super(webElement);
    }
    public boolean isCheck() {
        return webElement.isDisplayed();
    }
}
