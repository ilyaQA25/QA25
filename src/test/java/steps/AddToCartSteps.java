package steps;

import baseEntities.BaseSteps;
import org.openqa.selenium.WebDriver;
import pages.InventoryPage;

public class AddToCartSteps extends BaseSteps {
    private InventoryPage inventoryPage;

    public AddToCartSteps(WebDriver driver) {
        super(driver);
        this.inventoryPage = new InventoryPage(driver);
    }

    public void addToCart() {
        inventoryPage.getAddToCartButton().click();
    }
}
