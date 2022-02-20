import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputTest extends BaseTest {

    @Test
    public void arrowUpTest() {
        driver.get(Constants.INPUT_URL);
        WebElement numberInput = driver.findElement(By.xpath("//input[@type='number']"));
        numberInput.sendKeys(Keys.ARROW_UP);
        Assert.assertEquals(numberInput.getAttribute("value"), "1");
    }

    @Test
    public void arrowDownTest() {
        driver.get(Constants.INPUT_URL);
        WebElement numberInput = driver.findElement(By.xpath("//input[@type='number']"));
       numberInput.sendKeys(Keys.ARROW_DOWN);
       Assert.assertEquals(numberInput.getAttribute("value"), "-1");
    }
}
