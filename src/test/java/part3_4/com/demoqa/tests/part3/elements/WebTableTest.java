package part3_4.com.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {

    @Test
    public void testWebTable() throws InterruptedException {
        String email = "alden@example.com";
        String expectedAge = "20";

        var webTablePage = homePage.goToElementsPage().goToWebTablesPage();
        webTablePage.clickEdit(email);
        Thread.sleep(2000);
        webTablePage.setRegistrationAgeField(expectedAge);
        Thread.sleep(5000);
        webTablePage.clickRegistrationSubmitButton();
        String age = webTablePage.getTableAgeOf(email);
        Thread.sleep(5000);
        Assert.assertEquals(age, expectedAge);
    }
}
