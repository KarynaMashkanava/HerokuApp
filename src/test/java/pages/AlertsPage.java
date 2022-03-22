package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.Constants;

public class AlertsPage extends BasePage{

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    private WebElement alertButton;

    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
    private  WebElement confirmButton;

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    private WebElement promptButton;

    @FindBy(id = "result")
    private WebElement message;

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void openAlertPage() {
        driver.get(Constants.ALERTS_PAGE_URL);
    }

    public void openAlert() {
        alertButton.click();
    }

    public String getAlertText() {
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return alertText;
    }

    public void openConfirm() {
       confirmButton.click();
    }

    public String getAlertConfirmText() {
        String alertConfirmText = driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss();
        return alertConfirmText;
    }

    public void openPrompt() {
        promptButton.click();
    }

    public void sendText(String message) {
        driver.switchTo().alert().sendKeys(message);
        driver.switchTo().alert().accept();
    }

    public String getAlertPromptText() {
        String alertPromptText = message.getText();
        return alertPromptText;
    }
}


