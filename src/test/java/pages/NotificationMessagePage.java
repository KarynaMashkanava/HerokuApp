package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.yaml.snakeyaml.scanner.Constant;
import resources.Constants;

public class NotificationMessagePage extends BasePage{

    @FindBy(linkText = "Click here")
    private WebElement elementClickHere;

    @FindBy(id = "flash")
    private WebElement elementAlertText;

    public NotificationMessagePage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(Constants.ALERTS_URL);
    }

    public void clickElementClickHere() {
        elementClickHere.click();
    }

    public String getAlertText() {
        return elementAlertText.getText();
    }
}
