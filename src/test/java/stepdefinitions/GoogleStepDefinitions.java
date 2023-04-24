package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class GoogleStepDefinitions {

    @Given("I navigate to {string}")
    public void i_navigate_to(String url) {
//        open("https://www.google.com");

        if (url == null) {
            throw new IllegalArgumentException("Url must not be null");
        }
        open(url); // going to the given url
        sleep(5000); // 5 sec
    }
    @Given("I wait for {int} seconds")
    public void i_wait_for_seconds(Integer timeForWait) {
        sleep(timeForWait * 1000); // 5 seconds = 5000 milliseconds
    }
    @Given("I navigate back")
    public void i_navigate_back() {
        back();
    }
    @Given("I forward")
    public void i_forward() {
        forward();
    }
    @Given("I refresh the page")
    public void i_refresh_the_page() {
        refresh();
    }
    @Then("I hold the browser open")
    public void i_hold_the_browser_open() {

    }
}
