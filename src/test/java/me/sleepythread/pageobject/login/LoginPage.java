package me.sleepythread.pageobject.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by akashmishra on 19/09/2017.
 */
public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver){

        this.driver = driver;
    }

    public void open(){
        driver.get("https://www.splitwise.com");
    }

    public void fillLoginInfo(String userName, String password){
        WebDriverWait wait = new WebDriverWait(driver, 40000);
        final WebElement login_links = driver.findElement(By.className("login_links"));
        final WebElement loginLink = login_links.findElement(By.linkText("Log in"));
        loginLink.click();
        final WebElement userForm = driver.findElement(By.id("new_user_session"));
        final WebElement userEmail = userForm.findElement(By.id("user_session_email"));
        final WebElement userpassord = userForm.findElement(By.id("user_session_password"));
        final WebElement submit = userForm.findElement(By.name("commit"));

        System.out.println(userEmail.getAttribute("name"));
        userEmail.sendKeys(userName);
        userpassord.sendKeys(password);
        submit.submit();
    }

    public boolean isLoginSuccess(){
        final WebElement dashboardLink = driver.findElement(By.id("dashboard_link"));

        return dashboardLink.isDisplayed();
    }
}
