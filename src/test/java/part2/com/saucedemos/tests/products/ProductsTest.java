package part2.com.saucedemos.tests.products;

import com.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemos.base.BaseTest;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage = loginPage.loginAs("visual_user", "secret_sauce");
        Assert.assertTrue(productsPage.isProductsHeaderDisplayed());
    }
}
