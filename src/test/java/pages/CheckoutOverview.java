package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverview extends BasePage {
    public CheckoutOverview(WebDriver driver) {
        super(driver);
    }

    private final By checkoutOverviewPageNameLocator = By.className("title");
    private final By chosenProductNameLocator = By.xpath("//*[text()='Sauce Labs Fleece Jacket']");
    private final By finalTotalLocator = By.xpath("//div[contains(@class, 'summary_total_label')]");
    private final By taxLocator = By.cssSelector("[class='summary_tax_label']");
    private final By finishButtonLocator = By.id("finish");

    @Override
    protected By getPageIdentifier() {
        return checkoutOverviewPageNameLocator;
    }

    public WebElement getCheckoutOverviewPageName() {
        return waitsService.waitForVisibilityLocatedBy(checkoutOverviewPageNameLocator);
    }

    public WebElement getChosenProductName() {
        return waitsService.waitForVisibilityLocatedBy(chosenProductNameLocator);
    }

    public WebElement getFinalTotal() {
        return waitsService.waitForVisibilityLocatedBy(finalTotalLocator);
    }

    public WebElement getTax() {
        return waitsService.waitForVisibilityLocatedBy(taxLocator);
    }

    public WebElement getFinishButton() {
        return waitsService.waitForVisibilityLocatedBy(finishButtonLocator);
    }


}
