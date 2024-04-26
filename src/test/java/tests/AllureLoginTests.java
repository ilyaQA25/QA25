package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class AllureLoginTests extends BaseTest {
    @Test(description = "Valid login")
    @Severity(SeverityLevel.CRITICAL)
        public void successfulLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

        Assert.assertTrue(
                loginPage
                        .successfulLogin(ReadProperties.username(), ReadProperties.password())
                        .isPageOpened()
        );
    }

    @Test(description = "Invalid login")
    @Severity(SeverityLevel.CRITICAL)
       public void wrongEmailLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

        Assert.assertTrue(
                loginPage
                        .successfulLogin("sdsads", ReadProperties.password())
                        .isPageOpened()
        );
    }

    @Test(description = "Problematic user login")
    @Severity(SeverityLevel.MINOR)
    public void problemUserLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

        Assert.assertTrue(
                loginPage
                        .successfulLogin("problem_user", ReadProperties.password())
                        .isPageOpened()
        );
    }

}
