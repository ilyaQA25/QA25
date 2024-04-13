package pages;

import baseEntities.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.checkout.CheckoutFirstPage;

public class CartPage extends BasePage {
    private final String pagePath = "cart.html";
    @FindBy(id = "checkout")
    public WebElement checkoutButton;

    public CartPage(WebDriver driver) {
        super(driver, true);
    }

    @Override
    protected WebElement getPageIdentifier() {
        return checkoutButton;
    }

    @Override
    protected String getPagePath() {
        return pagePath;
    }

    public CheckoutFirstPage navigateToCheckout() {
        checkoutButton.click();
        return new CheckoutFirstPage(driver);
    }
}
