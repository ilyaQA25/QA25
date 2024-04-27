package baseEntities;

import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;
import pages.checkouts.CheckoutFirstPage;
import pages.checkouts.CheckoutSecondPage;

public class BaseSteps {
    protected LoginPage loginPage;
    protected InventoryPage inventoryPage;
    protected CartPage cartPage;
    protected CheckoutFirstPage checkoutFirstPage;
    protected CheckoutSecondPage checkoutSecondPage;

    public BaseSteps() {
        loginPage = new LoginPage();
        inventoryPage = new InventoryPage();
        inventoryPage = new InventoryPage();
        cartPage = new CartPage();
        checkoutFirstPage = new CheckoutFirstPage();
        checkoutSecondPage = new CheckoutSecondPage();
    }

}