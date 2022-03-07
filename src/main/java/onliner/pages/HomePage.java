package onliner.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static onliner.constants.Constant.TimeConstant.EXPLICIT_WAIT;

public class HomePage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger();

    @FindBy(xpath = "//*[contains(@class, 'b-main-navigation__item')][1]/a[2]")
    private WebElement catalog;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public CatalogPage clickToCatalog() {
        LOGGER.info("Click on catalog tab");
        waitElementIsVisible(catalog, EXPLICIT_WAIT).click();
        return new CatalogPage(driver);
    }
}
