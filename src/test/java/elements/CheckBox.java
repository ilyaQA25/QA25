package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {
    private UIElement uiElement;
    public CheckBox(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
    }

    public boolean isDisplayed() {
        return uiElement.isDisplayed();
    }

    public boolean isSelected() {
        return uiElement.isSelected();
    }

    public void selectCheckBox (boolean status) {
        if (isSelected() != status) {
            uiElement.click();
        }
    }
}