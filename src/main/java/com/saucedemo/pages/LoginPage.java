package com.saucedemo.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By usernameField = By.id("user-name");
    private By passowordField = By.id("password");
    private By loginButtonField = By.id("login-button");
    private By errorMessageField = By.tagName("h3");

    // Setter methods
    public void setUsername(String username) {
        super.set(usernameField, username);
    }

    public void setPassword(String password) {
        super.set(passowordField, password);
    }

    // Transition method
    public ProductsPage clickLoginButton() {
        super.click(loginButtonField);
        return new ProductsPage();
    }

    public ProductsPage loginAs(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage() {
        return super.find(errorMessageField).getText();
    }
}
