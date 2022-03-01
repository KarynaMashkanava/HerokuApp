import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NotificationMessagePage;
import resources.Constants;

public class NotificationMessageTest extends BaseTest {

    @Test
    public void notificationMessageTest() {
        NotificationMessagePage notificationMessagePage = new NotificationMessagePage(driver);
        notificationMessagePage.openPage();
        notificationMessagePage.clickElementClickHere();
        String expectedText = "Action successful";
        Assert.assertTrue(notificationMessagePage.getAlertText().contains(expectedText));
    }
}
