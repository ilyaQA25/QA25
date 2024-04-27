package steps;

import baseEntities.BaseSteps;

public class CheckoutSteps extends BaseSteps {
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
