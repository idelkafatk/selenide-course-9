package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideRepoTest {
    @Test
    void shouldFindSelenideRepoInGit() {
        //open github
        open("https://github.com");
        //set selenide and press Enter
        $("[data-test-selector=nav-search-input]").setValue("Selenide").pressEnter();
        // open first link
        $(".repo-list li a").click();
        //check
        $("#repository-container-header .author a").shouldHave(text("selenide"));
    }
}
