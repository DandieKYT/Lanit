<h1>Добро пожаловать!</br> 

# <a name="TableOfContents">Содержание страницы</a>
+ [:trophy: Мои инструменты и технологии](#MyToolsAndTechnologies)
+ [✍Описаниe](#Description)
+ [:heavy_check_mark:  Реализованные проверки:](#ImplementedСhecks)
+ [🎯Проект](#Project)
+ [👷‍♂️ Сборка в GitHub Actions](#Build_in_Jenkins)
+ [🖥 Запуск из терминала](#terminal)
+ [:chart_with_downwards_trend: Allure отчет](#Allure_report)
    + [Главный экран отчета](#Allure_report1)
    + [Страница с проведенными тестами](#Allure_report2)
+ [:bar_chart: Интеграция с Allure TestOps](#Integration_Allure_TestOps)
    + [Страница с тестами в TestOps](#ManualTest)
+ [:iphone: Отчет в Telegram](#Telegram)
+ [:movie_camera: Видео примеры прохождения тестов](#Video)

<a name="MyToolsAndTechnologies"><h2>:trophy: Мои инструменты и технологии</h2></a>
<p  align="center">

<code><a href = "https://www.java.com/ru/">![This is an image](/design/icons/Java.png)</a></code>
<code><a href = "https://gradle.org/">![This is an image](/design/icons/gradle.png)</a></code>
<code><a href = "https://www.jetbrains.com/ru-ru/idea/">![This is an image](/design/icons/Intelij_IDEA.png)</a></code>
<code><a href = "https://ru.selenide.org/">![This is an image](/design/icons/Selenide.png)</a></code>
<code><a href = "https://selenoid.autotests.cloud/#/">![This is an image](/design/icons/Selenoid.png)</a></code>
<code><a href = "https://junit.org/junit5/">![This is an image](/design/icons/JUnit5.png)</a></code>
<code><a href = "https://www.jenkins.io/">![This is an image](/design/icons/Jenkins.png)</a></code>
<code><a href = "https://github.com/allure-framework">![This is an image](/design/icons/Allure_Report.png)</a></code>
<code><a href = "https://qameta.io/">![This is an image](/design/icons/AllureTestOps.png)</a></code>
<code><a href = "https://web.telegram.org/k/">![This is an image](/design/icons/Telegram.png)</a></code>
<code><a href = "https://www.atlassian.com/ru/software/jira">![This is an image](/design/icons/Jira.png)</a></code>
<code><a href = "https://www.postman.com/">![This is an image](/design/icons/postman.png)</a></code>
<code><a href = "https://git-scm.com/">![This is an image](/design/icons/git.png)</a></code>
<code><a href = "https://github.com/">![This is an image](/design/icons/GitHub.png)</a></code>
<code><a href = "https://developer.chrome.com/docs/devtools/">![This is an image](/design/icons/devtools.png)</a></code>
</br>

<a name="Description"><h2>Описаниe</h2></a>
Автотесты в этом проекте написаны на `Java` с использованием `Selenide`.\
`Gradle` - для автоматической системы сборки.  \
`JUnit5` - для модульного тестирования.\
`Jenkins` - CI/CD для удаленного запуска тестов.\
`Selenoid` - для удаленного запуска браузеров в `Docker` контейнере.\
`Allure Report` - для визуализации результатов тестирования.\
`Telegram Bot` - для уведомлений о результатах тестирования.\
 
 <a name="ImplementedСhecks"><h2>:heavy_check_mark:  Реализованные проверки:</h2></a>
 
 :clipboard: Наличие вакансии тестировщика на <a href = "https://job.lanit.ru/main/index.html">Lanit </br>
 
 :speech_balloon: Открытие страницы проекты в<a href = "https://www.lanit.ru/projects/?arrFilter_pf%5BLINE_OF_BUSINESS%5D=-1&arrFilter_pf%5BINDUSTRY%5D=16424&arrFilter_pf%5BCLIENT%5D=-1&set_filter=Y"> банковской отрасли
  </br>
 
 :clipboard:Открытие страниц 
 <a href = "https://www.lanit.ru/activities/">Деятельность</a>/<a href = "https://www.lanit.ru/projects/">Проекты</a>
</br>

🔎 Поиск на сайте Lanit <a href = "https://www.lanit.ru/search/?q=QA">по запросу "QA"</a> и проверка 
содержимого страницы
</br>
 
 🔎: Проверка страницы компании в <a href = "https://vk.com/lanit_life">ВК</a>
 </br>
 
 <a name="Project"><h2>Проект</h2></a>
 <code><a href="https://www.lanit.ru/">![This is an image](/design/icons/Screenshot_4.jpg)</a></code>Проект по автоматизации тестирования для <a target="_blank" href="https://www.lanit.ru/">Lanit</a> — ведущая многопрофильная группа IT-компаний.
 :star2:
 
 <a name="Build_in_Jenkins" href="https://github.com/DandieKYT/Lanit/actions"><h2>👷‍♂️ Сборки в [GitHub Actions](https://github.com/DandieKYT/Lanit/actions)<h2></a>

![Screenshot_6](https://github.com/DandieKYT/Lanit/assets/75677738/4792be6f-63c7-4e23-8660-e3fb212f5835)



<a name="terminal"><h2>:computer: Запуск из терминала</h2></a>
Удаленный запуск:

```

clean test

```
<a name="Allure_report"><h2>:chart_with_downwards_trend: Allure </a><a href="https://dandiekyt.github.io/Lanit/3/">отчет</a></h2>

- <a name="Allure_report1"><h3>Главный экран отчета</h3></a>

![Screenshot_7](https://github.com/DandieKYT/Lanit/assets/75677738/4febe31d-d58f-4d0e-93ea-060200b6c497)


-  <a name="Allure_report2"><h3>Страница с проведенными тестами</h3></a>

![Screenshot_8](https://github.com/DandieKYT/Lanit/assets/75677738/70028383-f420-42f8-a89b-cfd4d36a589c)

    
<a name="Integration_Allure_TestOps"><h2>:bar_chart: Интеграция с Allure TestOps</h2></a>
    
   
 <a name="ManualTest"><h3>Страница с тестами в TestOps</h3></a>
    
    

![Screenshot_9](https://github.com/DandieKYT/Lanit/assets/75677738/c97af6e8-5639-4d45-bc06-a2fce5736937)



<a name="Telegram"><h2>:iphone: Отчет в Telegram</h2></a>

![telegram](https://github.com/DandieKYT/Lanit/assets/75677738/3def35d8-1581-4b11-a19e-0c8e45b2030f)



<a name="Video"><h2>:movie_camera: Видео примеры прохождения тестов</h2></a>

- <a name="Video1"><h3>Пример запуска тестов через selenoid</h3></a>
    <h1><a href="https://selenoid.autotests.cloud/video/2d5ca5c333f5f2471bbcdadf532a9c73.mp4">Test suite Lanit<br>
  

https://github.com/DandieKYT/Lanit/assets/75677738/ccac7ffd-7abb-4ce7-901c-e97057c0e46a


