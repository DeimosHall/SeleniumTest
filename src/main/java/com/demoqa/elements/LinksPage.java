package com.demoqa.elements;

import org.openqa.selenium.By;
import utilities.JavaScriptUtility;

public class LinksPage extends ElementsPage {

    private final By badRequestLinkElement = By.id("bad-request");
    private final By linkResponseText = By.id("linkResponse");

    public void clickBadRequestLink() {
        JavaScriptUtility.scrollToElementJS(badRequestLinkElement);
        super.click(badRequestLinkElement);
    }

    public String getLinkResponseText() {
        JavaScriptUtility.scrollToElementJS(linkResponseText);
        return super.find(linkResponseText).getText();
    }
}
