package stepsDefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FirstStepDefs {
    WebDriver driver;
    @Given("открыть браузер")
    public void startBrowser() {

    }

    @When("страница логина открыта")
    @Given("open login page")
    public void openLoginPage() {
    }

    @Then("поле логина отображется")
    public void isUserNameDisplayed(){
        Assert.assertTrue(true);
    }

    @And("отображется поле пароля")
    public void passwFieldDisplayed() {

    }

    @But("кнопка логина не активна")
    public void isLoginButtonEnabled() {
        Assert.assertFalse(false);
    }

    @When("user {string} with password {string} log in")
    public void userWithPasswordLogIn(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }

    @Then("title is {string}")
    public void titleIs(String title) {
        System.out.println(title);
    }

    @And("^all elemnts \"(are|are not)\" visible$")
    public void allElemntsVisible(String parameter) {
        if (parameter.equals(("are"))){
            System.out.println();
        }else {
            System.out.println("are not");
        }
    }

    @When("user log in with")
    public void userLogInWith() {

    }

    @Given("open browser")
    public void openBrowser() {

    }
}
