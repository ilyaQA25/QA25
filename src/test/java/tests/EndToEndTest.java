package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.InventoryPage;
import pages.checkouts.CheckoutFirstPage;
import pages.checkouts.CheckoutLastPage;
import pages.checkouts.CheckoutSecondPage;
import steps.AddToCartSteps;
import steps.CheckoutSteps;
import steps.NavigationSteps;
//
public class EndToEndTest extends BaseTest {
    @Parameters({"firstName-param", "lastName-param", "code-param"})
    @Test(testName = "e2e Adding to cart and checkout")
    public void e2eTest(@Optional("Ilya") String firstName,
                        @Optional("Prez") String lastName,
                        @Optional("22001") String postalCode) throws InterruptedException {
        NavigationSteps navigationSteps = new NavigationSteps(driver);
        navigationSteps.logIn(ReadProperties.username(), ReadProperties.password());
        Assert.assertTrue(new InventoryPage(driver).isPageOpened());
        AddToCartSteps addToCartSteps = new AddToCartSteps(driver);
        addToCartSteps.addToCart();
        navigationSteps.getToCart();
        Assert.assertTrue(new CartPage(driver).isPageOpened());

        navigationSteps.getToCheckout();
        Assert.assertTrue(new CheckoutFirstPage(driver).isPageOpened());
        CheckoutSteps checkoutSteps = new CheckoutSteps(driver);
        checkoutSteps.enterInfo(firstName, lastName, postalCode);
        Assert.assertTrue(new CheckoutSecondPage(driver).isPageOpened());
        checkoutSteps.finishCheckout();

        CheckoutLastPage checkoutLastPage = new CheckoutLastPage(driver);
        Assert.assertTrue(checkoutLastPage.isPageOpened());
        Assert.assertTrue(checkoutLastPage.hasBackButton());
        Assert.assertTrue(checkoutLastPage.hasTitle());
        checkoutSteps.backHome();
    }
}
