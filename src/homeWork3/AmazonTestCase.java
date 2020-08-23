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
        public String bestSellersButton = "//*[@id=\"nav-xshop\"]/a[1]";
        public String customerServiceButton = "//*[@id=\"nav-xshop\"]/a[2]";
        public String todaysDealsButton = "//*[@id=\"nav-xshop\"]/a[3]";
        public String newReleasesButton = "//*[@id=\"nav-xshop\"]/a[4]";
        public String findAGiftButton = "//*[@id=\"nav-xshop\"]/a[5]";
        public String wholeFoodsButton = "//*[@id=\"nav-xshop\"]/a[6]";
        public String giftCardsButton = "//*[@id=\"nav-xshop\"]/a[7]";
        public String freeShippingButton = "//*[@id=\"nav-xshop\"]/a[8]";
        public String registryButton = "//*[@id=\"nav-xshop\"]/a[9]";
        public String sellButton = "//*[@id=\"nav-xshop\"]/a[10]";

        public String helpActualText = "/html/body/div[2]/div[1]/h1";
        public String helpExpectedText = "Hello. What can we help you with?";
        public String menuActualText = "//*[@id=\"hmenu-content\"]/ul[1]/li[1]/div";
        public String menuExpectedText = "SHOP BY CATEGORY";
        public String yourAccountActualText = "//*[@id=\"a-page\"]/div[2]/div/div[1]/h1";
        public String yourAccountExpectedText = "Your Account";
        public String subscribeActualText = "//*[@id=\"carousel_801589\"]/h2/span";
        public String subscribeExpectedText = "Best Sellers in Subscribe & Save";
        public String foundItOnAmazonActualText = "//*[@id=\"glimpse-react-app\"]/div/div[2]/div/div/div[1]/a[1]/div";
        public String foundItOnAmazonExpectedText = "#FoundItOnAmazon";
        public String bestSellersActualText = "//*[@id=\"zg_banner_text_wrapper\"]";
        public String bestSellersExpectedText = "Amazon Best Sellers";
        public String customerServiceActualText = "/html/body/div[2]/div[1]/h1";
        public String customerServiceExpectedText = "Hello. What can we help you with?";
        public String todaysDealsActualText = "//*[@id=\"gbox-item-0.0.0\"]/div/div/div[1]/h1/div[1]";
        public String todaysDealsExpectedText = "Today's Deals";
        public String newReleasesActualText = "//*[@id=\"zg_banner_text_wrapper\"]";
        public String newReleasesExpectedText = "Amazon Hot New Releases";
        public String findAGiftActualText = "//*[@id=\"notification-provider\"]/div/div/div[2]/h2";
        public String findAGiftExpectedText = "Who are you shopping for?";
        public String wholeFoodsActualText = "//*[@id=\"3402bf98-af51-4b0b-a120-0df3899f7842-p13n-alm-atf_AlmPNYATFWFM_16310211\"]/div[1]/div/h2/span";
        public String wholeFoodsExpectedText = "Popular near you";
        public String giftCardsActualText = "//*[@id=\"leftNav\"]/h3[1]";
        public String giftCardsExpectedText = "Show results for";
        public String freeShippingActualText = "//*[@id=\"contentGrid_354293\"]/div/div[2]/div/div/div/h4";
        public String freeShippingExpectedText = "Order $25 or more to qualify for\n" + "FREE Shipping on over 100 million items.";
        public String registryActualText = "//*[@id=\"contentGrid_309083\"]/div/div[7]/div/div/div/h3";
        public String registryExpectedText = "Registry discounts, rewards and bonus gifts?";
        public String sellActualText = "//*[@id=\"eventColor\"]/div[3]/div/div/div[1]/div/div[2]/div/div[1]/h2";
        public String sellExpectedText = "Sell on Amazon";


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
    public void bestSellersButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath,url);
        WebElement menu=driver.findElement(By.xpath(bestSellersButton));
        menu.click();
        Thread.sleep(2000);

    }
    public void customerServiceButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath,url);
        WebElement menu=driver.findElement(By.xpath(customerServiceButton));
        menu.click();
        Thread.sleep(2000);

    }
    public void todaysDealsButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath,url);
        WebElement menu=driver.findElement(By.xpath(todaysDealsButton));
        menu.click();
        Thread.sleep(2000);

    }
    public void newReleasesButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath,url);
        WebElement menu=driver.findElement(By.xpath(newReleasesButton));
        menu.click();
        Thread.sleep(2000);

    }
    public void findAGiftButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath,url);
        WebElement menu=driver.findElement(By.xpath(findAGiftButton));
        menu.click();
        Thread.sleep(2000);

    }
    public void wholeFoodsButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath,url);
        driver.findElement(By.xpath(wholeFoodsButton)).click();
//        WebElement menu=driver.findElement(By.xpath(wholeFoodsButton));
//        menu.click();
        Thread.sleep(2000);

    }
    public void giftCardsButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath,url);
        WebElement menu=driver.findElement(By.xpath(giftCardsButton));
        menu.click();
        Thread.sleep(2000);

    }
    public void freeShippingButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath,url);
        WebElement menu=driver.findElement(By.xpath(freeShippingButton));
        menu.click();
        Thread.sleep(2000);

    }
    public void registryButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath,url);
        WebElement menu=driver.findElement(By.xpath(registryButton));
        menu.click();
        Thread.sleep(2000);

    }
    public void sellButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath,url);
        WebElement menu=driver.findElement(By.xpath(sellButton));
        menu.click();
        Thread.sleep(2000);

    }
}