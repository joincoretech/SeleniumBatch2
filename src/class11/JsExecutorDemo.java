package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorDemo {

    public static void main(String[] args) throws InterruptedException {
        String url="https://amazon.com/";
        //openDriver(url);
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        JavascriptExecutor js=(JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,800)");

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-800)");


        Thread.sleep(2000);

        WebElement backToTop=driver.findElement(By.id("navBackToTop"));
        js.executeScript("arguments[0].scrollIntoView(true)", backToTop);

        Thread.sleep(2000);
        js.executeScript("arguments[0].click();", backToTop);

        driver.quit();
    }
}
