package pages.checkouts;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutSecondPage extends BasePage {
    private final By finishButtonLocator = By.id("finish");

    public CheckoutSecondPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return finishButtonLocator;
    }

    public WebElement getfinishButton() {
        return waitsService.waitForVisibilityLocatedBy(finishButtonLocator);
    }
}
