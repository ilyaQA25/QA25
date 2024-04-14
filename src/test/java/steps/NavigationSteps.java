package steps;

import baseEntities.BaseSteps;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;

public class NavigationSteps extends BaseSteps {
    private LoginPage loginPage;
    private InventoryPage inventoryPage;
    private CartPage cartPage;

    public NavigationSteps(WebDriver driver) {
        super(driver);
    }

    public void logIn(String username, String psw) {
        loginPage = new LoginPage(driver);
        loginPage.getUsernameInput().sendKeys(username);
        loginPage.getPswInput().sendKeys(psw);
        loginPage.getLogInButton().click();
    }

    public void getToCart() {
        inventoryPage = new InventoryPage(driver);
        inventoryPage.getAddToCartButton().click();
        inventoryPage.getCartIconLocator().click();
    }

    public void getToCheckout() {
        cartPage = new CartPage(driver);
        cartPage.getCheckoutButtonLocator().click();
    }
}