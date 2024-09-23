package Pages;

import Utility.BrowserDriver;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class LoggedInPage extends BrowserDriver {
    public static String category_formalShoes = "//*[text()='Formal Shoes']";
    public static String category_sportsShoes = "//*[text()='Sports']";
    public static String category_sneakers = "//*[text()='Sneakers']";

    public static void visibility_product_category_formal_shoes() throws InterruptedException{
        String product_fs = driver.findElement(By.xpath(category_formalShoes)).getText();
        assertEquals("Formal Shoes", product_fs);
    }

    public static void visibility_product_category_sports_shoes() throws InterruptedException{
        String product_ss = driver.findElement(By.xpath(category_sportsShoes)).getText();
        assertEquals("Sports", product_ss);
    }

    public static void visibility_product_category_sneaker_shoes() throws InterruptedException{
        String product_s = driver.findElement(By.xpath(category_sneakers)).getText();
        assertEquals("Sneakers", product_s);
    }
}
