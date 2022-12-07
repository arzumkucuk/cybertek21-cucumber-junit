package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "com/cybertek/step_definitions",
        dryRun = false // true yapmamizin nedeni pas mi fail mi gorururz baska bir sey ekranda gozukmez
        //tags = ""
)
public class CukesRunner {



}
