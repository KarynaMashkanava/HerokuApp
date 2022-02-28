package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesPage extends BasePage {

    @FindBy(css = "input[type = 'checkbox']:first-child")
    private WebElement firstCheckbox;

    @FindBy(css = "input[type='checkbox']:nth-child(3)")
    private WebElement secondCheckbox;

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public void clickFirstCheckbox() {
        firstCheckbox.click();
    }

    public void secondCheckboxClick() {
        secondCheckbox.click();
    }

    public boolean firstCheckboxIsSelected() {
        return firstCheckbox.isSelected();
    }

    public boolean secondCheckboxIsSelected() {
        return secondCheckbox.isSelected();
    }
}
