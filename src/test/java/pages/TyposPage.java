package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.Constants;

public class TyposPage extends BasePage{

    @FindBy(xpath = "//div[@class='example']")
    private WebElement elementText;

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(Constants.TYPOS_URL);
    }

    public String getText(){
        return elementText.getText();
    }
}
