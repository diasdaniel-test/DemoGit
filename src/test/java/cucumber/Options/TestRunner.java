package cucumber.Options;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/placeValidations.feature",plugin ={"pretty","json:target/jsonReports/cucumber-report.json"},
glue= {"stepDefinations"})
public class TestRunner extends AbstractTestNGCucumberTests {
//tags= {"@DeletePlace"}  compile test verify
}
