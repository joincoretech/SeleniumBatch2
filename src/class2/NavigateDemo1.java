package class2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateDemo1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://www.facebook.com";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.navigate().back();// this method will move one step back
        Thread.sleep(2000);
        driver.navigate().forward();// this method will move one step forward
        Thread.sleep(2000);
        driver.navigate().refresh();// reload the page
        driver.close();// this method will close only one tab
       // driver.quit();// close all tabs

    }
}
