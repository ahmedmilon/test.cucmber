package Testrunnner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
              features = "src/test/java/test.feature",
              glue="test.script")
public class TestRunner{
}

