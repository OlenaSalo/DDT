package com.epam.TA.decorator;
import org.openqa.selenium.*;


public class Element implements IElement {
    protected WebElement webElement;

    public Element(WebElement webElement)
    {
        this.webElement=webElement;
    }

}
