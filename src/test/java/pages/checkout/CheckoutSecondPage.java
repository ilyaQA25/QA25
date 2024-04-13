package pages.checkout;

import baseEntities.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutSecondPage extends BasePage {
    private final String pagePath = "checkout-step-two.html";
    @FindBy(id = "finish")
    public WebElement finishButton;

    public CheckoutSecondPage(WebDriver driver) {
        super(driver, false);
    }

    @Override
    protected WebElement getPageIdentifier() {
        return finishButton;
    }

    @Override
    protected String getPagePath() {
        return pagePath;
    }

    public CheckoutLastPage finishCheckout() {
        finishButton.click();
        return new CheckoutLastPage(driver);
    }
}
