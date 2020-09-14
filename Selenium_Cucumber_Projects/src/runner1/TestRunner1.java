package runner1;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="BDDFeature",glue={"BDDTest"})
public class TestRunner1 {

}
