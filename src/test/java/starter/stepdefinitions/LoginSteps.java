package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Login.Home;
import starter.Login.Login;

public class LoginSteps {
    @Steps
    Login login;
    @Steps
    Home home;
    @Given("I am on the login page")
    public void onTheLoginPage(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.validateOnTheLoginPage();
    }
    @When("I enter email {string}")
    public void enterEmail(String email){
        login.inputEmail(email);
    }
    @And("I enter password")
    public void enterPassword(){
        login.enterPassword("shinta19");
    }
    @And("I click login button")
    public void doClickLoginButton(){
        login.clickButtonLogin();
    }
    @Then("I am on the home page")
    public void onTheHomePage(){
        home.validateOnTheHomePage();
    }
    @When("I enter invalid email {string}")
    public void enterInvalidEmail(String email){
        login.invalidEmail(email);
    }
    @Then("I see error message {string}")
    public void iSeeErrorMessage(String message){
        login.validateMessageError();
        login.iValidateEqualMessageError(message);
    }

}
