package homeWork3;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTesting1 extends AmazonTestCase {

    @Test
    public void testHelpButtonCheck() throws InterruptedException {
        helpButtonCheck();
        Thread.sleep(1000);
        String actualText = driver.findElement(By.xpath(helpActualText)).getText();
        Assert.assertEquals(actualText, helpexpectedText);
    }
    @Test
    public void testMenuButtonCheck() throws InterruptedException {
        menuButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(menuActualText)).getText();
        Assert.assertEquals(actualText, menuexpectedText);

    }
    @Test
    public void testSubscribeAndSaveButtonCheck() throws InterruptedException {

        subscribeAndSaveButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(subscribeActualText)).getText();
        Assert.assertEquals(actualText, subscribeexpectedText);
    }
    @Test
    public void testYourAccountButtonCheck() throws InterruptedException {
        yourAccountButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(yourAccountActualText)).getText();
        Assert.assertEquals(actualText, yourAccountexpectedText);
    }
    @Test
    public void testFoundItOnAmazonButtonCheck() throws InterruptedException {
        foundItOnAmazonButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(oundItOnAmazonActualText)).getText();
        Assert.assertEquals(actualText, oundItOnAmazonexpectedText);
    }
}
