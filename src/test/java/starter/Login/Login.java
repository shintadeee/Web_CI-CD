package starter.Login;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Login extends PageObject {
    private By emailField(){
        return By.id("input-18");
    }
    private By passwordField(){
        return By.id("input-21");
    }
    private By loginButton(){
        return By.xpath("//button[@class= 'v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }
    private By messageError(){
        return By.xpath("//div[@class= 'v-alert__content']");
    }

    @Step
    public static OpenUrl url (String targetUrl){
        return new OpenUrl(targetUrl);
    }
    @Step
    public void validateOnTheLoginPage(){
        $(loginButton()).isDisplayed();
    }
    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }
    @Step
    public void enterPassword(String password){
        $(passwordField()).type(password);
    }
    @Step
    public void clickButtonLogin(){
        $(loginButton()).click();
    }
    @Step
    public void invalidEmail(String email){
        $(emailField()).type(email);
    }
    @Step
    public boolean validateMessageError(){
        return $(messageError()).isDisplayed();
    }
    @Step
    public boolean iValidateEqualMessageError(String message){
        return $(messageError()).getText().equalsIgnoreCase(message);
    }
}
