package github;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BestSelenideContributorTest {

    @Test
    void andreiSolntcevShouldBeBestContributor() {
        //open rep page
        open("https://github.com/selenide/selenide");
        //first element in contributors field
        $(".Layout-sidebar").$(byText("Contributors"))
                .closest("div").$("ul li").hover();

        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));
        Selenide.sleep(5000);
    }
}
