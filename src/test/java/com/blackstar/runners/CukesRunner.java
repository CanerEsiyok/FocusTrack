package com.blackstar.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json",
                "junit:target/junit/junit-report.xml",


        },
        glue = "com/blackstar/step_defs",
        features = "src/test/resources/features",
      // dryRun = true,
        tags = "@wip",
        publish = true
)
public class CukesRunner {

}
