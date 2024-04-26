package baseEntities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import tests.LoggerTest;

public class BaseSteps {
    protected WebDriver driver;

    protected Logger logger = LogManager.getLogger(LoggerTest.class);
    public BaseSteps(WebDriver driver) {
        this.driver = driver;
    }
}