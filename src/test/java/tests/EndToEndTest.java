package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class EndToEndTest extends BaseTest {

    @Test
    public void e2eTest() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(
                loginPage.loginSuccess(basicUser)
                        .navigateToProductItemPage(productUnderTest)
                        .addItemToCart()
                        .navigateToCart()
                        .navigateToCheckout()
                        .fillInCheckoutInfo(basicUser)
                        .finishCheckout()
                        .isPageOpened()
        );
    }
}
