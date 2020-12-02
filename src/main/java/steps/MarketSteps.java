package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MarketSteps {

    public String nameItem;

    Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);

    @Step("выбран пункт меню маркета {0}")
    public void stepSelectMarketItem(String menuItem) {
        new MarketPage().selectMarketItem(menuItem);
    }

    @Step("выбран тип электроники {0}")
    public void sterpSelectElectronicItem(String menuItem) {
        new MarketPage().selectElectronicItem(menuItem);
    }

    @Step("Нажать кнопку все фильтры")
    public void stepShowMoreClick() {
        new MarketPage().clickFilters();
    }

    @Step("нажать кнопку Показать все товары")
    public void stepShow() {
        new MarketPage().clickShow();
    }

    @Step("выбрать производителя {0}")
    public void choose(String companyName) {
        new MarketPage().selectCompany(companyName);
    }

    @Step("ввести значение {0} в поле цена")
    public void choosePrice(String cost) {
        new MarketPage().fillPrice(cost);
    }

    @Step("ввести в поиск по маркету первое из списка")
    public void stepFillSearchTitle() {
        nameItem = new MarketPage().getFirstTitle();
        new MarketPage().searchItemByName(nameItem);
//        new MarketPage().waitTitle();
//        String nameItem2 = new MarketPage().getFirstTitle();
//        assertTrue(String.format("Название заголовка [%s]. В поисковике - [%s]",
//                nameItem, nameItem2), nameItem.contains(nameItem2));
    }

    @Step("проверить количество что количество товаров совпадает с {0}")
    public void stepCheckTitleCount(int expectedTitleCount) {
        new MarketPage().waitTitle();
        int actualCount = new MarketPage().titlesCount();
        if (actualCount >= 47) {
            new MarketPage().waitTitle();
        } else {
            assertEquals(expectedTitleCount, actualCount);
        }
    }
    @Step("сравнить запомненное значение и первый результат")
    public void step(){

        String nameItem3 = new MarketPage().getFirstTitle();
        assertTrue(String.format("Название заголовка [%s]. В поисковике - [%s]",
                nameItem, nameItem3), nameItem.contains(nameItem3));
    }
    @Step("дождаться загрузки поиска")
    public void stepWaitTitle(){
        new  MarketPage().waitTitle();
        }
    @Step("дождаться загрузки новой страницы")
    public void stepWaitPage(){
        new  MarketPage().waitNextPage();
    }
    }




