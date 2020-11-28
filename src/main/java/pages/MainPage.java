package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MainPage extends BasePage {
    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

//    @FindBy(id = "text")
//    WebElement searchString;
//    @FindBy(xpath = "//DIV[@class='search2__button']//button")
//    WebElement searchButton;
    @FindBy(className = "services-new__list")
    WebElement menuItems;

    public void selectMenuItem(String itemName) {
        menuItems.findElement(By.linkText(itemName)).click();
        for (String tab : BaseSteps.getDriver().getWindowHandles()){
            BaseSteps.getDriver().switchTo().window(tab);

        }
    }

}
