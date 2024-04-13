package pages.products;

import baseEntities.BasePage;
import models.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CartPage;

public class ProductItemPage extends BasePage {
    private final String pagePath = "inventory-item.html?id=";
    @FindBy(id = "add-to-cart")
    public WebElement addItemToCartButton;
    @FindBy(id = "shopping_cart_container")
    public WebElement cartButton;

    public ProductItemPage(WebDriver driver) {
        super(driver, true);
    }

    @Override
    protected WebElement getPageIdentifier() {
        return addItemToCartButton;
    }

    @Override
    public String getPagePath() {
        return pagePath + Product.getId();
    }

    public ProductItemPage addItemToCart() {
        addItemToCartButton.click();
        return this;
    }

    public CartPage navigateToCart() {
        cartButton.click();
        return new CartPage(driver);
    }

    public int getAmountOfItemInCart() {
        return Integer.parseInt(cartButton.getText());
    }
}
