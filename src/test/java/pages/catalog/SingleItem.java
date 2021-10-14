package pages.catalog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtils;

public class SingleItem extends TestUtils {

    public SingleItem(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"snsAccordionRowMiddle\"]")
    public WebElement subscribeAndSaveProposal;

    @FindBy(xpath = "//*[@id=\"snsAccordionRowMiddle\"]")
    public WebElement subscribeAndSaveRadioBtn;

    @FindBy(id = "rcx-subscribe-submit-button-announce")
    public WebElement subscribeAndSaveSubmit;



}
