package baseEntities;

import configuration.ReadProperties;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import services.WaitsService;

public abstract class BasePage {
    protected static final int WAIT_FOR_PAGE_LOADED_IN_SECONDS = 30;
    protected WebDriver driver;
    protected  WaitsService wait;

    public BasePage(WebDriver driver, boolean openPageByUrl) {
        this.driver = driver;
        this.wait = new WaitsService(driver);
        PageFactory.initElements(driver, this);

        if (openPageByUrl) {
            navigatePageUrl();
        }

        waitForOpen();
    }

    protected abstract WebElement getPageIdentifier();

    protected abstract String getPagePath();

    public boolean isPageOpened() {
        try {
            return getPageIdentifier().isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void navigatePageUrl() {
        driver.get(ReadProperties.getUrl() + getPagePath());
    }

    private void waitForOpen() {
        int tryCount = 0;
        boolean isPageIdentifierLoaded = isPageOpened();

        while (!isPageIdentifierLoaded &&
                (tryCount < WAIT_FOR_PAGE_LOADED_IN_SECONDS / ReadProperties.timeout())) {
            tryCount++;
            isPageIdentifierLoaded = isPageOpened();
        }

        if (!isPageIdentifierLoaded) {
            throw new AssertionError("Page is not loaded");
        }
    }
}
