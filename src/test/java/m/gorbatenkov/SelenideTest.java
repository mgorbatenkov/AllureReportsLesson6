package m.gorbatenkov;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideTest {

    @Test
    public void issueCheckGitHub() {
    open("https://github.com");
    $(".header-search-input").setValue("eroshenkoam/allure-example").pressEnter();
    $(linkText("eroshenkoam/allure-example")).click();
    $(partialLinkText("Issues")).click();
    $(withText("68")).shouldBe(visible);

}
}
