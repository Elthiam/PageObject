import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage2 {


    WebDriver driver;
    public HomePage2(WebDriver driver) {
        this.driver = driver;
    }

    public Homepage3 ChooseItem () {

        By NintendoSelector = By.cssSelector("[data-asin='B07WKNQ8JT']");
        driver.findElement(NintendoSelector).click();
        return new Homepage3(driver);

    }
}
