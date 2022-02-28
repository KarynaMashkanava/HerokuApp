package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.Constants;

public class DataTablesPage extends BasePage{

    @FindBy(xpath = "//table[@id = 'table1']//td[text() = 'fbach@yahoo.com']/preceding-sibling::td[1]")
    private WebElement firstName;

    @FindBy(xpath = "//table[@id = 'table1']//td[text() = 'fbach@yahoo.com']/preceding-sibling::td[2]")
    private WebElement lastName;

    @FindBy(xpath = "//table[@id = 'table2']//td[text() = 'fbach@yahoo.com']/following-sibling::td[1]")
    private WebElement due;

    @FindBy(xpath = "//table[@id = 'table2']//td[text() = 'fbach@yahoo.com']/following-sibling::td[2]")
    private WebElement website;

    public DataTablesPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(Constants.DATA_TABLES_URL);
    }

    public String getFirstName() {
        return firstName.getText();
    }

    public String getLastName() {
        return lastName.getText();
    }

    public String getDue() {
        return due.getText();
    }

    public String getWebsite() {
        return website.getText();
    }
}
