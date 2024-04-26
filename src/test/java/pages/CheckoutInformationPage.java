package pages;

import data.StaticProvider;
import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutInformationPage extends BasePage {
    public CheckoutInformationPage(WebDriver driver) {
        super(driver);
    }

    private final By checkoutInformationPageLocator = By.className("title");
    private final By firstNameInputLocator = By.cssSelector("[name|=firstName]");
    private final By lastNameInputLocator = By.cssSelector("[id^=la]");

    private final By zipInputLocator = By.xpath("//input[contains(@placeholder, 'Zip')]");
    private final By continueButtonLocator = By.xpath("//*[@data-test='continue' or @name='continue']");

    @Override
    protected By getPageIdentifier() {
        return checkoutInformationPageLocator;
    }

    public WebElement getCheckoutInformationPageLocator() {
        return waitsService.waitForVisibilityLocatedBy(checkoutInformationPageLocator);
    }

    public WebElement getFirstNameInput() {
        return waitsService.waitForVisibilityLocatedBy(firstNameInputLocator);
    }

    public WebElement getLastNameInput() {
        return waitsService.waitForVisibilityLocatedBy(lastNameInputLocator);
    }

    public WebElement getZipInput() {
        return waitsService.waitForVisibilityLocatedBy(zipInputLocator);
    }

    public WebElement getContinueButton() {
        return waitsService.waitForVisibilityLocatedBy(continueButtonLocator);
    }

    public void clicjContinueButton() {
        getContinueButton().click();
    }

    public void fillingCheckoutForm(String firstName, String lastName, String zip) {
        logger.info("Info Message: ...");
        getFirstNameInput().sendKeys(firstName);
        getLastNameInput().sendKeys(lastName);
        getZipInput().sendKeys(zip);
        clicjContinueButton();
    }
}
