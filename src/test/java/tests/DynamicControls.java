package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DynamicControls extends BaseTest {
    @Test
    public void dynamicControls() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");


        driver.findElement(By.xpath("//button[text() = 'Remove']")).click();
        waitsService.waitForExists(By.id("//h4"));
    }
}
