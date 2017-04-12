package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObjects;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

/**
 * Created by rahul.kulkarni on 04/04/2017.
 */


@DefaultUrl("https://www.etsy.com/uk/signin?from_page=https%3A%2F%2Fwww.etsy.com%2Fyour%2Fshops%2FJeenJewels%2Ftools%2Flistings%2Fcreate%3Fref%3Dseller_platform_hdr")
public class LoginPage extends PageObject{

    @FindBy(id = "username-existing")
    WebElement txt_userName;

    @FindBy(id="password-existing")
    WebElement txt_password;

    @FindBy(id="signin_button")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public void login() throws InterruptedException {
        txt_userName.sendKeys("test@test.com");
        txt_password.sendKeys("Jaimatadi0012345234523454");
        loginButton.click();
        Thread.sleep(6000);
        waitForTitleToAppear("Your Shop - Items");
        //waitFor(titleContains("Shop"));
        //waitFor(titleContains("Items"));

    }


}
