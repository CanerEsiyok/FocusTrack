package com.blackstar.step_defs;

import com.blackstar.pages.GunvorPages;
import com.blackstar.utilities.Browser;
import com.blackstar.utilities.ConfigurationReader;
import com.blackstar.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GunvorGroup_stepDefs {

    GunvorPages gunvorPages=new GunvorPages();
    Actions actions=new Actions(Driver.getDriver());
    @Given("user is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlGunvor"));
    }
    @When("user hovers over {string}")
    public void user_hovers_over(String string) {

        actions.moveToElement(gunvorPages.header(string)).perform();
    }
    @When("user clicks {string}")
    public void user_clicks(String string) {
        gunvorPages.subheader(string).click();

    }
    @Then("user verifies that they are on the {string}")
    public void user_verifies_that_they_are_on_the(String string) throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

        try {
            wait.until(ExpectedConditions.visibilityOf(gunvorPages.cookies));
            gunvorPages.cookies.click();

        }catch (Exception e){

        }

        MatcherAssert.assertThat(gunvorPages.sortingForTheTitle(string).getText(), CoreMatchers.containsString(string));


    }



}
