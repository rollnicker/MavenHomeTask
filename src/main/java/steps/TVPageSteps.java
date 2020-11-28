package steps;

import pages.TVPage;
import ru.yandex.qatools.allure.annotations.Step;

public class TVPageSteps {

    @Step("нажали на кнопку Показать ещё")
    public void stepShowAllComp() {
        new TVPage().showAllComp();
    }
    @Step("выбран производитель {0}")
    public void stepSelectManufactor2(String menuItem) {
        new TVPage().fillSearchField2(menuItem);
    }

    @Step("выбран производитель {0}")
    public void stepSelectManufactor(String menuItem) {
        new TVPage().selectCompany(menuItem);
    }
}
