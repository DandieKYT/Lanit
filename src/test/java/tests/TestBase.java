package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import steps.LanitSteps;

import java.util.Map;

public class TestBase {

    LanitSteps lanitSteps = new LanitSteps();

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
        lanitSteps.browserLogs();
        lanitSteps.attachScreenshot();
        lanitSteps.pageSource();
        lanitSteps.addVideo();
    }
}
