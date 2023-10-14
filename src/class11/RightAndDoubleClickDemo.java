package class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClickDemo {

    public static void main(String[] args) {
        String url="http://demo.guru99.com/test/simple_context_menu.html";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement rightClickBtn=driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions actions=new Actions(driver);
        actions.contextClick(rightClickBtn).perform();

        WebElement editOption=driver.findElement(By.xpath("//span[text()='Edit']"));

        //editOption.click();
        actions.click(editOption).perform();

        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement doubleClickBtn=driver.findElement(By.xpath(
                "//button[contains(text(), 'Double-Click')]"));

        actions.doubleClick(doubleClickBtn).perform();
         alert=driver.switchTo().alert();

         System.out.println(alert.getText());
         alert.accept();

         driver.quit();
    }
}
