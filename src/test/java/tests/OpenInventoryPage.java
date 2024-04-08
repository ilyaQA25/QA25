package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.InventoryPage;
import steps.AddToCartSteps;
import steps.NavigationSteps;

public class OpenInventoryPage extends BaseTest {
    @Test(description = "human readable text_2")
    @Severity(SeverityLevel.CRITICAL)
    public void openInventoryPage() {
        NavigationSteps navigationSteps = new NavigationSteps(driver);
        navigationSteps.logIn(ReadProperties.username(), ReadProperties.password());
        Assert.assertTrue(new InventoryPage(driver).isPageOpened());
    }

    @Test(description = "human readable text_3")
    @Description("test adding goods in cart")
    @Severity(SeverityLevel.NORMAL)
    public void chooseGoods() {
        NavigationSteps navigationSteps = new NavigationSteps(driver);
        navigationSteps.logIn(ReadProperties.username(), ReadProperties.password());
        Assert.assertTrue(new InventoryPage(driver).isPageOpened());
        AddToCartSteps addToCartSteps = new AddToCartSteps(driver);
        addToCartSteps.addToCart();
        navigationSteps.getToCart();
        Assert.assertTrue(new CartPage(driver).isPageOpened());
    }

    @Test(description = "human readable text_2")
    @Severity(SeverityLevel.CRITICAL)
    public void failedOpenInventoryPage() {
        NavigationSteps navigationSteps = new NavigationSteps(driver);
        navigationSteps.logIn("dfgdfg", ReadProperties.password());
        Assert.assertTrue(new InventoryPage(driver).isPageOpened());
    }
}
