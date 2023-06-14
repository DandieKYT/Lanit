package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import steps.LanitSteps;

import static com.codeborne.selenide.Selenide.*;

public class LanitTest extends TestBase {

    LanitSteps lanitSteps = new LanitSteps();
    @Test
    public void projects(){
        lanitSteps.openPage();
        lanitSteps.openProject();
        lanitSteps.openIndustry();
        lanitSteps.bankOption();
        lanitSteps.showResult();
        lanitSteps.checkoutBankResult();
    }

    @Test
    public void career(){
        lanitSteps.openPage();
        lanitSteps.openCareer();
        lanitSteps.inputQA();
        lanitSteps.checkOutResponseQA();
    }
        @Test
    public void vkGroup(){
            open("https://www.lanit.ru/");
            $x("//*[contains(@class, 'icon_vk')]").click();
            switchTo().window(1);
            $x("//h1[text()='ЛАНИТ']").shouldBe(Condition.text("ЛАНИТ"));
            Selenide.closeWindow();
            switchTo().window(0);
        }
    @CsvSource(value = {
            "Деятельность,         НАПРАВЛЕНИЯ ДЕЯТЕЛЬНОСТИ",
            "Проекты,             КЛЮЧЕВЫЕ ПРОЕКТЫ",
    })
    @Owner("Кудрявцев")
    @Feature("Деятельность/Проекты")
    @Story("Открытие страниц  НАПРАВЛЕНИЯ ДЕЯТЕЛЬНОСТИ и КЛЮЧЕВЫЕ ПРОЕКТЫ")
    @ParameterizedTest
    public void activityProjects(String param, String expectedText){
        lanitSteps.openPage();
        lanitSteps.searchByParam(param);
        lanitSteps.checkTitle(expectedText);
        }
    @Test
    public void searchTest(){
        lanitSteps.openPage();
        $x("//*[contains(@class, 'search_header')]//*[contains(@class, 'search__icon')]").click();
        $x("//*[@name='q']").setValue("QA").pressEnter();
        $x("//font[contains(text(), 'К сожалению, на ваш поисковый запрос ничего не найдено.')]").shouldNotBe(Condition.visible);
    }
}
