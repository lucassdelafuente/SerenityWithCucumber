import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.*;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features"
        ,glue={"stepDefinitions"}
)
public class testRunner extends AbstractTestNGCucumberTests {
}
