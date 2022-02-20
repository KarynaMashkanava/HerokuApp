import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessageTest extends BaseTest {

    @Test
    public void notificationMessageTest() {
        driver.get(Constants.ALERTS_URL);
        WebElement elementClickHere = driver.findElement(By.linkText("Click here"));
        elementClickHere.click();
        WebElement elementAlertText = driver.findElement(By.id("flash"));
        String alertText = elementAlertText.getText();
        String expectedText = "Action successful";
        Assert.assertTrue(alertText.contains(expectedText));
    }
}
