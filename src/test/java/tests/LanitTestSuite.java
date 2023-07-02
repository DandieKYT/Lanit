package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LanitTestSuite extends TestBase {

    @Feature("Открытие страницы Проекты")
    @Story("Открытие страницы проекты и  просмотр проектов в банковской отрасли")
    @Test
    public void projects(){
        startTest.openPage();
        projectPage.openProject();
        projectPage.openIndustry();
        projectPage.bankOption();
        projectPage.showResult();
        projectPage.checkoutBankResult();
    }
    @Feature("Поиск вакансии в Lanit")
    @Story("Открытие страницы Карьера и поиск вакансии QA")
    @Test
    public void career(){
        startTest.openPage();
        careerPage.openCareer();
        careerPage.inputQA();
        careerPage.checkOutResponseQA();
    }
    @Feature("ВК")
    @Story("Открытие страницы компании в ВК")
        @Test
    public void vkGroup(){
        startTest.openPage();
        vkPage.openVkPage();
        vkPage.checkOutPageVk();
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
        startTest.openPage();
        activityProjectsPage.searchByParam(param);
        activityProjectsPage.checkTitle(expectedText);
        }
    @Feature("Поиск по сайту")
    @Story("Поиск по сайту с запросом QA")
    @Test
    public void searchTest(){
        startTest.openPage();
        searchPage.searchIcon();
        searchPage.wordQA();
        searchPage.responseSearchQA();
    }
}
