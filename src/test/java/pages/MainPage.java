package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtils;

public class MainPage extends TestUtils {

    public MainPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement loginNavigationPanel;

    @FindBy(id = "nav-cart-text-container")
    public WebElement userCart;
}
