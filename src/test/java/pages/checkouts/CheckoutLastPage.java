package pages.checkouts;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutLastPage extends BasePage {
    private final By titleLocator = By.xpath("//*[text() = 'Checkout: Complete!']");
    private final By headerLocator = By.xpath("//h2[contains(text(), 'Thank you for your order!')]");
    private final By backHomeButtonLocator = By.id("back-to-products");

    @Override
    protected By getPageIdentifier() {
        return headerLocator;
    }

    public SelenideElement getTitle() {
        return $(titleLocator);
    }

    public SelenideElement getHeader() {
        return $(headerLocator);
    }

    public SelenideElement getbackHomeButton() {
        return $(backHomeButtonLocator);
    }

    public boolean hasBackButton() {
        return getbackHomeButton().isDisplayed();
    }

    public boolean hasTitle() {
        return getTitle().isDisplayed();
    }
}
