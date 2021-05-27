import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageObecjtProject {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void OpenChrome() {

        driver.get("https://www.amazon.fr/");
        driver.manage().window().maximize();

        //ACCEPTER LES COOKIES UNE BONNE FOIS SUR TOUTES LES PAGES
        String AcceptCookiesID ="sp-cc-accept";
        WebElement AcceptCookies = driver.findElement(By.id(AcceptCookiesID));
        AcceptCookies.click();

    }

    @AfterMethod
    public void CloseChrome() {
        //driver.quit();
    }


    @Test
    public void Etape1 () {

        //ARRANGE

        //ACT
        HomePage amazonHomePage = new HomePage(driver);
                amazonHomePage.enterText().researchText();

        HomePage2 amazonHomePage2 = new HomePage2(driver);
                amazonHomePage2.ChooseItem();
        Homepage3 amazonhomePage3 = new Homepage3(driver);
                amazonhomePage3.verificationItem();



        //ASSERT
        //Assert.assertTrue(Result.getText().contains("Nintendo Switch"));

    }

}
