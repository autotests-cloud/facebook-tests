package tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Environment.*;

@Tag("yandex_market")
public class YandexMarketTests extends TestBase {

    @Test
    @Description("Checking item can be found")
    void checkItemCanBeFound() {
        open(yandexMarketUrl);

        $("html").shouldHave(text("Яндекс.Маркет"));
        $("#header-search").val(yandexMarketItemName).pressEnter();
        $x("//h3/a[1]").click();
        switchTo().window(1);

        $(".n-title__text").shouldHave(text(yandexMarketItemName));
    }

}