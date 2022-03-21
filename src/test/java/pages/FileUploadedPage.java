package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadedPage extends BasePage{

    @FindBy(id = "uploaded-files")
    private WebElement uploadedFileNameElement;

    public FileUploadedPage(WebDriver driver) {
        super(driver);
    }

    public String getUploadedFileName() {
       return uploadedFileNameElement.getText();
    }
}
