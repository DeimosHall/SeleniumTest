package com.demoqa.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utilities.DropDownUtility;
import utilities.JavaScriptUtility;

import java.util.ArrayList;
import java.util.List;

public class SelectMenuPage extends WidgetsPage {

    private final By carsMultiSelect = By.id("cars");

    public void selectCars(ArrayList<String> cars) {
        JavaScriptUtility.scrollToElementJS(carsMultiSelect);
        Select select = new Select(super.find(carsMultiSelect));
        cars.forEach(select::selectByVisibleText);
    }

    public List<String> getAllSelectedCars() {
        return DropDownUtility.getAllSelectedItems(carsMultiSelect);
    }
}
