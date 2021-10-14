package pages.subscribeandsave;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtils;

import java.util.List;

public class BestSellers extends TestUtils {

    public BestSellers(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"anonCarousel2\"]/ol/li[1]")
    public WebElement firstRandomItem;


}
