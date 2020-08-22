package homeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AmazonTestCase1 {



    public static void main(String[] args) throws InterruptedException {
        Driver1();


    }
        String expectedText="//*[@id=\"ap_password\"]";
        //String DronesActualText=("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3");
        static WebDriver driver;
        static String url="https://www.amazon.com/";

        public static void Property(String s, String s1, String url){
            System.setProperty("webdriver.chrome.driver", "/Users/elhacenarib/Desktop/Selenium_download//chromedriver");
            driver=new ChromeDriver();
            driver.get(url);


        }

        @AfterMethod
        public static void ClosingMethod() throws InterruptedException {
            Thread.sleep(8000);
            driver.close();
            driver.quit();
        }
        public static void Driver1() throws InterruptedException {
            Property("webdriver.chrome.driver", "/Users/elhacenarib/Desktop/Selenium_download//chromedriver",url);

            driver.manage().window().maximize();
            driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
            driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[52]/a")).click();
            driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("hassan_arib@hotmail.com");
            driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
            ClosingMethod();

        }
    }

