package steps;

import baseEntities.BaseSteps;

public class AddToCartSteps extends BaseSteps {
    public void addToCart() {
        inventoryPage.getAddToCartButton().click();
    }
}
