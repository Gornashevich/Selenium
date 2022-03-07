package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import onliner.common.Driver;
import onliner.pages.BasePage;
import onliner.pages.CatalogPage;
import onliner.pages.HomePage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import static onliner.common.Config.BROWSER_OPEN;

public class BaseTest {

    private static final Logger LOGGER = LogManager.getLogger();

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
