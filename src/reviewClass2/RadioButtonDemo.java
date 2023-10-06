package reviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mui.com/material-ui/react-radio-button/");

        List<WebElement> radioButtons=driver.findElements(By.xpath("//input[@name='radio-buttons-group']"));
        System.out.println(radioButtons.size());

        // this code will click on all radio buttons
        for (WebElement radioButton: radioButtons){
            System.out.println("Before click "+radioButton.isSelected());
            radioButton.click();
            System.out.println("After click "+radioButton.isSelected());
            Thread.sleep(2000);
        }


        for (WebElement rBTN: radioButtons){
            String value=rBTN.getAttribute("value");
            System.out.println(value);

            if (value.equalsIgnoreCase("male")){
                rBTN.click();
            }else if (!rBTN.isEnabled()){
                System.out.println("the radio button is not enabled");
            }

        }
    }
}
