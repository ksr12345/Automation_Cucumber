package Pages;

import Utility.BrowserDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BrowserDriver {

    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String signin_link_path = "//*[@id=\"menu\"]/a[2]/li";
    public static String Online_Product_path = "//*[@id=\"menu\"]/a[3]/li";


    public static void click_hamburger_menu() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void click_signin_link() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(signin_link_path)).click();
    }

    public static void click_Online_Products_link() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(Online_Product_path)).click();
    }
}
