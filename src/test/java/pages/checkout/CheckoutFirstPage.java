package pages.checkout;

import baseEntities.BasePage;
import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutFirstPage extends BasePage {
    private final String pagePath = "checkout-step-one.html";
    @FindBy(id = "first-name")
    public WebElement firstNameInput;
    @FindBy(id = "last-name")
    public WebElement lastNameInput;
    @FindBy(id = "postal-code")
    public WebElement postalCodeInput;
    @FindBy(id = "continue")
    public WebElement continueButton;

    public CheckoutFirstPage(WebDriver driver) {
        super(driver, false);
    }

    @Override
    protected WebElement getPageIdentifier() {
        return firstNameInput;
    }

    @Override
    protected String getPagePath() {
        return pagePath;
    }

    public CheckoutSecondPage fillInCheckoutInfo(User user) {
        firstNameInput.sendKeys(user.getFirstName());
        lastNameInput.sendKeys(user.getLastName());
        postalCodeInput.sendKeys(user.getZipcode());
        continueButton.click();
        return new CheckoutSecondPage(driver);
    }
}

