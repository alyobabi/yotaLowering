package yota.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private static final By SUBMIT = By.xpath("//button[contains(.,'Войти')]");
    private static final By E_MAIL = By.xpath("//input[@name=\"login\"]");
    private static final By PASSWORD = By.xpath("//input[@name=\"password\"]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public MainPage login() {
        WebElement elementEmail = driver.findElement(E_MAIL);
        clear(elementEmail);
        elementEmail.sendKeys("mail"); //TODO

        WebElement elementPass = driver.findElement(PASSWORD);
        clear(elementPass);
        elementPass.sendKeys("password"); //TODO

        click(SUBMIT);
        return new MainPage(driver);
    }

}
