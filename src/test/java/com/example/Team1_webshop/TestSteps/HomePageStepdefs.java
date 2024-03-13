package com.example.Team1_webshop.TestSteps;

import com.example.Team1_webshop.Pages.HomePage;
import com.example.Team1_webshop.utilities.ConfigurationReader;
import com.example.Team1_webshop.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import static com.example.Team1_webshop.utilities.Driver.getDriver;


public class HomePageStepdefs {
    HomePage homePage=new HomePage();

    @When("the user navigates to valid url")
    public void theUserNavigatesToValidUrl() {
        getDriver().get(ConfigurationReader.getProperty("google_url"));
    }

    @Then("the page title should be Webbutiken")
    public void thePageTitleShouldBeWebbutiken() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"Webbutiken");
    }
}
