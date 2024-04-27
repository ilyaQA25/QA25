package baseEntities;

import com.codeborne.selenide.Configuration;
import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        Configuration.baseUrl = ReadProperties.getUrl();

    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
