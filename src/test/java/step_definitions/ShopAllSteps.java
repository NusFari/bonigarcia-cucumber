package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nusrat_utilities.ReadConfigFiles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import page_objects.NavigationBar;


public class ShopAllSteps {
    private static final Logger LOGGER=LogManager.getLogger(ShopAllSteps.class);
    WebDriver driver=Hooks.driver;


    @Given("^user is in Samsung home page$")
    public void userIsInSamsungHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("SamsungUrl"));
        LOGGER.info("Landed on the Samsung Home Page");
    }

    @And("^user navigate to Shop All page$")
    public void userIsNavigateToShopAllPage() {
        new NavigationBar(driver)
                .clickOnSearchIcon()
                .typeGalaxyS24("Galaxy s24")
                .clickingOnSearchButton()
                .validateShopAllPageIsLoaded("All");
        LOGGER.info("Navigated to Shop All Page");

    }

    @When("^user navigate to Galaxy s24 page$")
    public void user_navigate_to_galaxy_s24_page() {
        new NavigationBar(driver)
                .navigateToGalaxyS24()
                .watForPageToLoad("Galaxy s24 text")
                .clickOnNoTradeButton()
                .clickOnNoCoverageButton()
                .clickOnContinueButton()
                .validateGalaxyS24UnlockedIsLoaded("galaxy s24 Text");
        LOGGER.info("Navigated to Galaxy s24 Page");

    }
    @Then("^user navigate to check out page$")
    public void user_navigate_to_check_out_page() {
        new NavigationBar(driver)
                .navigateToGuestCheckout();
        LOGGER.info("Navigated to check out Page");

    }

}



