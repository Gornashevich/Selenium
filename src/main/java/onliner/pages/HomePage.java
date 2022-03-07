package onliner.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[contains(@class, 'b-main-navigation__text') and text() ='Каталог']")
    private WebElement catalog;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public CatalogPage clickToCatalog() {
        waitElementIsVisible(catalog).click();
        return new CatalogPage(driver);
    }
}
