package pages.checkouts;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutSecondPage extends BasePage {
    private final By finishButtonLocator = By.cssSelector("#finish");

    @Override
    protected By getPageIdentifier() {
        return finishButtonLocator;
    }

    public SelenideElement getfinishButton() {
        return $(finishButtonLocator);
    }
}
