package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LanitPage {
    private SelenideElement checkTitle = $(".page__title");
    private SelenideElement openProjects = $x("//*[contains(@class, 'menu__list')]//a[text()='Проекты']");
    private  SelenideElement openIndustry = $x("//*[@id='projects-list__industry-button']//*[contains(@class, 'ui-selectmenu-icon')]");
    private SelenideElement showResult =  $x("//span[text()='Показать']");
    private SelenideElement bankOption = $x("//*[@id='ui-id-2']");
    private SelenideElement checkoutBankResult = $x("//*[contains(@class, 'projects-list__list')]/div/a");

    public SelenideElement checkoutBankResult(){return checkoutBankResult;}
    public SelenideElement showResult() {return showResult;}
    public SelenideElement bankOption() {return bankOption;}
    public SelenideElement openProjects() {return openProjects;}
    public SelenideElement openIndustry(){return  openIndustry;}
    public SelenideElement checkTitle(){return checkTitle;}
    public SelenideElement searchByParam(String param){
        return $x(String.format("//a[@class='menu__item__link'][contains(text(),'%s')]", param));
    }
}
