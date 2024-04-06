package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//
public class InventoryPage extends BasePage {
    private final By addToCartButtonLocator = By.cssSelector("#shopping_cart_container");
    private final By cartIconLocator = By.id("shopping_cart_container");

    private By headerTitleLabelLocator = By.className("app_logo");

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public WebElement getHeaderTitleLabel() {
        return waitsService.waitForExists(headerTitleLabelLocator);
    }

    public WebElement getAddToCartButton() {
        return waitsService.waitForExists(addToCartButtonLocator);
    }

    public WebElement getCartIconLocator() {
        return waitsService.waitForExists(cartIconLocator);
    }
}