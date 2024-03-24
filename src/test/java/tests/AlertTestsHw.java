package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTestsHw extends BaseTest {

    @Test
    public void promptAlertTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[. = 'Click for JS Prompt']")).click();

        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS prompt");
        alert.sendKeys("Everything is OK!");
        alert.accept();
    }
}
