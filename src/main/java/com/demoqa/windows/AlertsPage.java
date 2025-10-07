package com.demoqa.windows;

import org.openqa.selenium.By;
import utilities.JavaScriptUtility;

public class AlertsPage extends WindowsPage {

    private final By alertButton = By.id("alertButton");
    private final By confirmationResult = By.id("confirmResult");
    private final By confirmationAlertButton = By.id("confirmButton");

    public void clickAlertButton() {
        JavaScriptUtility.scrollToElementJS(alertButton);
        super.click(alertButton);
    }

    public void clickConfirmationAlertButton() {
        JavaScriptUtility.scrollToElementJS(confirmationAlertButton);
        super.click(confirmationAlertButton);
    }

    public String getConfirmationResultText() {
        return super.find(confirmationResult).getText();
    }
}
