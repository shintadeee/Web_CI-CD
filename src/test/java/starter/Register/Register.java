package starter.Register;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Register extends PageObject {
    private By fullNameField(){
        return By.id("input-18");
    }
    private By mailField(){
        return By.id("input-21");
    }
    private By pwdField(){
        return By.id("input-24");
    }
    private By registerButton(){
        return By.xpath("//button[@class= 'v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }
    private By errorMessage(){
        return By.xpath("//div[@class= 'v-alert__content']");
    }

    @Step
    public void inputFullName(String fullname){
        $(fullNameField()).type(fullname);
    }
    @Step
    public void inputMail(String mail){
        $(mailField()).type(mail);
    }
    @Step
    public void inputPwd(String pwd){
        $(pwdField()).type(pwd);
    }
    @Step
    public void clickButtonRegister(){
        $(registerButton()).click();
    }
    @Step
    public boolean validateErrorMessage(){
        return $(errorMessage()).isDisplayed();
    }
    @Step
    public boolean iValidateEqualErrorMessage(String message){
        return $(errorMessage()).getText().equalsIgnoreCase(message);
    }
}