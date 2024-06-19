package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SmartBookCover extends NavigationBar {

private final By SmartBookText =By.xpath("//div[1]/h1[contains(text(),'Cover for Galaxy Tab S9 / Tab S9 FE, Black')]");

    private static final Logger LOGGER = LogManager.getLogger(SmartBookCover.class);

    public SmartBookCover(WebDriver driver) {
        super(driver);
    }

    public SmartBookCover watForPageToLoad(String expectedResults) {
        LOGGER.debug("validating actual results is:" + expectedResults);
        ActOn.wait(driver,SmartBookText).waitForElementToBeVisible();
        //String actualResults=ActOn.element(driver,GalaxyS4text).getTextValue();
        //Assert.assertEquals(actualResults,expectedResults,"Expected results is failed to match");
        return this;

    }
}
