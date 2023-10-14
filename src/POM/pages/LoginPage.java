package POM.pages;

import Utiles.CommonMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethod {

    @FindBy(name = "name")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='Psw']")
    public WebElement password;

    @FindBy(css = "input.login")
    public WebElement loginBtn;

    public  LoginPage(){
        PageFactory.initElements(driver,this);
    }

}
