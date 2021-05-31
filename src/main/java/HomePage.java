import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage enterText() {

            By TextImputResearch2 = By.name("field-keywords");
            WebElement ZoneText = driver.findElement(TextImputResearch2);
            ZoneText.sendKeys("Nintendo Switch");
            return this;
    }

    public HomePage2 researchText() {

            By ClickResearchSelector = By.cssSelector("[value='Go']");
            WebElement ClickResearch = driver.findElement(ClickResearchSelector);
            ClickResearch.click();
            return new HomePage2(driver);
    }

}

