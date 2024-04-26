package baseEntities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import services.WaitsService;
import tests.LoggerTest;

public abstract class BasePage {
    protected WebDriver driver;
    protected WaitsService waitsService;

    protected Logger logger = LogManager.getLogger(LoggerTest.class);

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.waitsService = new WaitsService(driver);
    }

    protected abstract By getPageIdentifier();   //идентификатор страницы

    public boolean isPageOpened() {
        return driver.findElement(getPageIdentifier()).isDisplayed();
    }
}