package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.Homepage.Homepage;

public class HomepageSteps {
    @Steps
    Homepage homepage;

    @Then("I can see all product")
    public void iSeeAllProduct(){
        homepage.seeAllProduct();
    }
    @And("I click icon triangle")
    public void clickIconTriangle(){
        homepage.seeCategoryProduct();
    }
    @Then("I can see category product")
    public void iSeeCategoryProduct(){
        homepage.seeProductCategory();
    }
    @And("I click buy button")
    public void iClickBuyButton(){ homepage.clickBuyButton();
    }
    @Then("I can add item to cart")
    public void canAddItemToCart(){
        homepage.addItemToCart();
    }
    @Then("I can see product by category")
    public void canSeeProductByCategory(){
        homepage.productByCategory();
    }
}