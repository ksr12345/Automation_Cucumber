package Pages;

import Utility.BrowserDriver;
import org.openqa.selenium.By;

public class LoginPage extends BrowserDriver {
    public static String user_name_id = "usr";
    public static String password_id = "pwd";
    public static String login_btn_xpath = "//*[@id=\"second_form\"]/input";
    public static String newRegister_Btn_id = "NewRegistration";

    public static void sendKeys_Username() throws InterruptedException{
        driver.findElement(By.id(user_name_id)).sendKeys("ksr123");
    }

    public static void sendKeys_Password() throws InterruptedException{
        driver.findElement(By.id(password_id)).sendKeys("Test@123");
    }

    public static void click_login() throws InterruptedException{
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }

    public static void click_register() throws InterruptedException{
        driver.findElement(By.id(newRegister_Btn_id)).click();
    }
}
