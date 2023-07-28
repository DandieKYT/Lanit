package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ActivityProjectTest extends TestBase {
    @Tag("LanitTests")
    @Tag("ActivityProjectTest")
    @CsvSource(value = {
            "Бизнес-направления,         НАПРАВЛЕНИЯ ДЕЯТЕЛЬНОСТИ",
            "Проекты,             КЛЮЧЕВЫЕ ПРОЕКТЫ",
    })
    @Owner("Кудрявцев")
    @Feature("Бизнес-направления/Проекты")
    @Story("Открытие страниц  НАПРАВЛЕНИЯ ДЕЯТЕЛЬНОСТИ и КЛЮЧЕВЫЕ ПРОЕКТЫ")
    @ParameterizedTest
    public void activityProjects(String param, String expectedText) {
        basePage.openPage();
        activityProjectsPage.searchByParam(param);
        activityProjectsPage.checkTitle(expectedText);
    }
}
