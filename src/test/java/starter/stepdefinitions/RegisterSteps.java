package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Register.Register;
import starter.Register.ValidateLogin;

public class RegisterSteps {
    @Steps
    Register register;
    @Steps
    ValidateLogin validateLogin;

    @Given("I am on the register page")
    public void onTheRegisterPage(){
        register.openUrl("https://alta-shop.vercel.app/auth/register");
    }
    @When("I input full name")
    public void inputFullName(){
        register.inputFullName("Shinta Dewi");
    }
    @And("I input email {string}")
    public void iInputEmail(String mail){
        register.inputMail(mail);
    }
    @And("I input password")
    public void iInputPassword(){
        register.inputPwd("shinta19");
    }
    @And("I click register button")
    public void clickRegisterButton(){
        register.clickButtonRegister();
    }
    @Then("I am direct on the login page")
    public void goOnTheLoginPage(){
        validateLogin.validateOnTheLoginPage();
    }
    @Then("I can see error message {string}")
    public void iCanSeeErrorMassage(String message) {
        register.validateErrorMessage();
        register.iValidateEqualErrorMessage(message);
    }
}
