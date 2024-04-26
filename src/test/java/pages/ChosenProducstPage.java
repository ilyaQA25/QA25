package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChosenProducstPage extends BasePage {
    public ChosenProducstPage(WebDriver driver) {
        super(driver);
    }

    private final By chosenProductsPageNameLocator = By.xpath("//button[contains(@class, 'btn_secondary')]");
    private final By chosenProductNameLocator = By.xpath("//*[text()='Sauce Labs Fleece Jacket']");
    private final By addToCartButtomLocator = By.xpath("//*[contains(text(),'Add to cart')]");
    private final By productСounterLocator = By.className("shopping_cart_badge");
    private final By shoppingCartLinkLocator = By.className("shopping_cart_link");

    @Override
    protected By getPageIdentifier() {
        return chosenProductsPageNameLocator;
    }

    public WebElement geChosenProductsPageName() {
        return waitsService.waitForVisibilityLocatedBy(chosenProductsPageNameLocator);
    }

    public WebElement getChosenProductName() {
        return waitsService.waitForVisibilityLocatedBy(chosenProductNameLocator);
    }

    public WebElement getAddToCartButtom() {
        return waitsService.waitForVisibilityLocatedBy(addToCartButtomLocator);
    }

    public WebElement getProductСounter() {
        return waitsService.waitForVisibilityLocatedBy(productСounterLocator);
    }

    public WebElement getShoppingCartLink() {
        return waitsService.waitForVisibilityLocatedBy(shoppingCartLinkLocator);
    }


}
