package homeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

public class AmazonTestCase {



        public WebDriver driver;
        public String chromeDriver = "webdriver.chrome.driver";
        public String chromeDriverPath = "/Users/elhacenarib/Desktop/Selenium_download//chromedriver";   //lib/browserDriver/chromedriver.exe
        public String url = "https://www.amazon.com/";
        public String menuButton = "//*[@id=\"nav-hamburger-menu\"]/i";
        public String helpButton = "//*[@id=\"hmenu-content\"]/ul[1]/li[51]/a";
        public String subscribeAndSaveButton = "//*[@id=\"hmenu-content\"]/ul[1]/li[13]/a";
        public String yourAccountButton = "//*[@id=\"hmenu-content\"]/ul[1]/li[48]/a";
        public String foundItOnAmazonButton = "//*[@id=\"hmenu-content\"]/ul[1]/li[35]/a";

        public String helpActualText = "/html/body/div[2]/div[1]/h1";
        public String helpexpectedText = "Hello. What can we help you with?";
        public String menuActualText = "//*[@id=\"hmenu-content\"]/ul[1]/li[1]/div";
        public String menuexpectedText = "SHOP BY CATEGORY";
        public String yourAccountActualText = "//*[@id=\"a-page\"]/div[2]/div/div[1]/h1";
        public String yourAccountexpectedText = "Your Account";
        public String subscribeActualText = "//*[@id=\"carousel_91860\"]/h2/span";
        public String subscribeexpectedText = "Best Sellers in Subscribe & Save";
        public String oundItOnAmazonActualText = "//*[@id=\"glimpse-react-app\"]/div/div[2]/div/div/div[1]/a[1]/div";
        public String oundItOnAmazonexpectedText = "#FoundItOnAmazon";


    //@BeforeMethod
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

    public void menuButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath,url);
        driver.findElement(By.xpath(menuButton)).click();
        Thread.sleep(2000);

    }
    public void helpButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath,url);
        //checking Menu Button
        driver.findElement(By.xpath(menuButton)).click();
        Thread.sleep(2000);
        // checking Help Button
        driver.findElement(By.xpath(helpButton)).click();
        Thread.sleep(2000);
    }

    public void yourAccountButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath,url);
        driver.findElement(By.xpath(menuButton)).click();
        Thread.sleep(2000);
        // checking YourAccount Button
        driver.findElement(By.xpath(yourAccountButton)).click();
        Thread.sleep(2000);
    }
    public void subscribeAndSaveButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath,url);
        driver.findElement(By.xpath(menuButton)).click();
        Thread.sleep(2000);
        //checking Subscribe Button
        driver.findElement(By.xpath(subscribeAndSaveButton)).click();
        Thread.sleep(2000);
    }

    public void foundItOnAmazonButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath,url);
        WebElement menu=driver.findElement(By.xpath(menuButton));
        menu.click();
        Thread.sleep(2000);
        //checking Found IT Button
        WebElement oundIt=driver.findElement(By.xpath(foundItOnAmazonButton));
        oundIt.click();
        Thread.sleep(2000);
    }
}