package pages;

import baseEntities.BasePage;
import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.products.InventoryPage;


public class LoginPage extends BasePage {
    private final String pagePath = "";
    @FindBy(id = "user-name")
    public WebElement userNameInput;
    @FindBy(id = "password")
    public WebElement passwordInput;
    @FindBy(id = "login-button")
    public WebElement loginButton;
    @FindBy(className = "error-message-container")
    public WebElement errorMessageLockedOut;

    public LoginPage(WebDriver driver) {
        super(driver, false);
    }

    @Override
    protected WebElement getPageIdentifier() {
        return userNameInput;
    }

    @Override
    protected String getPagePath() {
        return pagePath;
    }

    public LoginPage enterUserName(String name) {
        userNameInput.sendKeys(name);
        return this;
    }

    public LoginPage enterPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public InventoryPage loginSuccess(User user) {
        enterUserName(user.getUserName())
                .enterPassword(user.getPassword())
                .clickLoginButton();
        return new InventoryPage(driver);
    }

    public String getErrorTextLockedOutUser() {
        return errorMessageLockedOut.getText();
    }
}
