package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {
    private static String userName = "username";
    private static String newPassword = "//input[@name='password']";
    private static String repeatPassword = "//input[@name='repeatedPassword']";
    private static String firstName = "account.firstName";
    private static String lastName = "account.lastName";
    private static String email = "account.email";
    private static String phone = "account.phone";
    private static String address1 = "account.address1";
    private static String address2 = "account.address2";
    private static String city = "account.city";
    private static String state = "account.state";
    private static String zip = "account.zip";
    private static String country = "account.country";
    private static String language= "account.languagePreference";
    private static String favouriteCategory= "account.favouriteCategoryId";
    private static String listOption= "account.listOption";
    private static String bannerOption= "account.bannerOption";
    private static String saveAccount= "//input[@name='newAccount']";

    public static WebElement getUserId(WebDriver wd) {
        return wd.findElement(By.name(userName));
    }

    public static WebElement getnewPassword(WebDriver wd) {
        return wd.findElement(By.xpath(newPassword));
    }

    public static WebElement getrepeatPassword(WebDriver wd) {
        return wd.findElement(By.xpath(repeatPassword));
    }

    public static WebElement getFirstName(WebDriver wd) {
        return wd.findElement(By.name(firstName));
    }
    public static WebElement getLastName(WebDriver wd) {
        return wd.findElement(By.name(lastName));
    }
    public static WebElement getEmail(WebDriver wd) {
        return wd.findElement(By.name(email));
    }
    public static WebElement getPhone(WebDriver wd) {
        return wd.findElement(By.name(phone));
    }
    public static WebElement getAddress1(WebDriver wd) {
        return wd.findElement(By.name(address1));
    }
    public static WebElement getaddress2(WebDriver wd) {
        return wd.findElement(By.name(address2));
    }
    public static WebElement getCity(WebDriver wd) {
        return wd.findElement(By.name(city));
    }
    public static WebElement getState(WebDriver wd) {
        return wd.findElement(By.name(state));
    }
    public static WebElement getZip(WebDriver wd) {
        return wd.findElement(By.name(zip));
    }
    public static WebElement getCountry(WebDriver wd) {
        return wd.findElement(By.name(country));
    }
    public static WebElement getLanguage(WebDriver wd){
        return wd.findElement(By.name(language));
    }
    public static WebElement getFavouriteCategory(WebDriver wd){
        return wd.findElement(By.name(favouriteCategory));
    }
    public static WebElement getListOption(WebDriver wd){
        return wd.findElement(By.name(listOption));
    }
    public static WebElement getBannerOption(WebDriver wd){
        return  wd.findElement(By.name(bannerOption));
    }
    public static WebElement getSaveAccount(WebDriver wd){
        return wd.findElement(By.xpath(saveAccount));
    }



    public static void inputUserId(WebDriver wd, String id) {
        getUserId(wd).sendKeys(id);
    }

    public static void inputNewPassword(WebDriver wd, String password) {
        getnewPassword(wd).sendKeys(password);
    }

    public static void inputRepeatPassword(WebDriver wd, String repeatPassword) {
        getrepeatPassword(wd).sendKeys(repeatPassword);
    }

    public static void inputFirstName(WebDriver wd, String firstName) {
        getFirstName(wd).sendKeys(firstName);
    }
    public static void inputLastName(WebDriver wd, String lastName) {
        getLastName(wd).sendKeys(lastName);
    }
    public static void inputEmail(WebDriver wd, String email) {
        getEmail(wd).sendKeys(email);
    }
    public static void inputPhone(WebDriver wd, String phone) {
        getPhone(wd).sendKeys(phone);
    }
    public static void inputAddress1(WebDriver wd, String address1){
        getAddress1(wd).sendKeys(address1);
    }
    public static void inputAddress2(WebDriver wd, String address2){
        getaddress2(wd).sendKeys(address2);
    }
    public static void inputCity(WebDriver wd, String city){
        getCity(wd).sendKeys(city);
    }
    public static void inputState(WebDriver wd, String state){
        getState(wd).sendKeys(state);
    }
    public static void inputZip(WebDriver wd, String zip){
        getZip(wd).sendKeys(zip);
    }
    public static void inputCountry(WebDriver wd, String country){
        getCountry(wd).sendKeys(country);
    }
    public static void selectLanguage(WebDriver wd, String inputLanguage){
        Select language= new Select(getLanguage(wd));
        language.selectByVisibleText(inputLanguage);
    }
    public static void selectFavouriteCategory(WebDriver wd, String inputCategory){
        Select favCategory= new Select(getFavouriteCategory(wd));
        favCategory.selectByVisibleText(inputCategory);
    }
    public static void clickListOption(WebDriver wd){
        getListOption(wd).click();
    }
    public static void clickBannerOption(WebDriver wd){
        getBannerOption(wd).click();
    }
    public static void clickSaveAccount(WebDriver wd){
        getSaveAccount(wd).click();
    }

}