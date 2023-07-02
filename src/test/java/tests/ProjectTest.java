package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ProjectTest extends TestBase {
    @Tag("LanitTests")
    @Tag("ProjectTest")
    @Feature("Открытие страницы Проекты")
    @Story("Открытие страницы проекты и  просмотр проектов в банковской отрасли")
    @Test
    public void projects() {
        startTest.openPage();
        projectPage.openProject();
        projectPage.openIndustry();
        projectPage.bankOption();
        projectPage.showResult();
        projectPage.checkoutBankResult();
    }
}
