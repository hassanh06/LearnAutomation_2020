package homeWork3;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTesting1 extends AmazonTestCase {

    /**
     * Testing Help Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testHelpButtonCheck() throws InterruptedException {
        helpButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(helpActualText)).getText();
        Assert.assertEquals(actualText, helpExpectedText);
    }

    /**
     * Testing Menu Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testMenuButtonCheck() throws InterruptedException {
        menuButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(menuActualText)).getText();
        Assert.assertEquals(actualText, menuExpectedText);

    }

    /**
     * Testing Subscribe & Save Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testSubscribeAndSaveButtonCheck() throws InterruptedException {
        subscribeAndSaveButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(subscribeActualText)).getText();
        Assert.assertEquals(actualText, subscribeExpectedText);
    }

    /**
     * Testing Account Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testYourAccountButtonCheck() throws InterruptedException {
        yourAccountButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(yourAccountActualText)).getText();
        Assert.assertEquals(actualText, yourAccountExpectedText);
    }

    /**
     * Testing FoundItOnAmazon Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testFoundItOnAmazonButtonCheck() throws InterruptedException {
        foundItOnAmazonButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(foundItOnAmazonActualText)).getText();
        Assert.assertEquals(actualText, foundItOnAmazonExpectedText);
    }
    /**
     * Testing Best Sellers Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testBestSellersButtonCheck() throws InterruptedException {
        bestSellersButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(bestSellersActualText)).getText();
        Assert.assertEquals(actualText, bestSellersExpectedText);
    }

    /**
     * Testing Customer Service Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testCustomerServiceButtonCheck() throws InterruptedException {
        customerServiceButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(customerServiceActualText)).getText();
        Assert.assertEquals(actualText, customerServiceExpectedText);
    }

    /**
     * Testing Today's Deals Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testTodaysDealsButtonCheck() throws InterruptedException {
        todaysDealsButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(todaysDealsActualText)).getText();
        Assert.assertEquals(actualText, todaysDealsExpectedText);
    }
    /**
     * Testing New Releases Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testNewReleasesButtonCheck() throws InterruptedException {
        newReleasesButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(newReleasesActualText)).getText();
        Assert.assertEquals(actualText, newReleasesExpectedText);
    }
    /**
     * Testing Find a Gift Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testFindAGiftButtonCheck() throws InterruptedException {
        findAGiftButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(findAGiftActualText)).getText();
        Assert.assertEquals(actualText, findAGiftExpectedText);
    }
    /**
     * Testing WholeFoods Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testWholeFoodsButtonCheck() throws InterruptedException {
        wholeFoodsButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(wholeFoodsActualText)).getText();
        Assert.assertEquals(actualText, wholeFoodsExpectedText);
    }
    /**
     * Testing GiftCards Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testGiftCardsButtonCheck() throws InterruptedException {
        giftCardsButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(giftCardsActualText)).getText();
        Assert.assertEquals(actualText, giftCardsExpectedText);
    }
    /**
     * Testing Free Shipping Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testFreeShippingButtonCheck() throws InterruptedException {
        freeShippingButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(freeShippingActualText)).getText();
        Assert.assertEquals(actualText, freeShippingExpectedText);
    }
    /**
     * Testing Registry Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testRegistryButtonCheck() throws InterruptedException {
        registryButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(registryActualText)).getText();
        Assert.assertEquals(actualText, registryExpectedText);
    }
    /**
     * Testing Sell Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testSellButtonCheck() throws InterruptedException {
        sellButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(sellActualText)).getText();
        Assert.assertEquals(actualText, sellExpectedText);
    }
}
