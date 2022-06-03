package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.LoginPage;
import util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginPageSteps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    
    @Given("Enes is on Home page")
    public void enesIsOnHomePage() {
        loginPage.checkLogoAppear();
    }

    @When("click {string} card in the top right")
    public void clickCardInTheTopRight(String arg0) {
        loginPage.clickLogin(arg0);
    }

    @Then("should see Login Page")
    public void shouldSeeLoginPage() {
        loginPage.assertLoginPageAppear();
    }

    @Given("Enes is on Login Page")
    public void enesIsOnLoginPage() {
        loginPage.assertLoginPageAppear();
    }

    @When("click {string} radio button")
    public void clickRadioButton(String arg0) {
        //seçili geliyor
    }

    @Then("should see {string} title")
    public void shouldSeeTitle(String arg0) {
        loginPage.checkEmailRadioButtonAppear(arg0);
    }

    @Then("should see {string} radio button")
    public void shouldSeeRadioButton(String arg0) {
        loginPage.checkPhoneRadioButtonAppear(arg0);
    }

    @Then("should see {string} text on Email")
    public void shouldSeeTextOnEmail(String arg0) {
        loginPage.checkEmailRadioButtonAppear(arg0);
    }

    @Then("should see {string} text on Password")
    public void shouldSeeTextOnPassword(String arg0) {
        loginPage.checkTextPasswordInput(arg0);
    }

    @Then("should see Show Password Icon")
    public void shouldSeeShowPasswordIcon() {
        loginPage.checkPasswordIconAppear();
    }

    @Then("should see {string} remember me")
    public void shouldSeeRememberMe(String arg0) {
        loginPage.checkRememberMeAppear();
    }

    @Then("should see {string} forgot password")
    public void shouldSeeForgotPassword(String arg0) {
        loginPage.checkForgotPasswordAppear();
    }

    @Then("should see Phone Text Box")
    public void shouldSeePhoneTextBox() {

    }

    @Then("should see {string} login button")
    public void shouldSeeLoginButton(String arg0) {
        loginPage.checkLoginButtonAppear();
    }

    @When("click login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("should see {string} Email Empty message")
    public void shouldSeeEmailEmptyMessage(String arg0) {
        loginPage.assertError(arg0);
    }

    @Then("should see {string} Password Empty message")
    public void shouldSeePasswordEmptyMessage(String arg0) {
        loginPage.assertError(arg0);
    }

    @When("type Email {string}, Password {string} and click login")
    public void typeEmailPasswordAndClickLogin(String arg0, String arg1) {
        loginPage.assertError(arg0);
    }

    @Then("should see {string} Login Error message")
    public void shouldSeeLoginErrorMessage(String arg0) {
        loginPage.assertError(arg0);
    }

    @Then("should see {string} Email False message")
    public void shouldSeeEmailFalseMessage(String arg0) {
        loginPage.assertError(arg0);
    }

    @When("type Email {string} and click login")
    public void typeEmailAndClickLogin(String arg0) {
        loginPage.typeEmail(arg0);
        loginPage.clickLogin();
    }

    @Then("should not see Email Empty message")
    public void shouldNotSeeEmailEmptyMessage() {
        loginPage.assertFalseError();
    }

    @When("type Email {string}")
    public void typeEmail(String arg0) {
        loginPage.typeEmail(arg0);
    }

    @When("type Password {string}")
    public void typePassword(String arg0) {
        loginPage.typePassword(arg0);
    }

    @Then("should not see Password Empty message")
    public void shouldNotSeePasswordEmptyMessage() {
        loginPage.assertFalseError();
    }
}
