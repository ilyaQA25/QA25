package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutComplete extends BasePage {
    public CheckoutComplete(WebDriver driver) {
        super(driver);
    }

    private final By checkoutCompletePageNameLocator = By.className("title");
    private final By headerMessageLocator = By.cssSelector(".complete-header");
    private final By messageTextLocator = By.cssSelector(".complete-text");
    private final By backHomeButtonLocator = By.id("back-to-products");

    @Override
    protected By getPageIdentifier() {
        return checkoutCompletePageNameLocator;
    }

    public WebElement getCheckoutCompletePageName() {
        return waitsService.waitForVisibilityLocatedBy(checkoutCompletePageNameLocator);
    }

    public WebElement getHeaderMessage() {
        return waitsService.waitForVisibilityLocatedBy(headerMessageLocator);
    }

    public WebElement getMessageText() {
        return waitsService.waitForVisibilityLocatedBy(messageTextLocator);
    }

    public WebElement getBackHomeButton() {
        return waitsService.waitForVisibilityLocatedBy(backHomeButtonLocator);
    }

    public void backHome() {
        getBackHomeButton().click();
    }
}