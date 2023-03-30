

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TWO_ParaBank_StepdefinitionParabank {

public WebDriver driver;

@Given("user is navigating to the parabank url")
public void user_is_navigation_to_the_parabank_url()
{
WebDriverManager.edgedriver().setup();
driver = new EdgeDriver();
driver.get("https://parabank.parasoft.com/parabank/index.htm");
driver.manage().window().maximize();
System.out.println("ParaBank homepage is launched successfully");
}

@When("username and password are entered")
public void username_password_are_entered()
{
driver.findElement(By.name("username")).sendKeys("raja123");
driver.findElement(By.name("password")).sendKeys("raja123");
System.out.println("Valid username and passwrod entered");
}

@And("click on login button")
public void click_on_login_button()
{
//driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
driver.findElement(By.xpath("//input[@type='submit']")).click();
System.out.println("Click on login button");
}

@Then("display the user home page")
public void display_the_uer_home_page()
{
boolean status = driver.findElement(By.partialLinkText("New Account")).isDisplayed();
if(status)
{
System.out.println("user home page is displayed");
}

}

@And("close the application")
public void close_the_application()
{
driver.close();
System.out.println("application is closed");
}

@When("invalid username and password are entered")
public void invalid_username_and_password_are_entered()
{
driver.findElement(By.name("username")).sendKeys("nxtgendemo");
driver.findElement(By.name("password")).sendKeys("");
System.out.println("Valid username and invalid passwrod entered");
}

@Then("unable to login")
public void unable_to_login()
{
WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
System.out.println("Login failed. Error message is " + errorMsg.getText());
}
}