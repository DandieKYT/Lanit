package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;
import static io.qameta.allure.Allure.step;

public class CareerPage {

    public SelenideElement checkOutResponseQA = $x("//p[contains(text(), 'Увы, по вашему запросу ничего не нашлось.')]"), inputQA = $x("//*[contains(@class, 'Textfield_textfield__ac936')]"), openCareer = $x("//*[contains(@class, 'menu__list')]//a[text()='Карьера']");

    public CareerPage openCareer() {
        step("Открытие страницы - Карьеры", () -> {
            openCareer.click();
            switchTo().window(1);
        });
        return this;
    }

    public CareerPage inputQA() {
        step("Ввод в поиск слово QA", () -> {
            inputQA.setValue("QA").pressEnter();
            switchTo().window(2);
        });
        return this;
    }

    public CareerPage checkOutResponseQA() {
        step("Проверка результатата на запрос - QA", () -> {
            checkOutResponseQA.shouldNotBe(Condition.visible);
            Selenide.closeWindow();
            switchTo().window(1);
            Selenide.closeWindow();
            switchTo().window(0);
        });
        return this;
    }
}
