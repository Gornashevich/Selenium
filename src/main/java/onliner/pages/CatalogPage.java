package onliner.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CatalogPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger();

    public static final String ELECTRONICA_TAB = "Electronica";
    public static final String APPLIANCES_TAB = "Appliances";
    public static final String FOOD_TAB = "Food";

    @FindBy(xpath = "//li[contains(@class, 'classifier__item') and (@data-id ='1')]")
    private WebElement electronicaTab;

    @FindBy(xpath = "//li[contains(@class, 'classifier__item') and (@data-id ='3')]")
    private WebElement appliancesTab;

    @FindBy(xpath = "//li[contains(@class, 'classifier__item') and (@data-id ='16')]")
    private WebElement foodTab;

    @FindBy(xpath = "//*[contains(@id, 'widget') and contains(@id, '101')]")
    private List<WebElement> widgetCountEl;

    @FindBy(xpath = "//*[contains(@id, 'widget') and contains(@id, '103')]")
    private List<WebElement> widgetCountApl;

    @FindBy(xpath = "//*[contains(@id, 'widget') and contains(@id, '207')]")
    private List<WebElement> widgetCountFood;

    @FindBy(xpath = "//*[contains(@id, 'widget') and contains(@id, '101')]/div/a/div")
    private List<WebElement> widgetTextThemeElectronic;

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
        LOGGER.info("Get number of an electronic widget. The quantity is " + widgetCountEl.size());
        return widgetCountEl.size();
    }

    public int getWidgetCountApl(){
        LOGGER.info("Get number of appliances widget. The quantity is " + widgetCountApl.size());
        return widgetCountApl.size();
    }

    public int getWidgetCountFood(){
        LOGGER.info("Get number of food widget. The quantity is " + widgetCountFood.size());
        return widgetCountFood.size();
    }

    public void getWidgetTopicText(){
        List<String> text = new ArrayList<>();
        for(WebElement link : widgetTextThemeElectronic) {
            text.add(link.getText());
        }
        LOGGER.info("Getting text from theme of widget... ");
        HashSet<String> uniqueText = new HashSet<>(text);
        if(uniqueText.size() != widgetTextThemeElectronic.size()) {
            Assert.assertNotEquals(widgetTextThemeElectronic.size(), uniqueText.size(), "There is duplicate text in widget");
        }
    }


}
