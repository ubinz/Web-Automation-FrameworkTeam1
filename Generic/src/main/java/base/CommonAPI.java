package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver = null;

    @BeforeMethod
    @Parameters({"browser_name", "operating_system", "URL"})
    public void setUp(String browserName, String os, String url){
        getLocalDriver(browserName,os);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(35,TimeUnit.SECONDS);
    }

    @AfterMethod
    public static void cleanUp(){
        driver.close();
    }

    public WebDriver getLocalDriver(String browserName, String os){
        if (browserName.equalsIgnoreCase("chrome")){
            if (os.equalsIgnoreCase("windows")){
                System.setProperty("webdriver.chrome.driver","../Generic/driver/chromedriver.exe");
                driver = new ChromeDriver();
            }else if (os.equalsIgnoreCase("mac")){
                System.setProperty("webdriver.chrome.driver","../Generic/driver/chromedriver");
                driver = new ChromeDriver();
            }
        }else if (browserName.equalsIgnoreCase("firefox")){
            if (os.equalsIgnoreCase("windows")){
                System.setProperty("webdriver.gecko.driver","../Generic/driver/geckodriver.exe");
                driver = new FirefoxDriver();
            }else if (os.equalsIgnoreCase("mac")){
                System.setProperty("webdriver.gecko.driver","../Generic/driver/geckodriver");
                driver = new FirefoxDriver();
            }
        } return driver;
    }


}