package onliner.catalogTests;

import onliner.BaseTest;
import onliner.common.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

import static onliner.pages.CatalogPage.*;

public class CatalogTest extends BaseTest {

    @Test
    public void checkElectronicWidgets() {
        basePage.open(Config.getProperty("url"));
        homePage.clickToCatalog();
        catalogPage.clickElectronicaTab();
        Assert.assertEquals(catalogPage.getWidgetCountEl(), 6, String.format("Incorrect number of widgets in '%s' tab", ELECTRONICA_TAB)); ;
        catalogPage.clickAppliancesTab();
        Assert.assertEquals(catalogPage.getWidgetCountApl(), 6, String.format("Incorrect number of widgets in '%s' tab", APPLIANCES_TAB)); ;
        catalogPage.clickFoodTab();
        Assert.assertEquals(catalogPage.getWidgetCountFood(), 8, String.format("Incorrect number of widgets in '%s' tab", FOOD_TAB)); ;

    }
}
