package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.WaitsService;

import java.time.Duration;

public class UploadTestHomework extends BaseTest {

    @Test
    public void uploadTest() {
        driver.get("https://the-internet.herokuapp.com/upload");
        WaitsService wait = new WaitsService(driver, Duration.ofSeconds(10));

        WebElement fileUploadPath = wait.waitForExists(By.id("file-upload"));
        String pathToFile = UploadTestHomework.class.getClassLoader().getResource("Tests.png").getPath();
        System.out.println(pathToFile);
        fileUploadPath.sendKeys(pathToFile);
        wait.waitForExists(By.id("file-submit")).submit();

        WebElement fileName = waitsService.waitForExists(By.id("uploaded-files"));
        Assert.assertEquals(fileName.getText(),"Tests.png");
    }
}
