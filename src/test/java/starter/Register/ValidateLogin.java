package starter.Register;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ValidateLogin extends PageObject {
    private By mailField(){
        return By.className("v-btn__content");
    }

    @Step
    public void validateOnTheLoginPage(){
        $(mailField()).isDisplayed();
    }
}
