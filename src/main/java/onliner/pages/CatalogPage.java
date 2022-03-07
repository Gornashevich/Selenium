package onliner.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CatalogPage extends BasePage {

    public static final String ELECTRONICA_TAB = "Electronica";
    public static final String APPLIANCES_TAB = "Appliances";
    public static final String FOOD_TAB = "Food";

    @FindBy(xpath = "//span[contains(@class, 'catalog-navigation-classifier__item-title-wrapper') and text() ='Электроника']")
    private WebElement electronicaTab;

    @FindBy(xpath = "//span[contains(@class, 'catalog-navigation-classifier__item-title-wrapper') and text() ='Бытовая техника']")
    private WebElement appliancesTab;

    @FindBy(xpath = "//span[contains(@class, 'catalog-navigation-classifier__item-title-wrapper') and text() ='Еда']")
    private WebElement foodTab;

    @FindBy(xpath = "")
    private List<WebElement> widgetCountEl;

    @FindBy(xpath = "")
    private List<WebElement> widgetCountApl;

    @FindBy(xpath = "")
    private List<WebElement> widgetCountFood;

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public CatalogPage clickElectronicaTab() {
        electronicaTab.click();
        return this;
    }

    public CatalogPage clickAppliancesTab() {
        appliancesTab.click();
        return this;
    }
    public CatalogPage clickFoodTab() {
        foodTab.click();
        return this;
    }

    public int getWidgetCountEl(){
        return widgetCountEl.size();
    }

    public int getWidgetCountApl(){
        return widgetCountEl.size();
    }

    public int getWidgetCountFood(){
        return widgetCountEl.size();
    }




}
