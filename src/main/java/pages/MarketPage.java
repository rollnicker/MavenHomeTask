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

import java.util.List;

public class MarketPage extends BasePage {
    public MarketPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//DIV[@role='tablist']")
    WebElement marketItems;

    public void selectMarketItem(String itemName) {
        marketItems.findElement(By.linkText(itemName)).click();
    }

    @FindBy(xpath = "//div[@class='section _32PriwSr5B _3WZ8yOWVnM _2pc-e5GHOv uVxPQP6pdS']")
    WebElement electronicItems;

    public void selectElectronicItem(String item) {
        electronicItems.findElement(By.linkText(item)).click();
    }

    @FindBy(xpath = "//*[text()='Все фильтры']/..")
    WebElement filters;

    public void clickFilters() {
        filters.click();
    }

    @FindBy(xpath = "//legend[text()='Производитель']/..//BUTTON[@class='_1YeOF5Jcfi _2Wg9rE1HzR'][text()='Показать всё']")
    WebElement showAll;

    public void clickShow() {
        showAll.click();
//            wait.until(ExpectedConditions.visibilityOf(item));

//            List<WebElement> titles = BaseSteps.getDriver().findElements(By.xpath("//a[@class='_27nuSZ19h7 wwZc93J2Ao cia-cs']"));
//            System.out.println(titles.size());

//            String firstTitle = item.getAttribute("title");
//            System.out.println(item.getAttribute("title"));
//            headerSearch.sendKeys(firstTitle);
//            submit.click();
//            wait.until(ExpectedConditions.visibilityOf(item));


    }

    @FindBy(xpath = "//span[@class='NVoaOvqe58 _17C4Le-0TB']")
    WebElement company;

    @FindBy(id = "7893318-suggester")
    WebElement search;

    @FindBy(xpath = "//a[@class='_27nuSZ19h7 wwZc93J2Ao cia-cs']")
    WebElement TitleOfItem;

    @FindBy(id = "glpricefrom")
    WebElement price;

    @FindBy(xpath = "//a[@class='_27nuSZ19h7 wwZc93J2Ao cia-cs']")
    WebElement item;

    @FindBy(id = "header-search")
    WebElement headerSearch;

    @FindBy(xpath = "//BUTTON[@type='submit']")
    WebElement submit;

    public void selectCompany(String companyName) {
        search.click();
        search.clear();
        search.sendKeys(companyName);
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(BaseSteps.getDriver().findElement(By.xpath("//span[@class='NVoaOvqe58 _17C4Le-0TB'][contains(text(),'" + companyName + "')]"))));
        BaseSteps.getDriver().findElement(By.xpath("//span[@class='NVoaOvqe58 _17C4Le-0TB'][contains(text(),'" + companyName + "')]")).click();
    }

    public void fillPrice(String cost) {
        price.click();
        fillField(price, cost);
    }
    public String getFirstTitle() {
        String titleName = item.getAttribute("title");
        return titleName;
    }
    public int titlesCount() {
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(item));
        List<WebElement> titles = BaseSteps.getDriver().findElements(By.xpath("//a[@class='_27nuSZ19h7 wwZc93J2Ao cia-cs']"));
        int titlesCount = titles.size();
        return titlesCount;
    }
    public void searchItemByName(String itemName) {
        headerSearch.click();
        headerSearch.sendKeys(itemName);
        submit.click();
    }
    public String getSearchValue() {
        String searchValue = headerSearch.getAttribute("value");
        return searchValue;
    }
    public void waitTitle() {
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(item));
    }
}

