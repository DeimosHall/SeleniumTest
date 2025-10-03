package com.demoqa.elements;

import org.openqa.selenium.By;

public class WebTablesPage extends ElementsPage {

    private By registrationAgeField = By.id("age");
    private By registrationSubmitButton = By.id("submit");

    public void clickEdit(String email) {
        var edit = By.xpath("//div[text()='" + email + "']//following::span[@title='Edit']");
        super.click(edit);
    }

    public void setRegistrationAgeField(String age) {
        super.set(registrationAgeField, age);
    }

    public void clickRegistrationSubmitButton() {
        super.click(registrationSubmitButton);
    }

    public String getTableAgeOf(String email) {
        By age = By.xpath("//div[text()='" + email + "']//preceding::div[1]");
        return super.find(age).getText();
    }
}
