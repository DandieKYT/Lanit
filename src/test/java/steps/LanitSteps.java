package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.LanitPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.openqa.selenium.logging.LogType.BROWSER;

public class LanitSteps {
    LanitPage lanitPage = new LanitPage();

    @Step("Получение логов браузера")
    @Attachment(value = "{attachName}", type = "text/plain")
    public static String attachAsText(String attachName, String message) {
        return message;
    }

    public static void browserLogs() {
        attachAsText(
                "Browser console log",
                String.join("\n", Selenide.getWebDriverLogs(BROWSER))
        );
    }

    @Attachment(value = "Скриншот", type = "image/png", fileExtension = "png")
    public static byte[] attachScreenshot() {
        return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }
    @Step("Получение записи видео теста")
    @Attachment(value = "Video", type = "text/html", fileExtension = ".html")
    public static String addVideo() {
        return "<html><body><video width='100%' height='100%' controls autoplay><source src ='"
                + getVideoUrl()
                + "' type='video/mp4'></video></body></html>";

    }

    public static URL getVideoUrl() {
        String videoUrl = "https://selenoid.autotests.cloud/video/" + sessionId() + ".mp4";
        try{
            return new URL(videoUrl);
        }   catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Step("Page Source")
    @Attachment(value = "Page Source", type = "text/plain")
    public static byte[] pageSource() {
        return getWebDriver().getPageSource().getBytes(StandardCharsets.UTF_8);
    }

    @Step("Проверка наличия результата")
    public void responseSearchQA(){
        lanitPage.responseSearchQA().shouldNotBe(Condition.visible);
    }
    @Step("Поиск по слову QA")
    public void wordQA(){
        lanitPage.wordQA().pressEnter();
    }

    @Step("Нажатие на иконку Поиска")
    public void searchIcon(){
        lanitPage.searchIcon().click();
    }

    @Step("Проверка заголовка в ВК")
    public void checkOutPageVk(){
        lanitPage.checkOutPageVk().shouldBe(Condition.text("ЛАНИТ"));
        Selenide.closeWindow();
        switchTo().window(0);
    }
    @Step("Открытие страницы в ВК")
    public void openVkPage(){
        lanitPage.openVkPage().click();
        switchTo().window(1);
    }
    @Step("Проверка результатата на запрос - QA")
    public void checkOutResponseQA(){
        lanitPage.checkOutResponseQA().shouldNotBe(Condition.visible);
        Selenide.closeWindow();
        switchTo().window(1);
        Selenide.closeWindow();
        switchTo().window(0);
    }
    @Step("Ввод в поиск слово QA")
    public void inputQA(){
        lanitPage.inputQA().setValue("QA").pressEnter();
        switchTo().window(2);
    }
    @Step("Открытие страницы - Карьеры")
    public void openCareer(){
        lanitPage.openCareer().click();
        switchTo().window(1);
    }
    @Step("Проверка наличия результата")
    public void checkoutBankResult(){lanitPage.checkoutBankResult().shouldBe(Condition.visible);}
    @Step("Нажатие на кнопку - Показать")
    public void showResult(){
        lanitPage.showResult().click();
    }
    @Step("Проставление параметра - Банки, финансовые и страховые компании")
    public void bankOption(){
        lanitPage.bankOption().click();
    }
    @Step("Открытие вкладки Проекты")
    public void openProject(){
        lanitPage.openProjects().click();
    }
    @Step("Открытие выпадающего меню - Отрасли")
    public void openIndustry(){
        lanitPage.openIndustry().click();
    }
    @Step("Проверка страницы по ожидаемому тексту")
    public void checkTitle(String expectedText){
        lanitPage.checkTitle().shouldBe(text(expectedText));
    }
    @Step("Открытие верхнего меню")
    public void searchByParam(String param) {
        lanitPage.searchByParam(param).click();
    }
    @Step("Открытие стартовой страницы")
    public void openPage(){
        open("https://www.lanit.ru/");
    }
}
