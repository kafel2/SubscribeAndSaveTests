package pages.homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtils;

public class HomePageNav extends TestUtils {

    public HomePageNav(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[6]/div[3]/div/div/ul/li[4]/span/a")
    public WebElement subscribeAndSaveLink;
}
