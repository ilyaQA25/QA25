package tests;

import baseEntities.BaseTest;
import com.codeborne.selenide.Configuration;
import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest extends BaseTest {
    @Test
    public void simpleTest(){
        Configuration.baseUrl = ReadProperties.getUrl();
        open("/");
        $(By.id("user-name")).sendKeys("standard_user");
        $(By.id("password")).val("secret_sauce");
        $(By.id("login-button")).click();
        $(By.className("title")).shouldBe(visible).shouldHave(text("Products"));

    }
}