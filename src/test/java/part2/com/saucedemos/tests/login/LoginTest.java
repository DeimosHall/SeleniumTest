package part2.com.saucedemos.tests.login;

import com.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemos.base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void testErrorLoginErrorMessage() throws InterruptedException {
        loginPage.setUsername("wrong user");
        loginPage.setPassword("wrong password");
        loginPage.clickLoginButton();
        String errorMessage = loginPage.getErrorMessage();
        String expectedErrorMessage = "Epic sadface";
        Thread.sleep(2000);
        Assert.assertTrue(errorMessage.contains(expectedErrorMessage));
    }

    @Test
    public void testErrorLoginOnWrongPassword() throws InterruptedException {
        loginPage.loginAs("visual_user", "wrong password");
        String errorMessage = loginPage.getErrorMessage();
        String expectedErrorMessage = "Epic sadface";
        Thread.sleep(2000);
        Assert.assertTrue(errorMessage.contains(expectedErrorMessage));
    }

    @Test void testLoginSuccess() throws InterruptedException {
        ProductsPage productsPage = loginPage.loginAs("visual_user", "secret_sauce");
        Thread.sleep(2000);
        Assert.assertTrue(productsPage.isProductsHeaderDisplayed());
    }
}
