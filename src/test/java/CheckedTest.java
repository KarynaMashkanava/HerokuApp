import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxesPage;
import resources.Constants;

public class CheckedTest extends BaseTest{

    @Test
    public void checkboxUncheckedTest() {
        driver.get(Constants.CHECKBOXES_URL);
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        Assert.assertFalse(checkboxesPage.firstCheckboxIsSelected(), "Checkbox was checked");
    }

    @Test
    public void checkboxCheckedTest() {
        driver.get(Constants.CHECKBOXES_URL);
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.clickFirstCheckbox();
        Assert.assertTrue(checkboxesPage.firstCheckboxIsSelected(), "Checkbox was unchecked");
    }

    @Test
    public void secondCheckboxCheckedTest() {
        driver.get(Constants.CHECKBOXES_URL);
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        Assert.assertTrue(checkboxesPage.secondCheckboxIsSelected(), "Checkbox was unchecked");
    }

    @Test
    public  void secondCheckboxUncheckedTest() {
        driver.get(Constants.CHECKBOXES_URL);
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.secondCheckboxClick();
        Assert.assertFalse(checkboxesPage.secondCheckboxIsSelected(), "Checkbox was checked");
    }

}
