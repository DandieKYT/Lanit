package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.LanitPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class LanitSteps {
    LanitPage lanitPage = new LanitPage();
    @Step("Проверка наличия результата")
    public void checkoutBankResult(){
        lanitPage.checkoutBankResult().shouldBe(Condition.visible);
    }

    @Step("Нажатие на кнопку - Показать")
    public void showResult(){
        lanitPage.showResult().click();
    }
    @Step("Проставление параметра - Банки, финансовые и страховые компании")
    public void bankOption(){
        lanitPage.bankOption().click();
    }
    @Step("Открытие вкладки Проекты")
    public void openProject(){
        lanitPage.openProjects().click();
    }
    @Step("Открытие выпадающего меню - Отрасли")
    public void openIndustry(){
        lanitPage.openIndustry().click();
    }
    @Step("Проверка страницы по ожидаемому тексту")
    public void checkTitle(String expectedText){
        lanitPage.checkTitle().shouldBe(text(expectedText));
    }
    @Step("Открытие верхнего меню")
    public void searchByParam(String param) {
        lanitPage.searchByParam(param).click();
    }
    @Step("Открытие стартовой страницы")
    public void openPage(){
        open("https://www.lanit.ru/");
    }
}
