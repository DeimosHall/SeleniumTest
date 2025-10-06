package com.demoqa.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import utilities.JavaScriptUtility;

public class WidgetsPage extends HomePage {

    private final By selectMenuItem = By.xpath("//span[text()='Select Menu']");

    public SelectMenuPage clickSelectMenu() {
        JavaScriptUtility.scrollToElementJS(selectMenuItem);
        super.click(selectMenuItem);
        return new SelectMenuPage();
    }
}
