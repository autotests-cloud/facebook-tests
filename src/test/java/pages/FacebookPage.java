package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class FacebookPage {
    SelenideElement emailInput = $(by("data-testid", "royal_email"));
    SelenideElement passwordInput = $(by("data-testid", "royal_pass"));
    SelenideElement submitButton = $(by("data-testid", "royal_login_button"));

    @Step("Type email {email}")
    public void typeEmail(String email) {
        emailInput.setValue(email);
    }

    @Step("Type password {password}")
    public void typePassword(String password) {
        passwordInput.setValue(password);
    }

    @Step("Click submit button")
    public void clickSubmit() {
        submitButton.click();
    }

    @Step("Verify logged in as {firstName} {lastName}")
    public void verifyLoggedInAsUser(String firstName, String lastName) {
        $("html").shouldHave(text(firstName), text(lastName));
    }
}
