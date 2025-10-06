package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class SelectDropDownTests extends BaseTest {

    @Test
    public void testMultiSelectDropDown() throws InterruptedException {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Opel");
        cars.add("Audi");

        var widgetsPage = homePage.goToWidgetsPage().clickSelectMenu();
        Thread.sleep(2000);
        widgetsPage.selectCars(cars);
        Thread.sleep(2000);
        List<String> selectedOptions = widgetsPage.getAllSelectedCars();
//        cars.add("hello");

        cars.forEach(car -> Assert.assertTrue(selectedOptions.contains(car), car + " was not selected"));
    }
}
