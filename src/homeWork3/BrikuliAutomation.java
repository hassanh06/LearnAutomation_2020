package homeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrikuliAutomation {

    String expectedText="Cooligg FPV Wifi Drone With HD Camera Aircraft Foldable Quadcopter Selfie Toys";
    String DronesActualText=("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3");
    WebDriver driver;
    String url="https://www.ebay.com/";


    @BeforeMethod
    public void BeforTest(){
        System.out.println("Welcome to Automation");
    }


    public void Property(String s, String s1, String url){
        System.setProperty("webdriver.chrome.driver", "/Users/elhacenarib/Desktop/Selenium_download//chromedriver");
        driver=new ChromeDriver();
        driver.get(url);


    }

    @AfterMethod
    public void ClosingMethod() throws InterruptedException {
        Thread.sleep(10000);
        driver.close();
        driver.quit();
    }
    public void Driver() throws InterruptedException {
        Property("webdriver.chrome.driver", "/Users/elhacenarib/Desktop/Selenium_download//chromedriver",url);

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Drones");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
        //driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3")).click();
        ClosingMethod();

    }


}
