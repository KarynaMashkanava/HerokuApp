import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DropdownListPage;

public class DropdownListTest extends BaseTest{

    private String optionOne = "Option 1";
    private String optionTwo = "Option 2";

    @Test(dataProvider = "testData")
    public void selectFirstElement(String data) {
        DropdownListPage dropdownListPage = new DropdownListPage(driver);
        dropdownListPage.openDropdownListPage();
        dropdownListPage.selectByText(data);
        Assert.assertEquals(dropdownListPage.getTextSelectElement(), data);
    }

    @DataProvider(name = "testData")
    public Object[][] getTestData() {
        return new Object[][] {
                {optionOne},
                {optionTwo}
        };
    }
}
