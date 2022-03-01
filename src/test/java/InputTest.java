import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InputsPage;
import resources.Constants;

public class InputTest extends BaseTest {

    @Test
    public void arrowUpTest() {
        driver.get(Constants.INPUT_URL);
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.typeIntoNumberInput(Keys.ARROW_UP);
        Assert.assertEquals(inputsPage.getNumberInputText(), "1");
    }

    @Test
    public void arrowDownTest() {
        driver.get(Constants.INPUT_URL);
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.typeIntoNumberInput(Keys.DOWN);
        Assert.assertEquals(inputsPage.getNumberInputText(), "-1");
    }
}
