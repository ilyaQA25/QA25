package tests;

import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

public class SauceDemo {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowsersService browsersService = new BrowsersService();
        driver = browsersService.getDriver();
    }

    @Test
    public void sauceDemo() throws InterruptedException {
        driver.get(ReadProperties.getUrl());
        Thread.sleep(1000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.className("submit-button")).click();
        Thread.sleep(1000);

        Assert.assertTrue(driver.findElement(By.tagName("footer")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText("Sauce Labs Onesie")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.partialLinkText("Onesie")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.xpath("//footer")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Sauce Labs Fleece Jacket']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='item_4_title_link']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@id, 'roo')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'(Red)')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//footer/ancestor::div")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//footer/parent::div")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.xpath("//div/descendant::span")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div/div[@class='inventory_item']/following::img")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div/div[@class='inventory_item']/preceding::img")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.cssSelector(".page_wrapper")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector(".btn.btn_primary")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector(".pricebar .inventory_item_price")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("#item_1_img_link")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("button")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("div.inventory_item")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.cssSelector("[class='pricebar']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("[alt~='Sauce']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("[class|='bm']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("[class^='inv']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("div[id$='er']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("button[data-test*='car']")).isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
