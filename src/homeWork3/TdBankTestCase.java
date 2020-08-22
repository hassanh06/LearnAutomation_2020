package homeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

public class TdBankTestCase {
    public WebDriver driver;
    public String chromeDriver = "webdriver.chrome.driver";
    public String chromeDriverPath = "/Users/elhacenarib/Desktop/Selenium_download//chromedriver";   //lib/browserDriver/chromedriver.exe
    public String url ="https://www.td.com/";
    public String commercialButton ="/html/body/div[3]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[3]/a";
    public String commercialActualText = "//*[@id=\"aBanner0\"]/div/div/div/div/p[1]";
    public String commercialexpectedText = "Business Customers";


    public void setUp(String driverUrl, String driverPath, String url) {

        System.setProperty(driverUrl, driverPath);
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }

    public void commercialButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(commercialButton)).click();
        Thread.sleep(2000);
    }
}
