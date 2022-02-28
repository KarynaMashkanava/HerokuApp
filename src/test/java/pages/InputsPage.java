package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputsPage extends BasePage{

    @FindBy(xpath = "//input[@type='number']")
    private WebElement numberInput;

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void typeIntoNumberInput(CharSequence... keysToSend) {
        numberInput.sendKeys(keysToSend);
    }

    public String getNumberInputText() {
        return numberInput.getAttribute("value");
    }
}
