package com.blackstar.step_defs;

import com.blackstar.pages.GooglePage;
import com.blackstar.pages.WikiPage;
import com.blackstar.utilities.ConfigurationReader;
import com.blackstar.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Wikipedia {

    GooglePage googlePage=new GooglePage();
    WikiPage wikiPage=new WikiPage();
    @Given("user is on google main page")
    public void user_is_on_google_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        googlePage.cookies.click();

    }
    @When("user types {string} on search bar and presses enter")
    public void user_types_on_search_bar_and_presses_enter(String string) {
        googlePage.searchBar.sendKeys(string+Keys.ENTER);
    }
    @When("user clicks the first link")
    public void user_clicks_the_first_link() {
        googlePage.wiki.click();
    }
    @When("user types {string} in search bar")
    public void user_types_in_search_bar(String string) {
        wikiPage.searchInput.sendKeys(string+ Keys.ENTER);
    }
    @Then("user verifies the title of the page is {string}")
    public void user_verifies_the_title_of_the_page_is(String string) {
        String actualResult=Driver.getDriver().getTitle();
        System.out.println("actualResult = " + actualResult);
        MatcherAssert.assertThat(actualResult,CoreMatchers.containsString(string));
    }
}
