package pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtils;

public class LoginPage extends TestUtils {

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "ap_email")
    public WebElement emailInput;

    @FindBy(id = "ap_password")
    public WebElement passwordInput;

    @FindBy(id = "continue")
    public WebElement continueButton;

    @FindBy(id = "signInSubmit")
    public WebElement signInButton;
}
