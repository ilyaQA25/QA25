package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.InventoryPage;
import steps.AddToCartSteps;
import steps.NavigationSteps;

public class OpenInventoryPage extends BaseTest {
    @Test()
    public void openInventoryPage() {
        NavigationSteps navigationSteps = new NavigationSteps(driver);
        navigationSteps.logIn(ReadProperties.username(), ReadProperties.password());
        Assert.assertTrue(new InventoryPage(driver).isPageOpened());
    }

    @Test()
    public void chooseGoods() {
        NavigationSteps navigationSteps = new NavigationSteps(driver);
        navigationSteps.logIn(ReadProperties.username(), ReadProperties.password());
        Assert.assertTrue(new InventoryPage(driver).isPageOpened());
        AddToCartSteps addToCartSteps = new AddToCartSteps(driver);
        addToCartSteps.addToCart();
        navigationSteps.getToCart();
        Assert.assertTrue(new CartPage(driver).isPageOpened());
    }
}
