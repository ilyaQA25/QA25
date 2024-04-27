package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage extends BasePage {
    private final By checkoutButtonLocator = By.id("checkout");

    @Override
    protected By getPageIdentifier() {
        return checkoutButtonLocator;
    }

    public SelenideElement getCheckoutButtonLocator() {
        return $(checkoutButtonLocator);
    }
}
