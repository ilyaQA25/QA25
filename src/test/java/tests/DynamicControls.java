package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControls extends BaseTest {
    @Test
    public void dynamicControls() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");


        driver.findElement(By.xpath("//button[text() = 'Remove']")).click();
        waitsService.waitForVisibilityLocatedBy(By.id("message"));
        waitsService.waitForElementGone(By.id("checkbox"));

        Assert.assertFalse(driver.findElement(By.xpath("//form/input")).isEnabled());
        driver.findElement(By.xpath("//button[text() = 'Enable']")).click();
        WebElement secondMess = waitsService.waitForVisibilityLocatedBy(By.xpath("//p[@id='message']"));
        Assert.assertTrue(secondMess.isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//form/input")).isEnabled());
    }
}
