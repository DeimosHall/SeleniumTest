package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DateTest extends BaseTest {

    @Test
    public void testSelectingDate() {
        var datePickerPage = homePage.goToWidgetsPage().clickDatePicker();
        datePickerPage.clickSelectDate();
        String month = "December";
        String monthNumber = "12";
        String day = "31";
        String year = "2025";
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickOnDay(day);

        String date = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        Assert.assertEquals(date, expectedDate, "date: " + date);
    }
}
