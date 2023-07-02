package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import help.Attachment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.*;


import java.util.Map;

import static io.qameta.allure.Allure.step;

public class TestBase {
    StartTest startTest = new StartTest();
    Attachment attachment = new Attachment();
    ProjectPage projectPage = new ProjectPage();
    CareerPage careerPage = new CareerPage();
    VkPage vkPage = new VkPage();
    ActivityProjectsPage activityProjectsPage = new ActivityProjectsPage();
    SearchPage searchPage = new SearchPage();


    @BeforeAll
    static void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserVersion = "100.0";
        Configuration.remote = "https://user1:1234@" + System.getProperty("selenoid_url", "selenoid.autotests.cloud/wd/hub");
        Configuration.baseUrl = "https://www.lanit.ru/";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true

        ));

        Configuration.browserCapabilities = capabilities;
    }

    @AfterEach
    void attachments() {
        attachment.browserLogs();
        attachment.attachScreenshot();
        attachment.pageSource();
        attachment.addVideo();
    }
    public class StartTest{
        public StartTest openPage(){
            step("Открытие сайта",() -> {
                Selenide.open("https://www.lanit.ru/");
            });
            return this;
        }
    }
}
