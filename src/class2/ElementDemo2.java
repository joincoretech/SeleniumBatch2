package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://dreamhiringacademy.com/");
        driver.findElement(By.name("name")).sendKeys("admin@gmail.com");
        driver.findElement(By.id("Psw")).sendKeys("admin#123");
        driver.findElement(By.className("login")).click();
        System.out.println("user logged in successfully");
        driver.quit();
    }
}
