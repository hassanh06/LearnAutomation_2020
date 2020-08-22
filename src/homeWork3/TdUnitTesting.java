package homeWork3;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TdUnitTesting extends TdBankTestCase{
    /**
     * Testing Help Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testHelpButtonCheck() throws InterruptedException {
        commercialButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(commercialActualText)).getText();
        Assert.assertEquals(actualText, commercialexpectedText);
    }
}
