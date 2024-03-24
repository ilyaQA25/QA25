package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTestsHw extends BaseTest {

    @Test
    public void frameTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/frames");

        driver.findElement(By.cssSelector("[href*=iframe]")).click();

        waitsService.waitForVisibilityLocatedBy(By.cssSelector("h3"));

        driver.switchTo().frame(0);
        WebElement text = waitsService.waitForVisibilityLocatedBy(By.xpath("//body/p"));
        Assert.assertEquals(text.getText(),"Your content goes here.");
    }
}