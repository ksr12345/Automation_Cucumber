package stepDefinition;

import io.cucumber.java.en.When;

import static Pages.LoginPage.*;

public class LoginPage {
    @When("User successfully enters the login details")
    public void user_successfully_enters_login_details() throws InterruptedException {
        sendKeys_Username();
        sendKeys_Password();
        click_login();
    }

    @When("User clicks on new Registration button")
    public void user_clicks_on_new_Registration_button() throws InterruptedException{
        click_register();
    }
}
