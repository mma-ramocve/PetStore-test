package tests;

import objects.Catalog;
import objects.Login;
import objects.Registration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objects.Home;

public class RegistrationTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();

        wd.get(Home.url);
        Home.clickEnterTheStore(wd);
        Catalog.clickSignIn(wd);
        Login.clickRegisterNow(wd);
        Registration.getUserId(wd);
    }
}