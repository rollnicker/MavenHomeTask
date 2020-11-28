package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class TVPage extends BaseSteps {

    @FindBy(xpath = "//INPUT[@class='_34OG20yGDA']")
    WebElement manufSearch;

    @FindBy(xpath = "//div[@class='_8yOdX16rYb']")
    WebElement companyName;

    @FindBy(xpath = "//h4[text()='Производитель']/../..//*[text()='Показать ещё']")
    WebElement showAll;

    public TVPage() {
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }

    public void showAllComp() {
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(showAll));
        showAll.click();
    }
    public void selectCompany(String name) {
        companyName.findElement(By.linkText(name)).click();
    }

    public void fillSearchField(String name){
        new BasePage().fillField(manufSearch, name);
        companyName.findElement(By.linkText(name)).click();
    }


    public void fillSearchField2(String name){
        manufSearch.sendKeys(name);
    }


}
