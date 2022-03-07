package onliner;

import onliner.common.Driver;
import onliner.pages.BasePage;
import onliner.pages.CatalogPage;
import onliner.pages.HomePage;
import org.apache.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.testng.annotations.AfterSuite;


import static onliner.common.Config.BROWSER_OPEN;

public class BaseTest {

    private static final Logger LOGGER = (Logger) LogManager.getLogger(BaseTest.class);

    protected WebDriver driver = Driver.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected HomePage homePage = new HomePage(driver);
    protected CatalogPage catalogPage = new CatalogPage(driver);

    @AfterSuite (alwaysRun = true)
    public void close(){
        if(BROWSER_OPEN) {
            driver.quit();
            LOGGER.info("Browser is closed");
        }
    }

}
