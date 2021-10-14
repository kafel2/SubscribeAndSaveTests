package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.login.LoginPage;
import pages.MainPage;
import utils.TestUtils;
import utils.ConfigReader;

public class LoginSteps extends TestUtils {

    @When("user goes to a login page by clicking Sign-In")
    public void userGoesToALoginPage() {
        MainPage mainPage = new MainPage();
        click(mainPage.loginNavigationPanel);
    }

    @And("user enters valid e-mail or phone number")
    public void userEntersValidLogin() {
        LoginPage loginpage = new LoginPage();
        sendText(loginpage.emailInput, ConfigReader.getPropertyValue("username"));
    }

    @And("user clicks on Continue button")
    public void userClicksOnContinueButton() {
        LoginPage loginpage = new LoginPage();
        click(loginpage.continueButton);
    }

   @When("user enters correct password")
    public void userEnterCorrectPassword() {
       LoginPage loginpage = new LoginPage();
       sendText(loginpage.passwordInput, ConfigReader.getPropertyValue("password"));
    }

    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        LoginPage loginpage = new LoginPage();
        click(loginpage.signInButton);
    }

    @When("user is successfully logged in")
    public void userSuccessuflyLoggedIn() {
        MainPage mainPage = new MainPage();
        Assert.assertFalse(mainPage.loginNavigationPanel.getText().contains("Hello, Sign in"));
    }

    @When("user logged in the system")
    public void userLoggedInSystem() {
        userGoesToALoginPage();
        userEntersValidLogin();
        userClicksOnContinueButton();
        userEnterCorrectPassword();
        userClicksOnLoginButton();
    }
}
