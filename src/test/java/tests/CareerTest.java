package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class CareerTest extends TestBase {
    @Tag("LanitTests")
    @Tag("CareerTest")
    @Feature("Поиск вакансии в Lanit")
    @Story("Открытие страницы Карьера и поиск вакансии QA")
    @Test
    public void career() {
        basePage.openPage();
        careerPage.openCareer();
        careerPage.inputQA();
        careerPage.checkOutResponseQA();
    }
}
