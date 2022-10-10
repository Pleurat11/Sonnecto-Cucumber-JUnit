package com.sonnecto.step_definitions;

import com.sonnecto.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
    Similar to TestBase.java in TestNG framework.
        We open and close the browser here etc.
 */
public class Hooks {
    @Before
    public void setUp() {
    }

    @After
    //Scenario scenario : represents current running cucumber scenario
    public void tearDownScenario (Scenario scenario) {
        //cast WebDriver to TakesScreenshot interface
        //call getScreenShotAs method and output type as BYTES
        //save the result into byte[] array - byte [] image
        if (scenario.isFailed()) {
            byte[] image = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            //attach the image into the scenario html report: scenario.attach(image, "image/png", scenario.getName());
            scenario.attach(image, "image/png", scenario.getName());
        }
    }
}