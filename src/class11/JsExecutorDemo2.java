package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorDemo2 {

    public static void main(String[] args) {
         String url="http://google.com";
         System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.open();");

        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("help");



    }
}
