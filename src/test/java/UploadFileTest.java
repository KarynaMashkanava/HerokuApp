import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.FileUploadedPage;
import pages.FileUploaderPage;

public class UploadFileTest extends BaseTest {

    private String name = "file.txt";
    private String path = "/Users/KarinaMashkanova/Documents/HerokuApp/src/test/java/resources/file.txt";

    @Test
    public void uploadFileTest() {
        FileUploaderPage fileUploaderPage = new FileUploaderPage(driver);
        FileUploadedPage page = fileUploaderPage.openFileUploaderPage().selectFile(path).clickSubmitButton();
        Assert.assertEquals(page.getUploadedFileName(), name);
    }
}
