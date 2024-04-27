package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InventoryPage extends BasePage {
    private final By addToCartButtonLocator = By.cssSelector("#shopping_cart_container");
    private final By cartIconLocator = By.id("shopping_cart_container");

    private By headerTitleLabelLocator = By.className("app_logo");

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public SelenideElement getHeaderTitleLabel() {
        return $(headerTitleLabelLocator);
    }

    public SelenideElement getAddToCartButton() {
        return $(addToCartButtonLocator);
    }

    public SelenideElement getCartIconLocator() {
        return $(cartIconLocator);
    }
}