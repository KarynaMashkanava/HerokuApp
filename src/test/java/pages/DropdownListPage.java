package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import resources.Constants;

public class DropdownListPage extends BasePage{

    @FindBy(id = "dropdown")
    private WebElement selectElement;

    public DropdownListPage(WebDriver driver) {
        super(driver);
    }

    public void openDropdownListPage() {
        driver.get(Constants.DROPDOWNLIST_PAGE_URL);
    }

    public void selectByText(String textToSelect) {
        Select select = new Select(selectElement);
        select.selectByVisibleText(textToSelect);
    }

    public String getTextSelectElement() {
        Select select = new Select(selectElement);
        return select.getFirstSelectedOption().getText();
    }
}
