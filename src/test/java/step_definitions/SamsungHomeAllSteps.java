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
import page_objects.CheckOutForSmartBook;
import page_objects.NavigationBar;
import page_objects.SmartBookCover;


public class SamsungHomeAllSteps {
    private static final Logger LOGGER = LogManager.getLogger(SamsungHomeAllSteps.class);
    WebDriver driver = Hooks.driver;


    @Given("^user is in Samsung home page$")
    public void userIsInSamsungHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("SamsungUrl"));
        LOGGER.info("Landed on the Samsung Home Page");
    }

    @When("^user navigate to Shop All page$")
    public void userIsNavigateToShopAllPage() {
        new NavigationBar(driver)
                .clickOnSearchIcon()
                .typeGalaxyS24("Galaxy s24")
                .clickingOnSearchButton()
                .validateShopAllPageIsLoaded("All");
        LOGGER.info("Navigated to Shop All Page");

    }

    @And("^user navigate to Galaxy s24 page$")
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

    @When("^navigate To Shop All Offers page$")
    public void navigateToShopAllOffersPage() {
        new NavigationBar(driver)
                .mouseHoverToShop()
                .navigateToShopAllOfers()
                .validateShopAllOfersIsLoaded("Featured");
    }


    @Then("^user navigate to Galaxy Watch Page$")
    public void userNavigateToGalaxyWatchPage() {
        new NavigationBar(driver)
                .clickonserachItem()
                .typeGalaxywatchclassic("Galaxy watch classic")
                .searching()
                .validateGalaxyAllWatchPageIsLoaded("ALL");
    }

    @When("^navigate To Shop All Monitors$")
    public void navigateToShopAllMonitors() {
        new NavigationBar(driver)
                .mouseHoverToShoptext()
                .navigateToShopAAlMonitors()
                .validateShopAllOfersIsLoaded("Monitors, Memory & Storage");
    }

    @Then("^user navigate to 27OLEDG6G60SDQHD Gaming Monitor Page$")
    public void userNavigateTo27oledg6g60sdqhdGamingMonitorPage() {
        new NavigationBar(driver)
                .clickOnSearchBar()
                .type27OLEDG6G60SDQHDGamingMonitor("27 OLED G6 G60SD QHD Gaming Monitor")
                .clickonsearchbar()
                .validateShopMonitorIsLoaded("All");

    }

    @When("^user is navigate To Shop All Watches$")
    public void userIsNavigateToShopAllWatches() {
        new NavigationBar(driver)
                .mouseHoverToShoplink()
                .navigateToShopAllWatches()
                .validateShopAllWatchesIsLoaded("Watches & Audio");


    }

    @Then("^user is navigate to Galaxy Watch5 Pro Page$")
    public void userNavigateToGalaxyWatch5proPage() {

        new NavigationBar(driver)
                .clickonserachItem()
                .typeGalaxyWatch5Pro("Galaxy Watch5 Pro")
                .searches()
                .validateShopWatch5ProIsLoaded("ALL");

    }

    @When("^user is navigate To Accessories$")
    public void userIsNavigateToAccessories() {
        new NavigationBar(driver)
                .clickOnSearchIcon()
                .typeArtistRicardoCavoloInteractiveCardforGalaxyZFlip5("Artist Ricardo Cavolo Interactive Card for Galaxy Z Flip5")
                .clickingOnSearchBar()
                .validateFlipAllPageIsLoaded("Artist Ricardo Cavolo Interactive Card for Galaxy Z Flip5");

    }

    @Then("^user is navigate to Galaxy Tab S9 Series Page$")
    public void userIsNavigateToGalaxyTabS9SeriesPage() {
        new NavigationBar(driver)
                .clicksearch()
                .typeGalaxyTabS9Series("Galaxy Tab S9 Series")
                .serachingclicking()
                .validateShopGalaxyTabIsLoaded("Galaxy Tab S9 Series");


    }

    @When("^user is navigate To Galaxy Buds$")
    public void userIsNavigateToGalaxyBuds() {
        new NavigationBar(driver)
                .clickOnSearchIcon()
                .typeGalaxyBuds2ProBora("Galaxy Buds2 Pro Bora")
                .search()
                .validateShopAllPageIsLoaded("Galaxy Buds2 Pro Bora");

    }

    @Then("^user is navigate to Galaxy Buds pro$")
    public void userIsNavigateToGalaxyBudsPro() {
        new NavigationBar(driver)
                .navigateTOGalaxyBudsPro()
                .watForPageToLoad("Galaxy Buds2 Pro, Bora Purple");


    }

    @When("^user is navigate To Joguman Interactive Card for Galaxy S24 Ultra$")
    public void userIsNavigateToJogumanInteractiveCardForGalaxyS4Ultra() {
        new NavigationBar(driver)
                .clickOnSearchIcon()
                .typeJogumanInteractiveCardforGalaxyS24Ultra("Joguman Interactive Card for Galaxy S24 Ultra")
                .clickingOnSearch()
                .navigateToJogumanCardGalaxy();
    }

    @Then("user is navigate to Checkout For Joguman")
    public void user_is_navigate_to_checkout_for_joguman() {
        new NavigationBar(driver)
                .navigateTOCheckoutForJoguman();
    }

    @When("^user is navigate To eMusic Frame Dolby AtmosSmart Speaker$")
    public void user_is_navigate_to_e_music_frame_dolby_atmos_smart_speaker() {
        new NavigationBar(driver)
                .clickOnSearchIcon()
                .typeMusicFrameDolbyAtmosSmartSpeaker("Music Frame / Dolby Atmos / Smart Speaker")
                .clickonsearch()
                .validateShopAllPageIsLoaded("ALL");
    }

    @When("^user is navigate to Shop Music Frame$")
    public void userIsNavigateToShopMusicFrame() {
        new NavigationBar(driver)
                .navigateToShopMusicFrame()
                .watForPageToLoad("Music Frame / Dolby Atmos / Smart Speaker");
    }

    @Then("^user is navigate to Cart For Music Frame$")
    public void userIsNavigateToCartForMusicFrame() {
        new NavigationBar(driver)
                .navigateTOCartForMusicFrame();
    }
    @When("^user is navigate To Smart Book Cover For Galaxy Tab S9 Ultra Black$")
    public void userIsNavigateToSmartBookCoverForGalaxyTabS9UltraBlack() {
        new NavigationBar(driver)
                .clickOnSearchIcon()
                .typSmartBookCoverForGalaxyTabS9UltraBlack("Smart Book Cover for Galaxy Tab S9 Ultra, Black")
                .clickingOnSearchOption()
                .validateAllSmartBookIsLoaded("All");
    }
    @When("^user is navigate to Shop Smart Book$")
    public void userIsNavigateToShopSmartBook() {
        new SmartBookCover(driver)
                .navigateToShopSmartBook()
                .watForPageToLoad("Smart Book Cover for Galaxy Tab S9 / TabS9FE,Black");
    }
    @Then("^user is navigate to Checkout For Smart Book$")
    public void userIsNavigateToCheckoutForSmartBook() {
        new CheckOutForSmartBook(driver)
                .navigateTOCheckoutForSmartBook();

    }
    @When("^user is navigate To Tablest & Watches Page$")
    public void userIsNavigateToTablestWatchesPage() {
        new NavigationBar(driver)
                .mouseHoverToShopWord()
                .navigateToShopTablets()
                .validateShopallTabletsIsLoaded("Tablest & Watches");
    }

    @Then("^user is navigate to Galaxy Buds FE Page$")
    public void userIsNavigateToGalaxyBudsFePage() {
        new NavigationBar(driver)
                .clickonserachItem()
                .typeGalaxyBudsFE("Galaxy Buds FE")
                .serachingclick()
                .validateBudsFEPageIsLoaded("ALL");
    }
    }
















