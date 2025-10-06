package com.demoqa.pages;

import com.base.BasePage;
import com.demoqa.elements.ElementsPage;
import com.demoqa.forms.FormsPage;
import com.demoqa.widgets.WidgetsPage;
import org.openqa.selenium.By;
import utilities.JavaScriptUtility;

public class HomePage extends BasePage {

    private final By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private final By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private final By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");

    public FormsPage goToForms() {
        JavaScriptUtility.scrollToElementJS(formsCard);
        super.click(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElementsPage() {
        JavaScriptUtility.scrollToElementJS(elementsCard);
        super.click(elementsCard);
        return new ElementsPage();
    }

    public WidgetsPage goToWidgetsPage() {
        JavaScriptUtility.scrollToElementJS(widgetsCard);
        super.click(widgetsCard);
        return new WidgetsPage();
    }
}
