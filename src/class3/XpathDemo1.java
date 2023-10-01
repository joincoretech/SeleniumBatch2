package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dreamhiringacademy.com/");
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("admin@gmail.com");
        driver.findElement(By.xpath("//input[@id='Psw']")).sendKeys("admin#123");
        driver.findElement(By.xpath("//input[@class='login']")).click();
        driver.close();

    }
}
