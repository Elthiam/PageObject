import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage3 {

    WebDriver driver;
    public Homepage3(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verificationItem() {

        By ResultSelector = By.id("title_feature_div");
        WebElement Result = driver.findElement(ResultSelector);
        String resultat = "Nintendo Switch avec paire de Joy-Con Rouge Néon et Bleu Néon";
        return Result.getText().equals(resultat);
    }
}
