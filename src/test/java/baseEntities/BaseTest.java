package baseEntities;

import configuration.ReadProperties;
import models.Project;
import models.User;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import services.BrowsersService;
import steps.NavigationSteps;

public class BaseTest {
    protected WebDriver driver;
    protected User basicUser;
    protected Project testProject;

    @BeforeTest
    public void setUpData() {
        basicUser = new User();
        basicUser.setEmail(ReadProperties.username());
        basicUser.setPassword(ReadProperties.password());
        testProject = new Project();
        testProject.setName("Test_project");
        testProject.setAnnouncement("Test_project");
        testProject.setIsAnnouncementShown(false);
        testProject.setProjectType(1);
        testProject.setIsApprovalEnabled(false);
    }

    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();
        driver.get(ReadProperties.getUrl());
        NavigationSteps navigationSteps = new NavigationSteps(driver);
        navigationSteps.successLogin(basicUser);
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}