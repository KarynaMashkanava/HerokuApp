import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;
import resources.Constants;

public class AlertTest extends BaseTest{

    @Test
    public void checkJsAlertTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertPage();
        alertsPage.openAlert();
        Assert.assertEquals(alertsPage.getAlertText(), "I am a JS Alert");
    }

    @Test
    public void checkJsConfirmTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertPage();
        alertsPage.openConfirm();
        Assert.assertEquals(alertsPage.getAlertConfirmText(), "I am a JS Confirm");
    }

    @Test
    public void checkJsPromptTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertPage();
        alertsPage.openPrompt();
        alertsPage.sendText("Alert Text");
        Assert.assertEquals(alertsPage.getAlertPromptText(), "You entered: Alert Text");
    }
}
