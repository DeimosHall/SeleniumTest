package com.demoqa.widgets;

import org.openqa.selenium.By;
import utilities.DropDownUtility;
import utilities.JavaScriptUtility;

public class DatePickerPage extends WidgetsPage {

    private By selectDateField = By.id("datePickerMonthYearInput");
    private By monthDropDown = By.className("react-datepicker__month-select");
    private By yearDropDown = By.cssSelector(".react-datepicker__year-select");

    private By dayValue(String day) {
        return By.xpath("//div[contains(@class,'react-datepicker__day--')][text()='" + day + "']");
    }

    public void clickOnDay(String day) {
        super.click(dayValue(day));
    }

    public void clickSelectDate() {
        super.click(selectDateField);
    }

    public String getDate() {
        return super.find(selectDateField).getAttribute("value");
    }

    public void selectMonth(String month) {
        JavaScriptUtility.scrollToElementJS(monthDropDown);
        DropDownUtility.selectItemByVisibleName(monthDropDown, month);
    }

    public void selectYear(String year) {
        JavaScriptUtility.scrollToElementJS(yearDropDown);
        DropDownUtility.selectItemByVisibleName(yearDropDown, year);
    }
}
