package steps;

import baseEntities.BaseStep;
import models.Product;
import models.User;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.checkout.CheckoutLastPage;
import pages.products.ProductItemPage;
import pages.products.InventoryPage;

public class PurchaseSteps extends BaseStep {
    public PurchaseSteps(WebDriver driver) {
        super(driver);
    }

    public ProductItemPage addToCartFromItemPage(Product product) {
       return new InventoryPage(driver)
                .navigateToProductItemPage(product)
                .addItemToCart();
    }

    public CheckoutLastPage completeCheckoutSuccessfully(User user) {
        return new CartPage(driver)
                .navigateToCheckout()
                .fillInCheckoutInfo(user)
                .finishCheckout();
    }
}
