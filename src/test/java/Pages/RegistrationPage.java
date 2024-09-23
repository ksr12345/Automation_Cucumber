package Pages;

import Utility.BrowserDriver;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {
    public static String userregistration_xpath = "/html/body/center/h1";
    public static String firstnameID="firstname";
    public static String lastnameId="lastname";
    public static String emailId="emailId";
    public static String contactNumberId="contactNumber";
    public static String usernameId="usr";
    public static String passwordID="pwd";
    public static String submitBtmXpath="//input[@value=\"Submit\"]";

    public static void userRegistration_text() throws InterruptedException{
        String text_register = driver.findElement(By.xpath(userregistration_xpath)).getText();
        assertEquals("User Registration Page", text_register);
    }

    public static void sendkeys_firstname(){
        driver.findElement(By.id(firstnameID)).sendKeys("Kau");
    }
    public static void sendkeys_lastname(){
        driver.findElement(By.id(lastnameId)).sendKeys("Raut");
    }
    public static void sendkeys_emailID(){
        driver.findElement(By.id(emailId)).sendKeys("example@gmail.com");
    }
    public static void sendkeys_contactNumber(){
        driver.findElement(By.id(contactNumberId)).sendKeys("1234567890");
    }
    public static void sendkeys_UsernameId(){
        driver.findElement(By.id(usernameId)).sendKeys("xx");
    }
    public static void sendkeys_PasswordID(){
        driver.findElement(By.id(passwordID)).sendKeys("xx");
    }
    public static void submit_Btm_click(){
        driver.findElement(By.xpath(submitBtmXpath)).click();
    }
    public static void validate_registration() {
        String registrationtext = driver.findElement(By.xpath("//body//center//h1")).getText();
        assertEquals("User Registered Successfully !!!", registrationtext);
    }
}
