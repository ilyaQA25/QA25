package steps;

import baseEntities.BaseSteps;
import pages.checkouts.CheckoutFirstPage;
import pages.checkouts.CheckoutLastPage;
import pages.checkouts.CheckoutSecondPage;

public class CheckoutSteps extends BaseSteps {
private CheckoutFirstPage checkoutFirstPage;
private CheckoutSecondPage checkoutSecondPage;
private CheckoutLastPage checkoutLastPage;

    public void enterInfo(String firstName, String lastName, String postalCode) {
        checkoutFirstPage.getFirstNameInput().sendKeys(firstName);
        checkoutFirstPage.getLastNameInput().sendKeys(lastName);
        checkoutFirstPage.getPostalCodeInput().sendKeys(postalCode);
        checkoutFirstPage.getContinueButton().click();
    }

    public void finishCheckout() {
        checkoutSecondPage.getfinishButton().click();
    }

    public void backHome() {
        checkoutLastPage.getbackHomeButton().click();
    }
}
