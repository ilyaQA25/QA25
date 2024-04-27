package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.checkouts.CheckoutLastPage;
import steps.AddToCartSteps;
import steps.CheckoutSteps;
import steps.NavigationSteps;

public class EndToEndTest extends BaseTest {
    @Parameters({"firstName-param", "lastName-param", "code-param"})
    @Test(testName = "e2e Adding to cart and checkout")
    public void e2eTest(@Optional("Ilya") String firstName,
                        @Optional("Prez") String lastName,
                        @Optional("22001") String postalCode) throws InterruptedException {
        NavigationSteps navigationSteps = new NavigationSteps();
        navigationSteps.logIn(ReadProperties.username(), ReadProperties.password());

        AddToCartSteps addToCartSteps = new AddToCartSteps();
        addToCartSteps.addToCart();
        navigationSteps.getToCart();

        navigationSteps.getToCheckout();
        CheckoutSteps checkoutSteps = new CheckoutSteps();

        checkoutSteps.enterInfo(firstName, lastName, postalCode);

        checkoutSteps.finishCheckout();

        CheckoutLastPage checkoutLastPage = new CheckoutLastPage();

        Assert.assertTrue(checkoutLastPage.hasBackButton());
        Assert.assertTrue(checkoutLastPage.hasTitle());
        checkoutSteps.backHome();
    }
}