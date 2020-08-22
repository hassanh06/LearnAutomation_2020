package homeWork3;

//public class AmazonTestCase2 {
//     static  WebDriver driver;
//     static String chromeDriver = "webdriver.chrome.driver";
//     static String chromeDriverPath = "/Users/elhacenarib/Desktop/Selenium_download//chromedriver";   //lib/browserDriver/chromedriver.exe
//     static String url = "https://www.amazon.com/";
//     static String menuButton = "//*[@id=\"nav-hamburger-menu\"]/i";
//     static String helpButton = "//*[@id=\"hmenu-content\"]/ul[1]/li[51]/a";
//
//    public String helpActualText = "/html/body/div[2]/div[1]/h1";
//    public String expectedText = "Hello. What can we help you with?";
//
//    public static void main(String[] args) throws InterruptedException {
//        menuButtonCheck();
//
//    }
//
//
////    @BeforeMethod
////    public void Starting() {
////        System.out.println("We Will Start the Automation Testing For Menu Button");
////    }
//        @BeforeMethod
//        public static void setUp (String driverUrl, String driverPath, String url){
//
//            System.setProperty(driverUrl, driverPath);
//            driver = new ChromeDriver();
//            driver.get(url);
//        }
//
//        @AfterMethod
//        public void closeBrowser () {
//            driver.close();
//            driver.quit();
//        }
//
//        public static void menuButtonCheck () throws InterruptedException {
//            setUp(chromeDriver, chromeDriverPath, url);
//            driver.findElement(By.xpath(menuButton)).click();
//            //Thread.sleep(5000);
//            driver.findElement(By.xpath(helpButton)).click();
//            Thread.sleep(5000);
//        }
//
//
//
//
//
//}
