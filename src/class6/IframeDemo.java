package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();

        // switch to iframe by index
        driver.switchTo().frame(1);
        WebElement textBox=driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
        textBox.sendKeys("Batch2 students are the best");

        // this method will take us out from iframe to main page
        driver.switchTo().defaultContent();

        // switch to iframe by name or id value
        driver.switchTo().frame("SingleFrame");
        textBox.clear();
        Thread.sleep(2000);
        textBox.sendKeys("this is new text");

        driver.switchTo().defaultContent();


        WebElement iframeElement=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));

        driver.switchTo().frame(iframeElement);
        textBox.clear();
        textBox.sendKeys("this is iframeElement");






    }
}
