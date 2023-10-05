package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class AmazonDropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");

        WebElement categoryDD= driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(categoryDD);
        boolean isMultiple=select.isMultiple();
        System.out.println(isMultiple);
        select.selectByIndex(2);

        /*List<WebElement>  options=select.getOptions();
        for (WebElement option:options){
            String optionText=option.getText();
            System.out.println(optionText);
            if (optionText.equalsIgnoreCase("Books")){
                Thread.sleep(1000);
                option.click();
            }
        }*/

        List<WebElement> options=select.getOptions();
        System.out.println(options.size());
        Iterator<WebElement> it=options.iterator();
        while (it.hasNext()){
            WebElement element=it.next();
            System.out.println(element.getText());
        }

        driver.quit();
    }
}
