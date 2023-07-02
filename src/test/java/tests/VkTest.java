package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class VkTest extends TestBase {
    @Feature("ВК")
    @Story("Открытие страницы компании в ВК")
    @Test
    public void vkGroup(){
        startTest.openPage();
        vkPage.openVkPage();
        vkPage.checkOutPageVk();
    }
}
