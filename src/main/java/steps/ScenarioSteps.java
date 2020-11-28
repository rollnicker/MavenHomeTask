package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    MarketSteps marketSteps = new MarketSteps();
    TVPageSteps tvPageSteps = new TVPageSteps();

    @When("^выбран пункт меню \"(.*)\"$")
    public void stepSelectMenuItem(String menuItem) {
        mainSteps.stepSelectMenuItem(menuItem);
    }
    //MARKET
    @When("^выбран пункт маркета \"(.*)\"$")
    public void stepSelectMarketItem(String menuItem) {
        marketSteps.stepSelectMarketItem(menuItem);
    }
    @When("^выбран тип электроники \"(.*)\"$")
    public void stepSelectElectronicItem(String menuItem) { marketSteps.sterpSelectElectronicItem(menuItem); }
    @When("^нажали кнопку Все фильтры$")
    public void StepClickAllFilters() { marketSteps.stepShowMoreClick(); }
    @When("^нажали кнопку Показать все товары$")
    public void stepShow() {
        marketSteps.stepShow();
    }
    @When("^выбрали стоимость \"(.*)\"$")
    public void choosePrice(String cost) { marketSteps.choosePrice(cost); }
    @When("^выбран производитель \"(.*)\"$")
    public void lel(String companyName) {
        marketSteps.choose(companyName);
    }
    @When("^проверили что количество товаров: \"(.*)\"$")
    public void titlesCountCheck (int expectedCount) {
        marketSteps.stepCheckTitleCount(expectedCount -1);
    }
    @When("^В поисковую строку ввести первый элемент в списке и проверить, что наименование товара соответствует запомненному значению.$")
    public void titlestCheck() {
        marketSteps.stepFillSearchTitle();
    }
    @Then("^дождаться загрузки нового поиска$")
    public void stepWaitTitle() {
        marketSteps.stepWaitTitle();
    }
    @When("^ вот вот $")
    public void stepCheck() {
        marketSteps.step ();
    }

        // TV

    @When("^НЕ нажали кнопку Показать ещё$")
    public void stepShowMoreClick() { tvPageSteps.stepShowAllComp(); }
    @When("^НЕ введено название производитель \"(.*)\"$")
    public void stepFill(String menuItem) {
        tvPageSteps.stepSelectManufactor2(menuItem);
    }
    @When("^НЕ выбран производитель \"(.*)\"$")
    public void stepSelectCompany(String menuItem) {
        tvPageSteps.stepSelectManufactor(menuItem);
    }

}
