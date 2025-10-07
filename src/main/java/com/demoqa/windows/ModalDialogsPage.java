package com.demoqa.windows;

import org.openqa.selenium.By;
import utilities.JavaScriptUtility;

public class ModalDialogsPage extends WindowsPage {

    private final By smallModalButton = By.id("showSmallModal");
//    private final By smallModalBody = By.className("modal-body");
    private final By smallModalBody = By.xpath("//div[contains(text(), 'small modal')]");
    private final By closeModalButton = By.id("closeSmallModal");

    public void clickSmallModalButton() {
        JavaScriptUtility.scrollToElementJS(smallModalButton);
        super.click(smallModalButton);
    }

    public String getModalBodyText() {
        return super.find(smallModalBody).getText();
    }

    public void clickCloseModalButton() {
        JavaScriptUtility.scrollToElementJS(closeModalButton);
        super.click(closeModalButton);
    }
}
