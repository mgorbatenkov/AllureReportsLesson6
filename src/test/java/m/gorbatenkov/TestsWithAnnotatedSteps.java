package m.gorbatenkov;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;

import java.io.InputStream;

import static io.qameta.allure.Allure.addAttachment;

public class TestsWithAnnotatedSteps {
    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static int ISSUE_NUMBER = 68;

    @Test
    public void testGithub() {
        WebSteps steps = new WebSteps();
        steps.openMainPage()
                .searchForRepository(REPOSITORY)
                .goToRepository(REPOSITORY)
                .openIssuesTab()
                .issueShouldBeVisible(ISSUE_NUMBER);
    }
}
