package reviewClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       driver.navigate().to("https://amazon.com");
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.navigate().back();
        Thread.sleep(2000);
       driver.navigate().forward();
       driver.close();
    }
}
