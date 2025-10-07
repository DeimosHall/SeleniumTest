package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;
import utilities.SwitchToUtility;

public class AlertsTest extends BaseTest {

    @Test
    public void testAlerts() throws InterruptedException {
        var alertsPage = homePage.goToWindowsPage().clickAlertsPage();
        alertsPage.clickAlertButton();
        Thread.sleep(2000);
        String alertText = SwitchToUtility.getAlertText();
        String expectedAlertText = "You clicked a button";
        Assert.assertEquals(alertText, expectedAlertText);
        SwitchToUtility.acceptAlert();
    }
}
