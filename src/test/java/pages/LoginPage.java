package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {
    private final By usernamelInputLocator = By.id("user-name");
    private final By pswInputLocator = By.id("password");
    private final By logInButtonLocator = By.id("login-button");

    // Блок иницализации

    @Override
    protected By getPageIdentifier() {
        return usernamelInputLocator;
    }

    // Блок атомарных методов
    public SelenideElement getUsernameInput() {
        return $(usernamelInputLocator);
    }

    public SelenideElement getPswInput() {
        return $(pswInputLocator);
    }

    public SelenideElement getLogInButton() {
        return $(logInButtonLocator);
    }


}
