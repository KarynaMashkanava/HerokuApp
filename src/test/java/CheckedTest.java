import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckedTest extends BaseTest{

    @Test
    public void checkboxUncheckedTest() {
        driver.get(Constants.CHECKBOXES_URL);
        WebElement firstCheckbox = driver.findElement(By.cssSelector("input[type = 'checkbox']:first-child"));
        Assert.assertFalse(firstCheckbox.isSelected(), "Checkbox was checked");
    }

    @Test
    public void checkboxCheckedTest() {
        driver.get(Constants.CHECKBOXES_URL);
        WebElement firstCheckbox = driver.findElement(By.cssSelector("input[type = 'checkbox']:first-child"));
        firstCheckbox.click();
        Assert.assertTrue(firstCheckbox.isSelected(), "Checkbox was unchecked");
    }

    @Test
    public void secondCheckboxCheckedTest() {
        driver.get(Constants.CHECKBOXES_URL);
        WebElement secondCheckbox = driver.findElement(By.cssSelector("input[type='checkbox']:nth-child(3)"));
        Assert.assertTrue(secondCheckbox.isSelected(), "Checkbox was unchecked");
    }

    @Test
    public  void secondCheckboxUncheckedTest() {
        driver.get(Constants.CHECKBOXES_URL);
        WebElement secondCheckbox = driver.findElement(By.cssSelector("input[type='checkbox']:nth-child(3)"));
        secondCheckbox.click();
        Assert.assertFalse(secondCheckbox.isSelected(), "Checkbox was checked");
    }

}
