package SpreeTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.security.spec.NamedParameterSpec;

public class FindingElements {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "src/SpreeTesting/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://spree-vapasi-prod.herokuapp.com/login");
        driver.findElement(By.id("spree_user_email")).sendKeys("sita2.devata@test.com");
        driver.findElement(By.name("spree_user[password]")).sendKeys( "Daddy@12345678");
        // driver.findElement(By.cssSelector("input[name=\"spree_user[password_confirmation]\"]")).sendKeys( "Daddy@12345678");
        driver.findElement(By.cssSelector("input[type=\"checkbox\"]")).click();
        driver.findElement(By.name("commit")).click();

        WebElement dropdown = driver.findElement(By.id("taxon"));
        Select Select = new Select(dropdown);
        Select.selectByValue("1");

        //driver.findElement(By.cssSelector("span[title='Ruby.on.Rails.Bag']")).click();
        //driver.findElement(By.name("quantity")).sendKeys("1");
        //driver.findElement(By.xpath("[@id="keywords"]"));
        driver.findElement(By.cssSelector("input.btn.btn-lg.btn-success.btn-block")).click();
        //driver.findElement(By.cssSelector(["spree_user[password_confirmation"])).sendKeys(..CharSequences:"Daddy@");
    }
}