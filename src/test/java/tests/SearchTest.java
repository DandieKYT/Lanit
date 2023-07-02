package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class SearchTest extends TestBase{
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
