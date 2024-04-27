package steps;

import baseEntities.BaseSteps;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;

public class NavigationSteps extends BaseSteps {
    private LoginPage loginPage;
    private InventoryPage inventoryPage;
    private CartPage cartPage;

    public void logIn(String username, String psw) {
        loginPage.getUsernameInput().sendKeys(username);
        loginPage.getPswInput().sendKeys(psw);
        loginPage.getLogInButton().click();
    }

    public void getToCart() {
        inventoryPage.getAddToCartButton().click();
        inventoryPage.getCartIconLocator().click();
    }

    public void getToCheckout() {
        cartPage.getCheckoutButtonLocator().click();
    }
}
