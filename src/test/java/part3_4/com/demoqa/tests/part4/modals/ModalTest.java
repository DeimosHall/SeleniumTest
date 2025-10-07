package part3_4.com.demoqa.tests.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ModalTest extends BaseTest {

    @Test
    public void testModalDialog() {
        var modalsPage = homePage.goToWindowsPage().clickModalDialogsItem();
        modalsPage.clickSmallModalButton();
        String modalText = modalsPage.getModalBodyText();
        String expectedModalText = "small modal";
//        modalsPage.clickCloseModalButton();
        Assert.assertTrue(modalText.contains(expectedModalText), "Modal text does not contain expected text" +
                "\nExpected text: " + expectedModalText +
                "\nFound text: " + modalText);
    }
}
