package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;
import utilities.SwitchToUtility;

@Test
public class AlertsTest extends BaseTest {

    public void testAlerts() throws InterruptedException {
        var alertsPage = homePage.goToWindowsPage().clickAlertsPage();
        alertsPage.clickAlertButton();
        Thread.sleep(2000);
        String alertText = SwitchToUtility.getAlertText();
        String expectedAlertText = "You clicked a button";
        Assert.assertEquals(alertText, expectedAlertText);
        SwitchToUtility.acceptAlert();
    }

    public void testConfirmationAccepts() throws InterruptedException {
        var alertsPage = homePage.goToWindowsPage().clickAlertsPage();
        alertsPage.clickConfirmationAlertButton();
        Thread.sleep(2000);
        SwitchToUtility.acceptAlert();
        String resultText = alertsPage.getConfirmationResultText();
        String expectedAcceptText = "You selected Ok";
        Assert.assertEquals(resultText, expectedAcceptText);
    }

    public void testConfirmationDismiss() throws InterruptedException {
        var alertsPage = homePage.goToWindowsPage().clickAlertsPage();
        alertsPage.clickConfirmationAlertButton();
        Thread.sleep(2000);
        SwitchToUtility.dismissAlert();
        String resultText = alertsPage.getConfirmationResultText();
        String expectedDismissText = "You selected Cancel";
        Assert.assertEquals(resultText, expectedDismissText);
    }
}
