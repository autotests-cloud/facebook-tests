package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class GooglePage {
    SelenideElement searchInput = $(byName("q"));
    SelenideElement button = $(byName("v"));

    public void typeSearch(String text) {
        searchInput.val("lepra").pressEnter();
    }

    public void verifySearchHasResult(String text) {
        $("html").shouldHave(text(text));
    }

}
