package starter.Homepage;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Homepage extends PageObject {

    private By iconTriangle(){
        return By.xpath("//div[@class='v-input__icon v-input__icon--append']");
    }
    private By buyButton(){
        return By.xpath("//button[@class= 'button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text']");
    }
    private By listCategory(){
        return By.xpath("//div[@class= 'v-list-item__content']");
    }

    @Step
    public void seeAllProduct(){
    };
    @Step
    public void seeCategoryProduct(){
        $(iconTriangle()).click();
    }
    @Step
    public void seeProductCategory(){
    };
    @Step
    public void clickBuyButton(){
        $(buyButton()).click();
    }
    @Step
    public void addItemToCart(){
    };
    @Step
    public void productByCategory(){
        $(listCategory()).click();
    }
}
