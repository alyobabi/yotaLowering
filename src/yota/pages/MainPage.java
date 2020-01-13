package yota.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

//    private static final By PIMPA = By.xpath("//div[@class=\"pimpa\"]");
//    private static final By MIN_SPEED = By.xpath("//a[@style=\"left: 5.83333%;\"]");
    private static final By MINUS = By.xpath("//div[@class=\"decrease\"]//a[@class=\"icon\"]");
    private static final By PLUS = By.xpath("//div[@class=\"increase\"]//a[@class=\"icon\"]");
    private static final By BTN_OK = By.xpath("//a[contains(.,\"Подключить\")][@class=\"btn\"]");

    public void lowerSpeed() {
        WebElement minus = driver.findElement(MINUS);
        WebElement plus = driver.findElement(PLUS);
        int max = 22;
        while (max > 0) {
            minus.click();
            max--;
        }
        plus.click();
        WebElement ok = driver.findElement(BTN_OK);
        ok.click();
    }
}
