package class11;

import Utiles.CommonMethod;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HouseHoverDemo {

    public static void main(String[] args) {
        String url="https://amazon.com/";
        //openDriver(url);
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        WebElement accountListDD=driver.findElement(By.id("nav-link-accountList"));

        Actions action=new Actions(driver);
        action.moveToElement(accountListDD).perform();
    }
}
