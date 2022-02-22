import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class AddElementTest extends BaseTest{

    @Test
    public void addElementTest() {
        driver.get(Constants.ADD_REMOVE_ELEMETS_URL);
        WebElement addButton = driver.findElement(By.xpath("//button[@onclick = 'addElement()']"));
        addButton.click();
        addButton.click();
        List<WebElement> list = driver.findElements(By.xpath("//button[@class = 'added-manually']"));
        list.get(0).click();
        list = driver.findElements(By.xpath("//button[@class = 'added-manually']"));
        Assert.assertEquals(list.size(), 1);
    }

    @Test
    public void tableOneTest() {
        driver.get(Constants.DATA_TABLES_URL);
        WebElement lastName = driver.findElement(By.xpath("//table[@id = 'table1']//td[text() = 'fbach@yahoo.com']/preceding-sibling::td[2]"));
        WebElement firstName = driver.findElement(By.xpath("//table[@id = 'table1']//td[text() = 'fbach@yahoo.com']/preceding-sibling::td[1]"));
        Assert.assertEquals(firstName.getText(), "Frank");
        Assert.assertEquals(lastName.getText(), "Bach");
    }

    @Test
    public void tableTwoTest() {
        driver.get(Constants.DATA_TABLES_URL);
        WebElement due = driver.findElement(By.xpath("//table[@id = 'table2']//td[text() = 'fbach@yahoo.com']/following-sibling::td[1]"));
        WebElement website = driver.findElement(By.xpath("//table[@id = 'table2']//td[text() = 'fbach@yahoo.com']/following-sibling::td[2]"));
        Assert.assertEquals(due.getText(), "$51.00");
        Assert.assertEquals(website.getText(), "http://www.frank.com");
    }
}
