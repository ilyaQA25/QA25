package pages.projects;

import baseEntities.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProjectInfoPage extends BasePage {
    @FindBy (css = ".content-header-title")
    public WebElement projectTitle;

    @FindBy (id ="sidebar-milestones-add")
    public WebElement addMilestoneLink;

    public ProjectInfoPage(WebDriver driver, boolean isOpenedByUrl) {
        super(driver, isOpenedByUrl);
    }

    @Override
    protected WebElement getPageIdentifier() {
        return projectTitle;
    }

    @Override
    protected String getPagePath() {
        return "";
    }


}