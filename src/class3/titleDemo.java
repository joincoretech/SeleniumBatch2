package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class titleDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dreamhiringacademy.com/");
        boolean text= driver.findElement(By.xpath("//h1[text()='Join Core Tech Human Resource Management System']"))
                .isDisplayed();

       if (text){
           System.out.println("the HRMS title is visible");
       }else {
           System.out.println("the tile is not visible");
       }
        driver.quit();
    }
}
