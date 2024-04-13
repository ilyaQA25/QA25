package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.NavigationSteps;
import steps.PurchaseSteps;

public class StepsTest extends BaseTest {

    @Test
    public void stepsFullFlowTest() {
        NavigationSteps navigationSteps = new NavigationSteps(driver);
        navigationSteps.logInSuccessfully(basicUser);
        PurchaseSteps purchaseSteps = new PurchaseSteps(driver);
        purchaseSteps.addToCartFromItemPage(productUnderTest);

        Assert.assertTrue(
                purchaseSteps.completeCheckoutSuccessfully(basicUser)
                .isPageOpened());
    }
}
