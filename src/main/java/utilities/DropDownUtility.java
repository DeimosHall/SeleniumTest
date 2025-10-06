package utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownUtility extends Utility {

    private static Select findDropDown(By locator) {
        return new Select(driver.findElement(locator));
    }

    public static void selectItemByVisibleName(By locator, String name) {
        findDropDown(locator).selectByVisibleText(name);
    }

    public static void selectItemsByVisibleName(By locator, List<String> names) {
        Select select = findDropDown(locator);
        names.forEach(select::selectByVisibleText);
    }

    public static List<String> getAllSelectedItems(By locator) {
        List<WebElement> selectedOptions = findDropDown(locator).getAllSelectedOptions();
        return selectedOptions.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}
