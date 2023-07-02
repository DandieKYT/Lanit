package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class SearchPage {
    public SelenideElement wordQA = $x("//*[@name='q']"), searchIcon = $x("//*[contains(@class, 'search_header')]//*[contains(@class, 'search__icon')]"), responseSearchQA = $x("//font[contains(text(), 'К сожалению, на ваш поисковый запрос ничего не найдено.')]");

    public SearchPage wordQA() {
        step("Поиск по слову QA", () -> {
            wordQA.setValue("QA").pressEnter();
        });
        return this;
    }

    public SearchPage searchIcon() {
        step("Нажатие на иконку Поиска", () -> {
            searchIcon.click();
        });
        return this;
    }

    public SearchPage responseSearchQA() {
        step("Проверка наличия результата", () -> {
            responseSearchQA.shouldNotBe(Condition.visible);
        });
        return this;
    }


}
