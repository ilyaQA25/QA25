package baseEntities;

import configuration.ReadProperties;
import models.Product;
import models.User;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import services.BrowsersService;
import steps.NavigationSteps;


public abstract class BaseTest {
    protected WebDriver driver;
    protected User basicUser;
    protected Product productUnderTest;

    @BeforeClass
    public void setupData() {
        basicUser = User.builder()
                .userName(ReadProperties.username())
                .password(ReadProperties.password())
                .firstName("Ilya")
                .lastName("Prez")
                .zipcode("220001")
                .build();
        productUnderTest = new Product("4", "Sauce Labs Backpack");
    }

    @BeforeMethod
    public void setup() {
        driver = new BrowsersService().getDriver();
        NavigationSteps navigationSteps = new NavigationSteps(driver);
        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
