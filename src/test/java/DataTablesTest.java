import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DataTablesPage;
import resources.Constants;

public class DataTablesTest extends BaseTest{

    @Test
    public void tableOneTest() {
        DataTablesPage dataTablesPage = new DataTablesPage(driver);
        dataTablesPage.openPage();
        Assert.assertEquals(dataTablesPage.getFirstName(), "Frank");
        Assert.assertEquals(dataTablesPage.getLastName(), "Bach");
    }

    @Test
    public void tableTwoTest() {
        DataTablesPage dataTablesPage = new DataTablesPage(driver);
        dataTablesPage.openPage();
        Assert.assertEquals(dataTablesPage.getDue(), "$51.00");
        Assert.assertEquals(dataTablesPage.getWebsite(), "http://www.frank.com");
    }
}
