package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SearchTest extends TestBase {
    @Tag("LanitTests")
    @Tag("SearchTest")
    @Feature("Поиск по сайту")
    @Story("Поиск по сайту с запросом QA")
    @Test
    public void searchTest() {
        basePage.openPage();
        searchPage.searchIcon();
        searchPage.wordQA();
        searchPage.responseSearchQA();
    }
}
