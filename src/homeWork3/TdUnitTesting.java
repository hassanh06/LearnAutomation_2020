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
    public void testCommercialButtonCheck() throws InterruptedException {
        commercialButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(commercialActualText)).getText();
        Assert.assertEquals(actualText, commercialExpectedText);
    }
    /**
     * Testing Small Business Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testSmallBusinessCheck() throws InterruptedException {
        SmallBusinessButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(smallBusinessActualText)).getText();
        Assert.assertEquals(actualText, smallBusinessExpectedText);
    }
    /**
     * Testing Personal Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testPersonalButtonCheck() throws InterruptedException {
        personalButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(personalActualText)).getText();
        Assert.assertEquals(actualText, personalExpectedText);
    }
    /**
     * Testing login Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testLoginButtonCheck() throws InterruptedException {
        loginButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(loginActualText)).getText();
        Assert.assertEquals(actualText, loginExpectedText);
    }
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
     * Testing Learning Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testLearningButtonCheck() throws InterruptedException {
        learningButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(learningActualText)).getText();
        Assert.assertEquals(actualText, learningExpectedText);
    }
    /**
     * Testing FindUs Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testFindUsButtonCheck() throws InterruptedException {
        findUsButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(findUsActualText)).getText();
        Assert.assertEquals(actualText, findUsExpectedText);
    }
    /**
     * Testing Get Offer Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testGetOfferButtonCheck() throws InterruptedException {
        getOfferButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(getOfferActualText)).getText();
        Assert.assertEquals(actualText, getOfferExpectedText);
    }
    /**
     * Testing Investing Wealth Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testInvestingWealthButtonCheck() throws InterruptedException {
        investingWealthButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(investingWealthActualText)).getText();
        Assert.assertEquals(actualText, investingWealthExpectedText);
    }
    /**
     * Testing Credit Card Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testCreditCardButtonCheck() throws InterruptedException {
        creditCardButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(creditCardButtonActualText)).getText();
        Assert.assertEquals(actualText, creditCardButtonExpectedText);
    }
    /**
     * Testing Checking Account Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testCheckingAccountButtonCheck() throws InterruptedException {
        checkingAccountButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(checkingAccountActualText)).getText();
        Assert.assertEquals(actualText, checkingAccountExpectedText);
    }
    /**
     * Testing Saving Account Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testSavingAccountButtonCheck() throws InterruptedException {
        savingAccountButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(savingAccountActualText)).getText();
        Assert.assertEquals(actualText, savingAccountExpectedText);
    }
    /**
     * Testing Mortgage Loan Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testMortgageLoanButtonCheck() throws InterruptedException {
        mortgageLoanButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(mortgageLoanActualText)).getText();
        Assert.assertEquals(actualText, mortgageLoanExpectedText);
    }
    /**
     * Testing Personal Loan Button
     * @throws InterruptedException
     * Author : Elhacen
     */
    @Test
    public void testPersonalLoanButtonCheck() throws InterruptedException {
        personalLoanButtonCheck();
        Thread.sleep(8000);
        String actualText = driver.findElement(By.xpath(personalLoanActualText)).getText();
        Assert.assertEquals(actualText, personalLoanExpectedText);
    }



}
