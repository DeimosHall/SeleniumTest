package com.demoqa.windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import utilities.JavaScriptUtility;

public class WindowsPage extends HomePage {

    private By modalDialogsItem = By.xpath("//div[@class='left-pannel']//span[text()='Modal Dialogs']");

    public ModalDialogsPage clickModalDialogsItem() {
        JavaScriptUtility.scrollToElementJS(modalDialogsItem);
        super.click(modalDialogsItem);
        return new ModalDialogsPage();
    }
}
