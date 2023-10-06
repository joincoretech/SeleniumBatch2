package reviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");

        driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
        driver.switchTo().frame(2);
        WebElement frameText=driver.findElement(By.xpath("//h5[text()='Nested iFrames']"));
        System.out.println(frameText.isDisplayed());
        driver.switchTo().defaultContent();
        driver.close();


    }
}
