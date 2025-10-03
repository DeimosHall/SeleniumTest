package part3_4.com.demoqa.tests.part3.forms;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;
import utilities.JavaScriptUtility;

public class RadioButtonsTest extends BaseTest {

    @Test
    public void testRadioButton() throws InterruptedException {
        var formsPage = homePage.goToForms().clickPracticeFormItem();
        Thread.sleep(2000);
        formsPage.clickFemaleRadioButton();
        Thread.sleep(2000);
        Assert.assertTrue(formsPage.isFemaleSelected(), "Female radio button is not selected");
    }
}
