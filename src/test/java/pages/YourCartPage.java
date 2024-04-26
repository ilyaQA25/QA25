package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourCartPage extends BasePage {
    public YourCartPage(WebDriver driver) {
        super(driver);
    }

    private final By yourCartPageNameLocator = By.className("title");
    private final By chosenProductNameLocator = By.xpath("//*[@id='item_5_title_link']/div");
    private final By productPriceLocator = By.cssSelector(".inventory_item_price");
    private final By checkoutButtonLocator = By.cssSelector("#checkout");

    @Override
    protected By getPageIdentifier() {
        return yourCartPageNameLocator;
    }

    public WebElement getYourCartPageName() {
        return waitsService.waitForVisibilityLocatedBy(yourCartPageNameLocator);
    }

    public WebElement getChosenProductName() {
        return waitsService.waitForVisibilityLocatedBy(chosenProductNameLocator);
    }

    public WebElement getProductPrice() {
        return waitsService.waitForVisibilityLocatedBy(productPriceLocator);
    }

    public WebElement getCheckoutButton() {
        return waitsService.waitForVisibilityLocatedBy(checkoutButtonLocator);
    }
}
