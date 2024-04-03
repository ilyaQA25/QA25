package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    // Блок описания локаторов для элементов
    private final By usernamelInputLocator = By.id("user-name");
    private final By pswInputLocator = By.id("password");
    private final By logInButtonLocator = By.id("login-button");


    // Блок иницализации
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return usernamelInputLocator;
    }

    // Блок атомарных методов
    public WebElement getEmailInput() {
        return waitsService.waitForExists(usernamelInputLocator);
    }

    public WebElement getPswInput() {
        return waitsService.waitForExists(pswInputLocator);
    }

    public WebElement getLogInButton() {
        return waitsService.waitForExists(logInButtonLocator);
    }


}
