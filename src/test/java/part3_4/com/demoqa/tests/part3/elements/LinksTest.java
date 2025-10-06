package part3_4.com.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class LinksTest extends BaseTest {

    @Test
    public void testLink() throws InterruptedException {
        var linksPage = homePage.goToElementsPage().goToLinksPage();
        Thread.sleep(2000);
        linksPage.clickBadRequestLink();
        Thread.sleep(2000);
        String responseText = linksPage.getLinkResponseText();
        String expectedResponseText = "Link has responded with staus 400 and status text Bad Request";
        Assert.assertEquals(responseText, expectedResponseText, "Response text is not equals to the expected text");
    }
}
