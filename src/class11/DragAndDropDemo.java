package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        driver.manage().window().maximize();

        driver.switchTo().frame(0);
        WebElement a=driver.findElement(By.id("draggable"));
        WebElement b=driver.findElement(By.id("droppable"));

        Actions actions=new Actions(driver);
        Thread.sleep(2000);
        //actions.dragAndDrop(a,b).perform();

        actions.clickAndHold(a).moveToElement(b).release().build().perform();

        Thread.sleep(2000);
        driver.quit();

    }
}
