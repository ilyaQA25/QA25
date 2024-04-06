package pages.checkouts;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutFirstPage extends BasePage {
    private final By firstNameLocator = By.id("first-name");
    private final By lastNameLocator = By.id("last-name");
    private final By zipCodeLocator = By.id("postal-code");
    private final By continueButtonLocator = By.id("continue");

    public CheckoutFirstPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return firstNameLocator;
    }

    public WebElement getFirstNameInput() {
        return waitsService.waitForVisibilityLocatedBy(firstNameLocator);
    }

    public WebElement getLastNameInput() {
        return waitsService.waitForVisibilityLocatedBy(lastNameLocator);
    }

    public WebElement getPostalCodeInput() {
        return waitsService.waitForVisibilityLocatedBy(zipCodeLocator);
    }

    public WebElement getContinueButton() {
        return waitsService.waitForVisibilityLocatedBy(continueButtonLocator);
    }
}

