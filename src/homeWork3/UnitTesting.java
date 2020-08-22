package homeWork3;

import org.junit.Test;
import org.testng.Assert;

public class UnitTesting extends AmazonTestCase1 {


    //@Test
//    public void DoTest() throws InterruptedException {
//
//        Driver();
//        String actualText = driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3")).getText();
//        Assert.assertEquals(actualText,expectedText);
//    }
    @Test
    public void DoTest1() throws InterruptedException {
        Driver1();
       // actualText = (driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).getLocation();
        Assert.assertEquals("//*[@id=\"ap_password\"]",expectedText);
    }



}
