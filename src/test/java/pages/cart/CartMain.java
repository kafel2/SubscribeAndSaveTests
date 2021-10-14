package pages.cart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtils;

public class CartMain extends TestUtils {

    public CartMain(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "select-all")
    public WebElement selectAllItems;

    @FindBy(id = "deselect-all")
    public WebElement deselectAllItems;

    @FindBy(xpath = "//input[@name='delete']")
    public WebElement deleteAllItems;

    @FindBy(className = "a-dropdown-prompt")
    public WebElement singleItemQty;

    @FindBy(id = "sns-dp-recurrence-period-trigger")
    public WebElement deliveryFrequency;

}
