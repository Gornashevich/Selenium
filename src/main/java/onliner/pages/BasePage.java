package onliner.pages;

import onliner.common.CustomWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static onliner.constants.Constant.TimeConstant.EXPLICIT_WAIT;



public class BasePage extends CustomWait {

    private static final Logger LOGGER = LogManager.getLogger();

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void open(String url) {
        LOGGER.info("Home page is opened");
        driver.get(url);
    }


}
