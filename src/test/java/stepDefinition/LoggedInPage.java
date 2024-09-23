package stepDefinition;

import io.cucumber.java.en.Then;

import static Pages.LoggedInPage.*;


public class LoggedInPage {
    @Then("User should be able to view the product category page")
    public void user_should_be_to_view_the_product_category_page() throws InterruptedException {
        visibility_product_category_formal_shoes();
        visibility_product_category_sports_shoes();
        visibility_product_category_sneaker_shoes();
    }
}
