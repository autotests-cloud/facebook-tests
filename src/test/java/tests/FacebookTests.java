package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import pages.FacebookPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

@Epic("QA.GURU automation course")
@Story("Facebook tests")
@Tag("facebook")
class FacebookTests extends TestBase {

    @Test
    @Description("Positive test with testid")
    void successfulLoginWithTestId() {
        open("http://facebook.com");

        $(by("data-testid", "royal_email")).setValue("devday2019.test@gmail.com"); // Do not store private data in code!
        $(by("data-testid", "royal_pass")).setValue("devday2019");
        $(by("data-testid", "royal_login_button")).click();

        $("html").shouldHave(text("Devday"), text("Baku"));
    }


    @Test
    @Description("Positive test with PageObject")
    void successfulLoginWithPageObject() {
        FacebookPage facebookPage = new FacebookPage();

        open("http://facebook.com");

        facebookPage.typeEmail("qa.guru.test@gmail.com");
        facebookPage.typePassword("testpassword#&!");
        facebookPage.clickSubmit();

        facebookPage.verifyLoggedInAsUser("Qa", "Guru");
    }
}
