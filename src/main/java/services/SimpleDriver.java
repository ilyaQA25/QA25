package services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleDriver {

    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/Ilya/IdeaProjects/automation_2.0/src/test/resources/chromedriver");

        return new ChromeDriver();
    }
}
