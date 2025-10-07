package com.demoqa.windows;

import org.openqa.selenium.By;
import utilities.JavaScriptUtility;

public class AlertsPage extends WindowsPage {

    private final By alertButton = By.id("alertButton");

    public void clickAlertButton() {
        JavaScriptUtility.scrollToElementJS(alertButton);
        super.click(alertButton);
    }
}
