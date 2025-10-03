package part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckboxTest extends BaseTest {

    @Test
    public void testCheckbox() throws InterruptedException {
        var formsPage = homePage.goToForms().clickPracticeFormItem();
        Thread.sleep(2000);
        formsPage.checkReadingCheckbox();
        Thread.sleep(2000);
//        formsPage.uncheckReadingCheckbox();
        Thread.sleep(2000);
        Assert.assertTrue(formsPage.isReadingCheckboxSelected());
    }
}
