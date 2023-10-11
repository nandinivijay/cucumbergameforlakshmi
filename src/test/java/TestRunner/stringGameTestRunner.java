package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
features = "src/test/java/Features"// path for feature file
,glue= {"StepDef"}, monochrome=true,plugin = { "rerun:target/rerun.txt"})
public class stringGameTestRunner {

}
