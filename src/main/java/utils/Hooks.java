package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Hooks {

    private static ChromeDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public static ChromeDriver getDriver(){
        return driver;
    }
}
