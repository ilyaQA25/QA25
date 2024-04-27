package pages.checkouts;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutFirstPage extends BasePage {
    private final By firstNameLocator = By.cssSelector("#first-name");
    private final By lastNameLocator = By.cssSelector("#last-name");
    private final By zipCodeLocator = By.cssSelector("#postal-code");
    private final By continueButtonLocator = By.cssSelector("#continue");

    @Override
    protected By getPageIdentifier() {
        return firstNameLocator;
    }

    public SelenideElement getFirstNameInput() {
        return $(firstNameLocator);
    }

    public SelenideElement getLastNameInput() {
        return $(lastNameLocator);
    }

    public SelenideElement getPostalCodeInput() {
        return $(zipCodeLocator);
    }

    public SelenideElement getContinueButton() {
        return $(continueButtonLocator);
    }
}

