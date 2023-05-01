package stepdefinitions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static com.codeborne.selenide.Selenide.screenshot;
import static com.codeborne.selenide.Selenide.switchTo;

public class CommonStepDefinitions {

    @Given("I set Configuration.screenshot to false")
    public void i_set_configuration_screenshot_to_false() {
//        will not take the screenshot even if the test case fails
        Configuration.screenshots=false;
    }

    @Given("I capture the screenshot of the page")
    public void i_capture_the_screenshot_of_the_page() {
//        Selenide.screenshot("my_screenshot");//OR SIMPLY
//        Selenide.screenshot(new Date().toString()); //giving a dynamic name
        try {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
            String fileName = "screenshot_" + timestamp; //giving a dynamic name
            Selenide.screenshot(fileName);
        } catch (Exception e) {
//            System.out.println("Failed to capture screenshot: " + e.getMessage());
            Logger logger = LoggerFactory.getLogger(getClass());
            logger.error("Failed to capture screenshot", e);
        }
    }




    @Given("I open the {string} browser")
    public void iOpenTheBrowser(String browserType) {
        switch (browserType){
            case "headless":
                Configuration.headless=true;
                break;
            case "firefox":
                Configuration.browser="firefox";
                break;
            case "safari":
                Configuration.browser="safari";
                break;
            case "edge":
                Configuration.browser="edge";
                break;
            default:
                Configuration.browser="chrome";
                break;
        }
    }
}
