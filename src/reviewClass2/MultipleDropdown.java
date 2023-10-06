package reviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleDropdown {

    public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
        driver.findElement(By.linkText("Advanced Dropdown Menu")).click();
        WebElement multipleDD=driver.findElement(By.cssSelector("select[name='coffee2']"));
        Select select=new Select(multipleDD);

        boolean isMultiple= select.isMultiple();
        System.out.println(isMultiple);

        if (isMultiple){
            List<WebElement> options=select.getOptions();
            for (WebElement option:options){
                String optionText=option.getText();
                System.out.println(optionText);
               select.selectByVisibleText(optionText);
               Thread.sleep(2000);
            }
        }
        select.deselectAll();
      driver.close();
    }
}
