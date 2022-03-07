package onliner.pages;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;

import java.time.Duration;

import static onliner.constants.Constant.TimeConstant.EXPLICIT_WAIT;



public class BasePage {

    private static final Logger LOGGER = (Logger) LogManager.getLogger(BasePage.class);

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void open(String url) {
        LOGGER.info("Home page is opened");
        driver.get(url);
    }

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
