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
    public String smallBusinessButton="/html/body/div[2]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[2]/a";
    public String personalButton="/html/body/div[2]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[1]/a";
    public String loginButton="//*[@id=\"main\"]/div[1]/div[2]/section/div/div/div/div[2]/div/div[2]/div[1]/button";
    public String helpButton="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[2]/div/ul/li[2]/a/span[1]";
    public String learningButton="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[3]/a";
    public String findUsButton="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[2]/div/ul/li[1]/a/span[1]";
    public String getOfferButton ="//*[@id=\"login-body-content-cloned\"]/div/div/button";
    public String investingWealthButton="/html/body/div[2]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[4]/a";
    public String creditCardButton="//*[@id=\"drag-id-tabsCarousel0\"]/div/li[3]/div[1]/span/span";
    public String checkingAccountButton="//*[@id=\"drag-id-tabsCarousel0\"]/div/li[1]/div[1]/span/span";
    public String savingAccountButton="//*[@id=\"drag-id-tabsCarousel0\"]/div/li[2]/div[1]/span/span";
    public String mortgageLoanButton="//*[@id=\"drag-id-tabsCarousel0\"]/div/li[5]/div[1]/span/span";
    public String personalLoanButton="//*[@id=\"drag-id-tabsCarousel0\"]/div/li[6]/div[1]/span/span";

    public String commercialActualText = "//*[@id=\"aBanner0\"]/div/div/div/div/p[1]";
    public String commercialExpectedText = "Business Customers";
    public String smallBusinessExpectedText = "Business Customers";
    public String smallBusinessActualText = "//*[@id=\"aBanner0\"]/div/div/div/div/p[1]";
    public String personalExpectedText = "Welcome to TD Bank Personal Banking";
    public String personalActualText = "//*[@id=\"main\"]/section[2]/div/div/h1";
    public String loginExpectedText = "Welcome to Online Banking";
    public String loginActualText = "/html/body/div[4]/div[2]/div[1]/div[1]/div/h1";
    public String helpExpectedText = "Banking should be simple.\n" + "How can we help you?";
    public String helpActualText = "//*[@id=\"aBanner0\"]/div[2]/div/div/div";
    public String learningExpectedText = "Learning Center";
    public String learningActualText = "//*[@id=\"main\"]/section[1]/div/div/h1";
    public String findUsExpectedText = "Find a Store or an ATM Near You";
    public String findUsActualText = "//*[@id=\"js-locator\"]/div[2]/h1";
    public String getOfferExpectedText = "Combine with one of the accounts below:";
    public String getOfferActualText = "//*[@id=\"combo-anchor\"]/div/div/div/div/p[1]";
    public String investingWealthExpectedText = "Explore investing solutions based on your needs";
    public String investingWealthActualText = "//*[@id=\"main\"]/section[2]/div[1]/div/div/h2";
    public String creditCardButtonExpectedText = "TD Bank Credit Cards";
    public String creditCardButtonActualText = "//*[@id=\"main\"]/section[1]/div/div/h1";
    public String checkingAccountExpectedText = "TD Bank Checking Accounts";
    public String checkingAccountActualText = "//*[@id=\"main\"]/section[1]/div/div/h1";
    public String savingAccountExpectedText = "Set your location";
    public String savingAccountActualText = "//*[@id=\"scrollbarid_394\"]/div/div/div/div/h2";
    public String mortgageLoanExpectedText = "Mortgage, mastered.";
    public String mortgageLoanActualText = "//*[@id=\"aBanner0\"]/div/div/div/div/p[1]";
    public String personalLoanExpectedText = "TD Bank Personal Loans";
    public String personalLoanActualText = "//*[@id=\"main\"]/section[2]/div/div/h1";


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
    public void SmallBusinessButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(smallBusinessButton)).click();
        Thread.sleep(2000);
    }
    public void personalButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(personalButton)).click();
        Thread.sleep(2000);
    }
    public void loginButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(loginButton)).click();
        Thread.sleep(2000);
    }
    public void helpButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(helpButton)).click();
        Thread.sleep(2000);
    }
    public void learningButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(learningButton)).click();
        Thread.sleep(2000);
    }
    public void findUsButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(findUsButton)).click();
        Thread.sleep(2000);
    }
    public void getOfferButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(getOfferButton)).click();
        Thread.sleep(2000);
    }
    public void investingWealthButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(investingWealthButton)).click();
        Thread.sleep(2000);
    }
    public void creditCardButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(creditCardButton)).click();
        Thread.sleep(2000);
    }
    public void checkingAccountButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(checkingAccountButton)).click();
        Thread.sleep(2000);
    }
    public void savingAccountButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(savingAccountButton)).click();
        Thread.sleep(2000);
    }
    public void mortgageLoanButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(mortgageLoanButton)).click();
        Thread.sleep(2000);
    }
    public void personalLoanButtonCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(personalLoanButton)).click();
        Thread.sleep(2000);
    }

}
