package pages.products;

import baseEntities.BasePage;
import models.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InventoryPage extends BasePage {
    private final String pagePath = "inventory.html";
    @FindBy(css = "[id*='_title_link']")
    public List<WebElement> productTitleList;

    public InventoryPage(WebDriver driver) {
        super(driver, true);
    }

    @Override
    protected WebElement getPageIdentifier() {
        return productTitleList.get(5);
    }

    @Override
    protected String getPagePath() {
        return pagePath;
    }


    public WebElement getProductByName(String productName) {
        for (WebElement element :
                productTitleList) {
            if (element.getText().contains(productName)) {
                return element;
            }
        }
        return null;
    }

    public ProductItemPage navigateToProductItemPage(Product product) {
        getProductByName(product.getProductName()).click();
        return new ProductItemPage(driver);
    }

}
