package stepDefinition;

import io.cucumber.java.en.Then;

import static Pages.RegistrationPage.*;

public class RegistrationPage {
    @Then("User should be able to view the Registration page")
    public void user_should_be_able_to_view_the_Registration_page() throws InterruptedException{
        userRegistration_text();
        sendkeys_firstname();
        sendkeys_lastname();
        sendkeys_emailID();
        sendkeys_contactNumber();
        sendkeys_UsernameId();
        sendkeys_PasswordID();
        submit_Btm_click();
        validate_registration();
    }
}
