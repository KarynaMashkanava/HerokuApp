package pages;

import jdk.internal.util.xml.impl.Input;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.Constants;

public class FileUploaderPage extends BasePage{

    @FindBy (id = "file-upload")
    private WebElement selectFileInput;

    @FindBy (id = "file-submit")
    private WebElement submitInput;

    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }

    public FileUploaderPage openFileUploaderPage() {
        driver.get(Constants.FILEUPLOADER_PAGE_URL);
        return this;
    }

    public FileUploaderPage selectFile(String path) {
        selectFileInput.sendKeys(path);
        return this;
    }

    public FileUploadedPage clickSubmitButton() {
        submitInput.click();
        return new FileUploadedPage(driver);
    }

}
