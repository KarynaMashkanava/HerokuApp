import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
    }

    @BeforeTest
    public void setProp() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
