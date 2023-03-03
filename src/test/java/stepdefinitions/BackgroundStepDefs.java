package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BeymenHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class BackgroundStepDefs {

    BeymenHomePage homePage = new BeymenHomePage();

    @Given("user goes to URL")
    public void userGoesToURL() {
        Driver.getDriver().get(ConfigReader.getProperty("beymen_url"));
    }

    @Then("verify the page title contains BEYMEN")
    public void verify_the_page_title_contains() {
        homePage.cookiesAcceptButton.click();
        homePage.closeButton.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Beymen"));
    }


}