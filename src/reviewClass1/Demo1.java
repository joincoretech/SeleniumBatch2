package reviewClass1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://dreamhiringacademy.com/");
        String url= driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().window().maximize();
        String title= driver.getTitle();
        System.out.println(title);
        if (title.equals("Login Page - HRM")){
            System.out.println("title is matched");
        }else {
            System.out.println("title is not matched");
        }

     driver.close();
    }
}
