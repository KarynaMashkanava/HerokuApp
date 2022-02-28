import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TyposPage;
import resources.Constants;

public class TyposTest extends BaseTest {
    private String expectedText = "Typos\n" +
            "This example demonstrates a typo being introduced. It does it randomly on each page load.\n" +
            "Sometimes you'll see a typo, other times you won't.";

    @Test
    public void typosTest() {
        TyposPage typosPage = new TyposPage(driver);
        typosPage.openPage();
        Assert.assertEquals(typosPage.getText(), expectedText, "Message is incorrect. Expected: \n" + expectedText
                + "\nActual: \n" + typosPage.getText());
    }
}

