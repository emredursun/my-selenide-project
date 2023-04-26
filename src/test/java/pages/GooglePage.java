package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GooglePage {

    public SelenideElement googleSearchBox = $(By.name("q"));
    public SelenideElement resultSection = $(By.id("result-stats"));
    public SelenideElement changeSearchLocation = $("#vc3jof > div > div");
    public SelenideElement chooseUSA = $(By.xpath("//li[contains(text(), 'English (United States)')]"));
    public ElementsCollection allLocations = $$("#tbTubd > div > li");
    public SelenideElement acceptGoogleCookies = $("#L2AGLb > div");
//    public SelenideElement acceptGoogleCookies = $(By.xpath("//div[contains(text(), 'Accept all')][@role='none']"));
    public ElementsCollection getAllSections = $$(By.xpath("//*[@class='g']"));
}
