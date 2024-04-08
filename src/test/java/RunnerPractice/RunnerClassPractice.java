package RunnerPractice;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
features = "C:\\Users\\91798\\Desktop\\Selenium Testing\\CucumberTesting\\src\\test\\resources\\Practice1\\practice.feature",
glue= ("stepDefinitionPractice")
)


public class RunnerClassPractice extends AbstractTestNGCucumberTests{

}
