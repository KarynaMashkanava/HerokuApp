import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DroppablePage;

public class DroppableTest extends BaseTest{

    @Test
    public void changedTextElementTest() {
        DroppablePage droppablePage = new DroppablePage(driver);
        droppablePage.openDroppablePage();
        droppablePage.moveDragMeToTargetElement();
        Assert.assertEquals(droppablePage.getTextFromDropHereElement(), "Dropped!");
    }
}
