package Demo_gradleProject;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "/lib/src/test/resources/feature/demo.feature"
,glue={"/lib/src/main/java/Stepdefinition/DemoSteps.java"},
tags="@demo"
)

public class TestRunner {
}