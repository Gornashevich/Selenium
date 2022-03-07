package onliner.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static onliner.constants.Constant.TimeConstant.EXPLICIT_WAIT;

public class CustomWait {

    private static final Logger LOGGER = LogManager.getLogger();

    protected WebDriver driver;

    public WebElement waitElementIsVisible(WebElement element, int timeout) {
        LOGGER.info("Waiting until element is visible during " + timeout + " sec");
        new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitElementIsClickable(WebElement element, int timeout) {
        LOGGER.info("Waiting until element is clickable during " + timeout + " sec");
        new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public Boolean textIsPresentInElement(WebElement element, String text) {
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.textToBePresentInElement(element, text));
        return true;
    }
}
