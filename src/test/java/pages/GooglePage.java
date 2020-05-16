package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class GooglePage {
    // Здесь храним элементы и css/xpath локаторы к ним
    SelenideElement searchInput = $(byName("q")),
            htmlBody = $("html");


    // Здесь реализована логика работы со страницей
    public void typeSearch(String text) {
        searchInput.val("lepra").pressEnter();
    }

    public void verifySearchHasResult(String text) {
        htmlBody.shouldHave(text(text)); // тоже самое, что и $(byText(text)).shouldBe(visible);
    }

}