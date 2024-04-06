package steps;

import baseEntities.BaseSteps;
import org.openqa.selenium.WebDriver;
import pages.checkouts.CheckoutFirstPage;
import pages.checkouts.CheckoutLastPage;
import pages.checkouts.CheckoutSecondPage;
//
public class CheckoutSteps extends BaseSteps {
    public CheckoutSteps(WebDriver driver) {
        super(driver);
    }

    public void enterInfo(String firstName, String lastName, String postalCode) {
        CheckoutFirstPage checkoutInfoPage = new CheckoutFirstPage(driver);
        checkoutInfoPage.getFirstNameInput().sendKeys(firstName);
        checkoutInfoPage.getLastNameInput().sendKeys(lastName);
        checkoutInfoPage.getPostalCodeInput().sendKeys(postalCode);
        checkoutInfoPage.getContinueButton().click();
    }

    public void finishCheckout() {
        CheckoutSecondPage checkoutSecondPage = new CheckoutSecondPage(driver);
        checkoutSecondPage.getfinishButton().click();
    }

    public void backHome() {
        CheckoutLastPage checkoutLastPage = new CheckoutLastPage(driver);
        checkoutLastPage.getbackHomeButton().click();
    }
}
