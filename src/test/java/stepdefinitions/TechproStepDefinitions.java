package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.*;

public class TechproStepDefinitions {
    @Given("I get the tittle of the current page and verify if it contains {string}")
    public void i_get_the_tittle_of_the_current_page_and_verify_if_it_contains(String expectedTitle) {
        // getting the title of the page
        Assert.assertTrue(title().contains(expectedTitle));

    }
}
