package yota;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import yota.pages.LoginPage;
import yota.pages.MainPage;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\YOURPATH\chromedriver.exe"); //TODO
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://my.yota.ru/selfcare/login");
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.login();
        Thread.sleep(5000);
        mainPage.lowerSpeed();
    }
}
