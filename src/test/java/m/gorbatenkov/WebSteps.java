package m.gorbatenkov;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps {
    @Step("Открываем главную страницу")
    public WebSteps openMainPage() {
        open("https://github.com");
        return this;
    }

    @Step("Ищем репозиторий {repo}")
    public WebSteps searchForRepository(String repo) {
        $(".header-search-input").setValue(repo).pressEnter();
        return this;
    }

    @Step("Переходим в репозиторий {repo}")
    public WebSteps goToRepository(String repo) {
        $(linkText(repo)).click();
        return this;
    }

    @Step("Открываем Issues")
    public WebSteps openIssuesTab() {
        $(partialLinkText("Issues")).click();
        return this;
    }

    @Step("Проверяем наличие Issue {issueNumber}")
    public WebSteps issueShouldBeVisible(int issueNumber) {
        $(withText("#" + issueNumber)).shouldBe(visible);
        return this;

    }
}
