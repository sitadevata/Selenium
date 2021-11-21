package SpreeTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningBroswer {

    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","src/SpreeTesting/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://spree-vapasi-prod.herokuapp.com/");
       // WebElement logoElement = driver.findElement(By.id("logo"));
       // logoElement.click();
       // WebElement dropbox = driver.findElement(By.id("taxon"));
        //dropbox.click();
        //WebElement searchBox = driver.findElement(By.id("keywords"));
        //searchBox.click();
        WebElement Login = driver.findElement(By.xpath("//*[@id=\"home-page\"]"));
       // Login.click();
        //searchBox.
    }
}
