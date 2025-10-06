package com.demoqa.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class ElementsPage extends HomePage {

    private By webTablesMenuItem = By.xpath("//span[text()='Web Tables']");
    private final By linksPage = By.xpath("//span[text()='Links']");

    public WebTablesPage goToWebTablesPage() {
        super.click(webTablesMenuItem);
        return new WebTablesPage();
    }

    public LinksPage goToLinksPage() {
        super.click(linksPage);
        return new LinksPage();
    }
}
