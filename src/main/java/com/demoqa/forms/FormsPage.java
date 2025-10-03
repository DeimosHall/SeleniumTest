package com.demoqa.forms;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import utilities.JavaScriptUtility;

public class FormsPage extends HomePage {

    private By practiceFormMenuItem = By.xpath("//li[@id='item-0']//span[text()='Practice Form']");

    public PracticeFormPage clickPracticeFormItem() {
        JavaScriptUtility.scrollToElementJS(practiceFormMenuItem);
        super.click(practiceFormMenuItem);
        return new PracticeFormPage();
    }
}
