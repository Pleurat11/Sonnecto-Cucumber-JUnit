package com.sonnecto.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt", // store failed scenarios in return.txt file.
                "json:target/cucumber.json" // generate json execution report to be used for html report
        },
        features = "src/test/resources/features",
        glue = "com/sonnecto/step_definitions",
        dryRun = false,
        tags = "@whm"
)


public class CukesRunner {
}
