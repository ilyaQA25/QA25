package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllProductsPage extends BasePage {
    public AllProductsPage(WebDriver driver) {
        super(driver);
    }

    private final By productPageNameLocator = By.className("title");
    private final By chosenProductNameLocator = By.xpath("//*[@id='item_5_title_link']/div");

    @Override
    protected By getPageIdentifier() {
        return productPageNameLocator;
    }

    public WebElement getProductPageName() {
        return waitsService.waitForVisibilityLocatedBy(productPageNameLocator);
    }

    public WebElement getChosenProductName() {
        return waitsService.waitForVisibilityLocatedBy(chosenProductNameLocator);
    }
}
