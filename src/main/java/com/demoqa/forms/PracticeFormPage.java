package com.demoqa.forms;

import org.openqa.selenium.By;
import utilities.JavaScriptUtility;

public class PracticeFormPage extends FormsPage {

    private final By femaleRadioButton = By.id("gender-radio-2");
    private final By sportsCheckbox = By.id("hobbies-checkbox-1");
    private final By readingCheckbox = By.id("hobbies-checkbox-2");
    private final By musicCheckbox = By.id("hobbies-checkbox-3");

    public void clickFemaleRadioButton() {
        JavaScriptUtility.scrollToElementJS(femaleRadioButton);
//        super.click(femaleRadioButton);  // This sometimes doesn't work
        JavaScriptUtility.clickElement(femaleRadioButton);
    }

    public boolean isFemaleSelected() {
        return super.find(femaleRadioButton).isSelected();
    }

    private void checkCheckbox(By locator) {
        JavaScriptUtility.scrollToElementJS(locator);
        if (!super.find(locator).isSelected()) {
            JavaScriptUtility.clickElement(locator);
        }
    }

    private void uncheckCheckbox(By locator) {
        JavaScriptUtility.scrollToElementJS(locator);
        if (super.find(locator).isSelected()) {
            JavaScriptUtility.clickElement(locator);
        }
    }

    public void checkSportsCheckbox() {
        this.checkCheckbox(sportsCheckbox);
    }

    public void uncheckSportsCheckbox() {
        this.uncheckCheckbox(sportsCheckbox);
    }

    public void checkReadingCheckbox() {
        this.checkCheckbox(readingCheckbox);
    }

    public void uncheckReadingCheckbox() {
        this.uncheckCheckbox(readingCheckbox);
    }

    public boolean isReadingCheckboxSelected() {
        return super.find(readingCheckbox).isSelected();
    }

    public void checkMusicCheckbox() {
        this.checkCheckbox(musicCheckbox);
    }

    public void uncheckMusicCheckbox() {
        this.uncheckCheckbox(musicCheckbox);
    }
}
