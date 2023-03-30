// SHARVANI LEAD UPDATES - reports will be in the BELOW location
// C:\Users\DELL\eclipse-workspace\org.octtestingbatch.vas\reports
// Extends means that you are creating a subclass of the base class you are extending.
// basically it maps stepdefintion with feature file with same wording Given etc, if any duplicate of same step definiton it throwserror. 




import io.cucumber.testng.AbstractTestNGCucumberTests;//which is used to run the feature file scenarios
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="C:\\Users\\DELL\\eclipse-workspace\\org.octtestingbatch.vas\\src\\test\\resources\\Features\\ONE_Parabank1.feature",
glue="parabankpackage",
dryRun=true,   //  Dry-run is used to compile feature files and step definitions in cucumber. It is specially used in the stage when you will have to see if there are any compilation errors, to check that you can use dry-run. 
monochrome = true,
plugin = {"json:reports/jsonreport.json" ,"html:reports/cucumber-reports.html"}
)

public class THREE_Parabank_RUNNER extends AbstractTestNGCucumberTests
{


} 
