package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class StaticTableDemo {
   static String url="https://grafana.com/docs/grafana/latest/datasources/testdata/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        List<WebElement> cloNames=driver.findElements(By.xpath("//table/thead/tr/th"));
        System.out.println(cloNames.size());
        for(WebElement col:cloNames){
            String cloText=col.getText();
            System.out.println(cloText);
        }


        List<WebElement> rowData=driver.findElements(By.xpath("//table/tbody/tr/td"));
        System.out.println(rowData.size());

        Iterator<WebElement> iterator=rowData.iterator();
        while (iterator.hasNext()){
            WebElement row=iterator.next();
            String rowText=row.getText();
            System.out.println(rowText);

            if (rowText.equals("Name")){
                System.out.println("name is visible");
            }else{
                System.out.println("name is not visible");
            }

        }
    }
}
