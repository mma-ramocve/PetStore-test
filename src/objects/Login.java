package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    private static String registerNowXPath="//a[contains(text(),'Register Now!')]";
    private static String usernameName= "username";
    private static String passwordXPath= "//input[@name='password']";
    private static String loginXPath= "//input[@name='signon']";


    public static WebElement getRegisterNow(WebDriver wd){
        return wd.findElement(By.xpath(registerNowXPath));
    }
    public static WebElement getUsername(WebDriver wd){
        return wd.findElement(By.name(usernameName));
    }
    public static WebElement getPassword(WebDriver wd){
        return wd.findElement(By.xpath(passwordXPath));
    }
    public static WebElement getLogin(WebDriver wd){
        return wd.findElement(By.xpath(loginXPath));
    }




    public static void clickRegisterNow(WebDriver wd){
        getRegisterNow(wd).click();
    }
    public static void inputUsername(WebDriver wd, String username){
        getUsername(wd).sendKeys(username);
    }
    public static void inputPassword(WebDriver wd, String password){
        getPassword(wd).sendKeys(Keys.CONTROL+"a");
        getPassword(wd).sendKeys(Keys.DELETE);
        getPassword(wd).sendKeys(password);
    }
    public static void clickLogin(WebDriver wd){
        getLogin(wd).click();
    }
}
