package onliner.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CatalogPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger();

    public static final String ELECTRONICA_TAB = "Electronica";
    public static final String APPLIANCES_TAB = "Appliances";
    public static final String FOOD_TAB = "Food";

    @FindBy(xpath = "//span[contains(@class, 'catalog-navigation-classifier__item-title-wrapper') and text() ='Электроника']")
    private WebElement electronicaTab;

    @FindBy(xpath = "//span[contains(@class, 'catalog-navigation-classifier__item-title-wrapper') and text() ='Бытовая техника']")
    private WebElement appliancesTab;

    @FindBy(xpath = "//span[contains(@class, 'catalog-navigation-classifier__item-title-wrapper') and text() ='Еда']")
    private WebElement foodTab;

    @FindBy(xpath = "//*[contains(@id, 'widget') and contains(@id, '101')]")
    private List<WebElement> widgetCountEl;

    @FindBy(xpath = "//*[contains(@id, 'widget') and contains(@id, '103')]")
    private List<WebElement> widgetCountApl;

    @FindBy(xpath = "//*[contains(@id, 'widget') and contains(@id, '207')]")
    private List<WebElement> widgetCountFood;

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public CatalogPage clickElectronicaTab() {
        LOGGER.info("Click on electronica tab");
        electronicaTab.click();
        return this;
    }

    public CatalogPage clickAppliancesTab() {
        LOGGER.info("Click on appliances tab");
        appliancesTab.click();
        return this;
    }
    public CatalogPage clickFoodTab() {
        LOGGER.info("Click on food tab");
        foodTab.click();
        return this;
    }

    public int getWidgetCountEl(){
        LOGGER.info("Get electronic widget number");
        return widgetCountEl.size();
    }

    public int getWidgetCountApl(){
        LOGGER.info("Get appliances widget number");
        return widgetCountEl.size();
    }

    public int getWidgetCountFood(){
        LOGGER.info("Get food widget number ", widgetCountEl.size());
        return widgetCountEl.size();
    }




}
