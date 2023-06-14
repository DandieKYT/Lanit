package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import pages.LanitPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

public class LanitSteps {
    LanitPage lanitPage = new LanitPage();
    @Step("Проверка наличия результата")
    public void responseSearchQA(){
        lanitPage.responseSearchQA().shouldNotBe(Condition.visible);
    }
    @Step("Поиск по слову QA")
    public void wordQA(){
        lanitPage.wordQA().pressEnter();
    }

    @Step("Нажатие на иконку Поиска")
    public void searchIcon(){
        lanitPage.searchIcon().click();
    }

    @Step("Проверка заголовка в ВК")
    public void checkOutPageVk(){
        lanitPage.checkOutPageVk().shouldBe(Condition.text("ЛАНИТ"));
        Selenide.closeWindow();
        switchTo().window(0);
    }
    @Step("Открытие страницы в ВК")
    public void openVkPage(){
        lanitPage.openVkPage().click();
        switchTo().window(1);
    }
    @Step("Проверка результатата на запрос - QA")
    public void checkOutResponseQA(){
        lanitPage.checkOutResponseQA().shouldNotBe(Condition.visible);
        Selenide.closeWindow();
        switchTo().window(1);
        Selenide.closeWindow();
        switchTo().window(0);
    }
    @Step("Ввод в поиск слово QA")
    public void inputQA(){
        lanitPage.inputQA().setValue("QA").pressEnter();
        switchTo().window(2);
    }
    @Step("Открытие страницы - Карьеры")
    public void openCareer(){
        lanitPage.openCareer().click();
        switchTo().window(1);
    }
    @Step("Проверка наличия результата")
    public void checkoutBankResult(){lanitPage.checkoutBankResult().shouldBe(Condition.visible);}
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
