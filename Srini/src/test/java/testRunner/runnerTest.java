package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features",tags = "@test1", glue = {"stepDefinition"},
        plugin = {"pretty", "html:target/cucumber-report.html"})
public class runnerTest {

}
