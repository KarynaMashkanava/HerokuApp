package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import resources.Constants;

import javax.swing.*;

public class DroppablePage extends BasePage{

    @FindBy(id = "draggable")
    private WebElement dragMeToTargetElement;

    @FindBy(id = "droppable")
    private WebElement dropHereElement;

    @FindBy(xpath = "//div[@id='droppable']/child::p")
    private WebElement textDropHereElement;

    public DroppablePage(WebDriver driver) {
        super(driver);
    }

    public void openDroppablePage() {
        driver.get(Constants.DROPPABLE_PAGE_URL);
    }

    public void moveDragMeToTargetElement() {
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        Actions actions = new Actions(driver);
        actions.moveToElement(dragMeToTargetElement)
               .dragAndDrop(dragMeToTargetElement, dropHereElement)
                .build()
                .perform();

    }

    public String getTextFromDropHereElement() {
        return textDropHereElement.getText();
    }

}
