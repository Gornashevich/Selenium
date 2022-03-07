package onliner.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.time.Duration;

import static onliner.common.Config.BROWSER;
import static onliner.constants.Constant.TimeConstant.IMPLICIT_WAIT;

public class Driver {

    public static WebDriver createDriver() {
        WebDriver driver = null;
        switch (BROWSER) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", Config.getProperty("chromedriver"));
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.firefox.driver", Config.getProperty("firefoxdriver"));
                driver = new FirefoxDriver();
                break;
            default:
                Assert.fail("Incorrect browser " + BROWSER);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        return driver;
    }
}
