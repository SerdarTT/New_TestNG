package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Web {

    private static WebDriver driver = null;
    @BeforeMethod
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://edube.org/login");


    }
    @AfterMethod
    public void quitDriver(){
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }





}
