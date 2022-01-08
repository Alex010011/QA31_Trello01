package teststrello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login {

    WebDriver wd;

    @BeforeMethod
    public void preConditions(){

        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com");

    }

    @Test
    public void loginTest1() throws InterruptedException {

        WebElement signup = wd.findElement(By.cssSelector("[href='/login']"));
        signup.click();

        Thread.sleep(5000);

        WebElement email = wd.findElement(By.cssSelector("#user"));
        type(email, "bunkof3@yandex.ru");

        WebElement login = wd.findElement(By.cssSelector("#login"));
        login.click();
        Thread.sleep(5000);
        WebElement pass = wd.findElement(By.cssSelector("#password"));
        type(pass, "Ryz-s4t-jkb-2t9");



        WebElement loginSubmit=wd.findElement(By.cssSelector("#login-submit"));
        loginSubmit.click();

        Thread.sleep(5000);
    }

    public void type(WebElement email, String myEmail) {
        email.click();
        email.clear();
        email.sendKeys(myEmail);
    }
}
