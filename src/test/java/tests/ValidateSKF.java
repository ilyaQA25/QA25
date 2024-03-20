package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

public class ValidateSKF {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowsersService browsersService = new BrowsersService();
        driver = browsersService.getDriver();
    }

    @Test
    public void validateSKF() throws InterruptedException {
        driver.get("https://bymed.top/calc/%D1%81%D0%BA%D1%84-2148");
        Thread.sleep(2000);

        driver.switchTo().frame(1);

        WebElement selectWebElementKrea = driver.findElement(By.id("cr-size"));
        Select selectKrea = new Select(selectWebElementKrea);


        WebElement selectWebElementSex = driver.findElement(By.id("sex"));
        Select selectSex = new Select(selectWebElementSex);

        WebElement selectWebElementRace = driver.findElement(By.id("race"));
        Select selectRace = new Select(selectWebElementRace);

        selectSex.selectByIndex(1);
        Thread.sleep(1000);

        selectSex.selectByValue("M");
        Thread.sleep(1000);

        selectKrea.selectByVisibleText("мг/дл");
        Thread.sleep(2000);

        selectRace.selectByValue("N");
        Thread.sleep(2000);

        WebElement age = driver.findElement(By.id("age"));
        age.sendKeys("21");
        Thread.sleep(2000);

        WebElement kreatin = driver.findElement(By.name("cr"));
        kreatin.sendKeys("500");
        Thread.sleep(2000);

        WebElement mass = driver.findElement(By.name("mass"));
        mass.sendKeys("89");
        Thread.sleep(2000);

        WebElement height = driver.findElement(By.name("grow"));
        height.sendKeys("189");
        Thread.sleep(2000);

        WebElement button = driver.findElement(By.xpath("//button[contains(text(), 'Рассчитать')]"));
        button.click();
        Thread.sleep(2000);

        WebElement resultMDRD = driver.findElement(By.id("mdrd"));
        Assert.assertEquals(resultMDRD.getText(), "0.09 мл/мин/1.73м2 - Терминальная почечная недостаточность (C5)");

        WebElement resultSKDEPI = driver.findElement(By.id("ckd_epi"));
        Assert.assertEquals(resultSKDEPI.getText(), "0.07 мл/мин/1.73м2 - Терминальная почечная недостаточность (C5)");

        WebElement resultCGE = driver.findElement(By.id("cge"));
        Assert.assertEquals(resultCGE.getText(), "0.29 мл/мин");

        WebElement resultSchwartz = driver.findElement(By.id("schwartz"));
        Assert.assertEquals(resultSchwartz.getText(), "0.27 мл/мин/1.73м2 - Терминальная почечная недостаточность (C5)");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
