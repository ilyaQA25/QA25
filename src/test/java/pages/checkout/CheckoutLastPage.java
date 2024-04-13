package pages.checkout;

import baseEntities.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutLastPage extends BasePage {
    @FindBy(id = "back-to-products")
    public WebElement backButton;
    private final String pagePath = "checkout-complete.html";

    public CheckoutLastPage(WebDriver driver) {
        super(driver, false);
    }

    @Override
    protected WebElement getPageIdentifier() {
        return backButton;
    }

    @Override
    protected String getPagePath() {
        return pagePath;
    }

}
