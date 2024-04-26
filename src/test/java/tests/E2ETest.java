package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import steps.NavigationSteps;
import data.StaticProvider;

public class E2ETest extends BaseTest {


    @Test(dataProvider = "dataForCheckoutForm", dataProviderClass = StaticProvider.class)
    public void end2endTest(String firstName, String lastName, String zip) {

        NavigationSteps navigationSteps = new NavigationSteps(driver);

        LoginPage loginPage = new LoginPage(driver);

        Assert.assertTrue(
                loginPage
                        .successfulLogin(ReadProperties.username(), ReadProperties.password())
                        .isPageOpened()
        );

        AllProductsPage allProductsPage = new AllProductsPage(driver);

        Assert.assertEquals(allProductsPage.getProductPageName().getText(), "Products");
        Assert.assertEquals(allProductsPage.getChosenProductName().getText(), "Sauce Labs Fleece Jacket");


        Assert.assertEquals(allProductsPage.getProductPageName().getText(), "Products");
        Assert.assertEquals(allProductsPage.getChosenProductName().getText(), "Sauce Labs Fleece Jacket");
        navigationSteps.choseProduct();

        Assert.assertTrue(new ChosenProducstPage(driver).isPageOpened());
        ChosenProducstPage chosenProducstPage = new ChosenProducstPage(driver);

        Assert.assertEquals(chosenProducstPage.geChosenProductsPageName().getText(), "Back to products");
        Assert.assertEquals(chosenProducstPage.getChosenProductName().getText(), "Sauce Labs Fleece Jacket");
        navigationSteps.AddToShoppingCart();
        Assert.assertEquals(chosenProducstPage.getProductСounter().getText(), "1");
        navigationSteps.goToShoppingCart();

        Assert.assertTrue(new YourCartPage(driver).isPageOpened());
        YourCartPage yourCartPage = new YourCartPage(driver);

        Assert.assertEquals(yourCartPage.getYourCartPageName().getText(), "Your Cart");
        Assert.assertEquals(yourCartPage.getChosenProductName().getText(), "Sauce Labs Fleece Jacket");
        Assert.assertEquals(yourCartPage.getProductPrice().getText(), "$49.99");
        navigationSteps.goToCheckoutInformation();

        Assert.assertTrue(new CheckoutInformationPage(driver).isPageOpened());
        CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage(driver);

        Assert.assertEquals(checkoutInformationPage.getCheckoutInformationPageLocator().getText(), "Checkout: Your Information");

        checkoutInformationPage.fillingCheckoutForm(firstName, lastName, zip);

        Assert.assertTrue(new CheckoutOverview(driver).isPageOpened());
        CheckoutOverview checkoutOverview = new CheckoutOverview(driver);

        Assert.assertEquals(checkoutOverview.getCheckoutOverviewPageName().getText(), "Checkout: Overview");
        Assert.assertEquals(checkoutOverview.getChosenProductName().getText(), "Sauce Labs Fleece Jacket");
        Assert.assertEquals(checkoutOverview.getFinalTotal().getText(), "Total: $53.99");
        Assert.assertEquals(checkoutOverview.getTax().getText(), "Tax: $4.00");
        navigationSteps.goToComplete();

        Assert.assertTrue(new CheckoutComplete(driver).isPageOpened());
        CheckoutComplete checkoutComplete = new CheckoutComplete(driver);

        Assert.assertEquals(checkoutComplete.getCheckoutCompletePageName().getText(), "Checkout: Complete!");
        Assert.assertEquals(checkoutComplete.getHeaderMessage().getText(), "Thank you for your order!");
        Assert.assertEquals(checkoutComplete.getMessageText().getText(), "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
        navigationSteps.backHome();

        Assert.assertTrue(new AllProductsPage(driver).isPageOpened());
    }
}
