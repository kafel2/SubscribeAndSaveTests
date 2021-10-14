package pages.subscribeandsave;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtils;

public class SubscribeAndSaveMain extends TestUtils {

    public SubscribeAndSaveMain(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div[2]/div[4]/a")
    public WebElement startShopping;
}
