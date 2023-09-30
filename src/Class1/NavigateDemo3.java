package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateDemo3 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://facebook.com");
        driver.manage().window().maximize();
        driver.navigate().back();
        driver.navigate().forward();
    }
}
