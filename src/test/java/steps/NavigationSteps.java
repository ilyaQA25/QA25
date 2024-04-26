package steps;

import baseEntities.BaseSteps;
import org.openqa.selenium.WebDriver;
import pages.*;


public class NavigationSteps extends BaseSteps {

    private ChosenProducstPage chosenProducstPage;
    private AllProductsPage allProductsPage;
    private YourCartPage yourCartPage;
    private CheckoutOverview checkoutOverview;
    private CheckoutComplete checkoutComplete;

    public NavigationSteps(WebDriver driver) {
        super(driver);
    }

    public void AddToShoppingCart() {
        logger.info("Info Message: ...");
        chosenProducstPage = new ChosenProducstPage(driver);
        chosenProducstPage.getAddToCartButtom().click();
    }

    public void goToShoppingCart() {
        logger.info("Info Message: ...");
        chosenProducstPage = new ChosenProducstPage(driver);
        chosenProducstPage.getShoppingCartLink().click();
    }

    public void choseProduct() {
        logger.info("Info Message: ...");
        allProductsPage = new AllProductsPage(driver);
        allProductsPage.getChosenProductName().click();
    }

    public void goToCheckoutInformation() {
        logger.info("Info Message: ...");
        yourCartPage = new YourCartPage(driver);
        yourCartPage.getCheckoutButton().click();
    }

    public void goToComplete() {
        logger.info("Info Message: ...");
        checkoutOverview = new CheckoutOverview(driver);
        checkoutOverview.getFinishButton().click();
    }

    public void backHome() {
        logger.info("Info Message: ...");
        checkoutComplete = new CheckoutComplete(driver);
        checkoutComplete.getBackHomeButton().click();
    }
}