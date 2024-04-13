package steps;

import baseEntities.BaseStep;
import models.User;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.products.InventoryPage;

public class NavigationSteps extends BaseStep {

    public NavigationSteps(WebDriver driver) {
        super(driver);
    }

    public InventoryPage logInSuccessfully(User user) {
        return new LoginPage(driver)
                .loginSuccess(user);
    }
}
