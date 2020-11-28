package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainSteps {
    @Step("выбран пункт меню сверху {0}")
    public void stepSelectMenuItem(String menuItem){
        new MainPage().selectMenuItem(menuItem);
    }
}
