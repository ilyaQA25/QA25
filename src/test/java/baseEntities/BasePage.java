package baseEntities;

import com.codeborne.selenide.Configuration;
import configuration.ReadProperties;
import org.openqa.selenium.By;

public abstract class BasePage {
    protected abstract By getPageIdentifier();

    public String getPageUrl(){
        return ReadProperties.getUrl();
    }

    public void openPageByUrl(String pagePath)  {
        Configuration.baseUrl = ReadProperties.getUrl()+ pagePath;
    }
}
