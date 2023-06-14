package pages;

import com.codeborne.selenide.Selenide;
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
    private SelenideElement openCareer = $x("//*[contains(@class, 'menu__list')]//a[text()='Карьера']");
    private SelenideElement inputQA = $x("//*[contains(@class, 'Textfield_textfield__ac936')]");
    private SelenideElement checkOutResponseQA = $x("//p[contains(text(), 'Увы, по вашему запросу ничего не нашлось.')]");
    private SelenideElement openVkPage = $x("//*[contains(@class, 'icon_vk')]");
    private SelenideElement checkOutPageVk = $x("//h1[text()='ЛАНИТ']");
    private SelenideElement searchIcon = $x("//*[contains(@class, 'search_header')]//*[contains(@class, 'search__icon')]");
    private SelenideElement wordQA = $x("//*[@name='q']");
    private SelenideElement responseSearchQA = $x("//font[contains(text(), 'К сожалению, на ваш поисковый запрос ничего не найдено.')]");

    public SelenideElement responseSearchQA(){return responseSearchQA;}
    public SelenideElement wordQA(){return  wordQA;}
    public SelenideElement searchIcon(){return searchIcon;}
    public SelenideElement checkOutPageVk(){return checkOutPageVk;}
    public SelenideElement openVkPage(){return openVkPage;}
    public SelenideElement checkOutResponseQA(){return checkOutResponseQA;}
    public SelenideElement inputQA(){return inputQA;}
    public SelenideElement openCareer(){return openCareer;}
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
