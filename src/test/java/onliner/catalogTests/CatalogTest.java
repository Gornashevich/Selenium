package onliner.catalogTests;

import onliner.BaseTest;
import onliner.common.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

import static onliner.pages.CatalogPage.*;

public class CatalogTest extends BaseTest {


    @Test(description = "Verifying that category tags have the right number of widgets")
    public void checkElectronicWidgets() {
        basePage.open(Config.getDataProperty("url"));
        homePage.clickToCatalog();
        catalogPage.clickElectronicaTab();
        int elWidgetCount = catalogPage.getWidgetCountEl();
        int aplWidgetCount = catalogPage.getWidgetCountApl();
        int foodWidgetCount = catalogPage.getWidgetCountFood();
        Assert.assertEquals(elWidgetCount,6, String.format("Incorrect number of widgets in '%s' tab", ELECTRONICA_TAB)); ;
        catalogPage.clickAppliancesTab();
        Assert.assertEquals(aplWidgetCount,8, String.format("Incorrect number of widgets in '%s' tab", APPLIANCES_TAB)); ;
        catalogPage.clickFoodTab();
        Assert.assertEquals(foodWidgetCount,8, String.format("Incorrect number of widgets in '%s' tab", FOOD_TAB)); ;
        catalogPage.getWidgetTopicText();
    }
}
