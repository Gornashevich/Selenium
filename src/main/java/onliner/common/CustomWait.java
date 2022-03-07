package onliner.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static onliner.constants.Constant.TimeConstant.EXPLICIT_WAIT;

public class CustomWait {

    protected WebDriver driver;

    public WebElement waitElementIsVisible(WebElement element, int timeout) {
        new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitElementIsClickable(WebElement element, int timeout) {
        new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public Boolean textIsPresentInElement(WebElement element, String text) {
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.textToBePresentInElement(element, text));
        return true;
    }
}
