package stepdefinitions;

import io.cucumber.java.en.Given;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class GoogleStepDefinitions {

    @Given("I navigate to {string}")
    public void i_navigate_to(String url) {
//        open("https://www.google.com");

        if (url == null) {
            throw new IllegalArgumentException("Url must not be null");
        }
        open(url); // going to "https://www.google.com"
        sleep(5000); // 5 sec
    }
}
