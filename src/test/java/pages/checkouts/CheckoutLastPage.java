package pages.checkouts;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutLastPage extends BasePage {
    private final By titleLocator = By.xpath("//*[text() = 'Checkout: Complete!']");
    private final By headerLocator = By.xpath("//h2[contains(text(), 'Thank you for your order!')]");
    private final By backHomeButtonLocator = By.id("back-to-products");

    public CheckoutLastPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerLocator;
    }

    public WebElement getTitle() {
        return waitsService.waitForVisibilityLocatedBy(titleLocator);
    }

    public WebElement getHeader() {
        return waitsService.waitForVisibilityLocatedBy(headerLocator);
    }

    public WebElement getbackHomeButton() {
        return waitsService.waitForVisibilityLocatedBy(backHomeButtonLocator);
    }

    public boolean hasBackButton() {
        return getbackHomeButton().isDisplayed();
    }

    public boolean hasTitle() {
        return getTitle().isDisplayed();
    }
}