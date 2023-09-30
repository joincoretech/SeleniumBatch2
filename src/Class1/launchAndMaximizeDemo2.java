package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchAndMaximizeDemo2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

    }
}
