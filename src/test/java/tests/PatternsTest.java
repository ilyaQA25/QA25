package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;

public class PatternsTest extends BaseTest {

    @Test
    public void createNewProjectTest() {
        DashboardPage dashboardPage = new DashboardPage(driver, true);
        Assert.assertTrue(
                dashboardPage
                        .clickAddProjectSideButton()
                        .addMinimalSetProject(testProject)
                        .isProjectInGrid(testProject));
    }
}