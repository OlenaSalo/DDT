package com.epam.TA.componet;
import com.epam.TA.decorator.Element;
import org.openqa.selenium.*;


public class CheckBox extends Element {

    public CheckBox(WebElement webElement) {
        super(webElement);
    }

    public void setChecked() {
        if (!isChecked()) {
            webElement.click();
        }
    }
    public boolean isChecked() {
        return webElement.isSelected();
    }

}