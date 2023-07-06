package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class ActivityProjectsPage {
    public SelenideElement checkTitle = $(".page__title");
    ActivityProjectsLocator locator = new ActivityProjectsLocator();

    public ActivityProjectsPage checkTitle(String expectedText) {
        step("Проверка страницы по ожидаемому тексту", () -> {
            checkTitle.shouldBe(text(expectedText));
        });
        return this;
    }

    public void searchByParam(String param) {
        locator.searchByParam(param).click();
    }
}

class ActivityProjectsLocator {
    public SelenideElement searchByParam(String param) {
        return $x(String.format("//a[@class='menu__item__link'][contains(text(),'%s')]", param));
    }

}

