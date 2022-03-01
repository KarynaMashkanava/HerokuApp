package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.Constants;

import java.io.EOFException;
import java.util.List;

public class AddRemoveElementsPage extends BasePage {

    @FindBy(xpath = "//button[@onclick = 'addElement()']")
    private WebElement addElementButton;

    @FindBy(xpath = "//button[@class = 'added-manually']")
    private List<WebElement> deleteButton;

    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(Constants.ADD_REMOVE_ELEMETS_URL);
    }

    public void clickAddElementButton() {
        addElementButton.click();
    }

    public void clickFirstDeleteButton() {
        deleteButton.get(0).click();
    }

    public Integer getNumberOfDeleteButtons(){
        return deleteButton.size();
    }
}

