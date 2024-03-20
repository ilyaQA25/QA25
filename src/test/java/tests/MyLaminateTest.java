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

public class MyLaminateTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowsersService browsersService = new BrowsersService();
        driver = browsersService.getDriver();
    }

    @Test
    public void LaminateCalc() throws InterruptedException {
        driver.get("https://home-ex.ru/calculation/");
        Thread.sleep(1000);

        WebElement roomLength = driver.findElement(By.id("ln_room_id"));
        roomLength.clear();
        roomLength.sendKeys("600");
        Thread.sleep(1000);

        WebElement roomWidth = driver.findElement(By.id("wd_room_id"));
        roomWidth.clear();
        roomWidth.sendKeys("1300");
        Thread.sleep(1000);

        WebElement dieLength = driver.findElement(By.id("ln_lam_id"));
        dieLength.clear();
        dieLength.sendKeys("3200");
        Thread.sleep(1000);

        WebElement dieWidth = driver.findElement(By.id("wd_lam_id"));
        dieWidth.clear();
        dieWidth.sendKeys("290");
        Thread.sleep(2000);

        WebElement dieInPackage = driver.findElement(By.id("n_packing"));
        dieInPackage.clear();
        dieInPackage.sendKeys("20");
        Thread.sleep(2000);

        WebElement packageArea = driver.findElement(By.id("area"));
        packageArea.clear();
        packageArea.sendKeys("50");
        Thread.sleep(2000);

        WebElement stowage = driver.findElement(By.id("direction-laminate-id1"));
        stowage.click();
        Thread.sleep(2000);

        WebElement selectTypeOfStowage = driver.findElement(By.id("laying_method_laminate"));
        Select typeOfStowage = new Select(selectTypeOfStowage);

        typeOfStowage.selectByIndex(1);
        Thread.sleep(2000);

        WebElement buttonCalculate = driver.findElement(By.id("btn_calculate"));
        buttonCalculate.click();
        Thread.sleep(2000);

        WebElement reqiredDiesresult = driver.findElement(By.xpath("//div[contains(text(), 'Требуемое количество плашек ламината:')]"));
        Assert.assertEquals(reqiredDiesresult.getText(), "Требуемое количество плашек ламината: 95");

        WebElement reqiredPackageLaminat = driver.findElement(By.xpath("//div[contains(text(), 'Количество упаковок ламината:')]"));
        Assert.assertEquals(reqiredPackageLaminat.getText(), "Количество упаковок ламината: 5");

        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
