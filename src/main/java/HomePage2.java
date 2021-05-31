import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage2 {


    WebDriver driver;
    public HomePage2(WebDriver driver) {
        this.driver = driver;
    }

    public Homepage3 ChooseItem () {

       // By NintendoSelector = By.cssSelector("[data-asin='B07WKNQ8JT']");

        By NintendoSelector = By.cssSelector(".s-image");

        List<WebElement> l =driver.findElements(NintendoSelector); //Fouad
        l.get(0).click();

       // driver.findElement(NintendoSelector).click();
        return new Homepage3(driver);

    }
}
