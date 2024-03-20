package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void simpleDriverTest() {
        SimpleDriver simpleDriver = new SimpleDriver();
        WebDriver driver = simpleDriver.getDriver();

        driver.get("http://onliner.by");

        driver.quit();
    }

    @Test
    public void advancedDriverTest() throws InterruptedException{
        AdvancedDriver simpleDriver = new AdvancedDriver();
        WebDriver driver = simpleDriver.getDriver();

        driver.get("http://onliner.by");
        Thread.sleep(3000);

        driver.quit();
    }

    @Test
    public void browsersServiceTest() {
        BrowsersService browsersService = new BrowsersService();
        WebDriver driver = browsersService.getDriver();

        driver.get("http://onliner.by");

        driver.quit();
    }
}
