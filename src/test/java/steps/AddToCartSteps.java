package steps;

import baseEntities.BaseSteps;
import pages.InventoryPage;

public class AddToCartSteps extends BaseSteps {
    private InventoryPage inventoryPage;
    public void addToCart() {
        inventoryPage.getAddToCartButton().click();
    }
}
