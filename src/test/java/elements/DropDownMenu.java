package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.List;

public class DropDownMenu {
    private List<UIElement> dropDownUiElementList;
    private List<String> elementTextList;
    private UIElement uiElement;

    public DropDownMenu(WebDriver driver, By locatorCore) {
        uiElement = new UIElement(driver, locatorCore);
        dropDownUiElementList = uiElement.findUIElements(By.xpath("*/descendant::li"));
        elementTextList = new ArrayList<String>();
        expandDropDown();

        for (UIElement uiElement: dropDownUiElementList) {
            elementTextList.add(uiElement.getText());
        }
    }

    public void expandDropDown() {
        uiElement.click();
    }

    public void getByIndex(int index) {
        expandDropDown();
        dropDownUiElementList.get(index).click();
    }

    public void getByText(String text) {
        expandDropDown();
        dropDownUiElementList.get(elementTextList.indexOf(text)).click();
    }
}