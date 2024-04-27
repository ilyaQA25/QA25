package baseEntities;

import com.codeborne.selenide.Configuration;
import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    protected WebDriver driver;

    @BeforeSuite
    public void setup() {
        Configuration.baseUrl = ReadProperties.getUrl();
        open("/");
    }
}
