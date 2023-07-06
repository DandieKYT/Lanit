package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;
import static io.qameta.allure.Allure.step;

public class VkPage {
    public SelenideElement checkOutPageVk = $x("//h1[text()='ЛАНИТ']"), openVkPage = $x("//*[contains(@class, 'icon_vk')]");

    public VkPage openVkPage() {
        step("Открытие страницы в ВК", () -> {
            openVkPage.click();
            switchTo().window(1);
        });
        return this;
    }

    public VkPage checkOutPageVk() {
        step("Проверка заголовка в ВК", () -> {
            checkOutPageVk.shouldBe(Condition.text("ЛАНИТ"));
            Selenide.closeWindow();
            switchTo().window(0);
        });
        return this;
    }
}
