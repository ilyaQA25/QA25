package steps;

import baseEntities.BaseSteps;

public class NavigationSteps extends BaseSteps {
    public void logIn(String username, String psw) {
        loginPage.getUsernameInput().sendKeys(username);
        loginPage.getPswInput().sendKeys(psw);
        loginPage.getLogInButton().click();

    }

    public void getToCart() {
        inventoryPage.getCartIconLocator().click();
    }

    public void getToCheckout() {
        cartPage.getCheckoutButtonLocator().click();
    }

}

