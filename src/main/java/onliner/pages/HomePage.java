package onliner.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static onliner.constants.Constant.TimeConstant.EXPLICIT_WAIT;

public class HomePage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger();

    @FindBy(xpath = "//span[contains(@class, 'b-main-navigation__text') and text() ='Каталог']")
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
