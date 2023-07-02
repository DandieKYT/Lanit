package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class ProjectPage {
    public SelenideElement
            checkoutBankResult = $x("//*[contains(@class, 'projects-list__list')]/div/a"),
            showResult =  $x("//span[text()='Показать']"),
            bankOption = $x("//*[@id='ui-id-2']"),
            openIndustry = $x("//*[@id='projects-list__industry-button']//*[contains(@class, 'ui-selectmenu-icon')]"),
            openProject = $x("//*[contains(@class, 'menu__list')]//a[text()='Проекты']");
    public ProjectPage openProject(){
        step("Открытие вкладки Проекты",() -> {
            openProject.click();
        });
        return this;
    }
    public ProjectPage openIndustry(){
        step("Открытие выпадающего меню - Отрасли",() -> {
            openIndustry.click();
        });
        return this;
    }
    public ProjectPage bankOption(){
        step("Проставление параметра - Банки, финансовые и страховые компании",() -> {
            bankOption.click();
        });
        return this;
    }
    public ProjectPage showResult(){
        step("Нажатие на кнопку - Показать",() -> {
            showResult.click();
        });
        return this;
    }
    public ProjectPage checkoutBankResult(){
        step("Проверка наличия результата",() -> {
            checkoutBankResult.shouldBe(Condition.visible);
        });
        return this;
    }
}
