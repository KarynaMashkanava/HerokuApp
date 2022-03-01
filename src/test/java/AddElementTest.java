import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemoveElementsPage;
import resources.Constants;


public class AddElementTest extends BaseTest{

    @Test
    public void addElementTest() {
        AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage(driver);
        addRemoveElementsPage.openPage();
        addRemoveElementsPage.clickAddElementButton();
        addRemoveElementsPage.clickAddElementButton();
        addRemoveElementsPage.clickFirstDeleteButton();
        Assert.assertEquals((int) addRemoveElementsPage.getNumberOfDeleteButtons(), 1);
    }
}
