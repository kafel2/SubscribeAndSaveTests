package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPage;
import pages.cart.CartMain;
import pages.catalog.SingleItem;
import pages.homepage.HomePageNav;
import pages.subscribeandsave.BestSellers;
import pages.subscribeandsave.SubscribeAndSaveMain;
import utils.TestUtils;

public class SubscribeAndSaveBestSellersSteps extends TestUtils {

    @When("user goes to catalog and chooses some product")
    public void userLoggedInSystem() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.loginNavigationPanel.click();

        HomePageNav homePageNav = new HomePageNav();
        homePageNav.subscribeAndSaveLink.click();

        SubscribeAndSaveMain subscribeAndSaveMain = new SubscribeAndSaveMain();
        subscribeAndSaveMain.startShopping.click();

        BestSellers bestSellers = new BestSellers();
        bestSellers.firstRandomItem.click(); //click at first random item in catalog
    }

    @Then("subscription is available in a price section")
    public void subscriptionIsAvailableInAPriceSection() {
        SingleItem singleItem = new SingleItem();
        Assert.assertTrue(singleItem.subscribeAndSaveProposal.isEnabled());
    }

    @Then("user clicks on subscribe and save in a price section")
    public void userClicksOnSubscribeAndSaveInAPriceSection() {
        SingleItem singleItem = new SingleItem();
        singleItem.subscribeAndSaveRadioBtn.click();
    }

    @And("user clicks on set up now")
    public void userClicksOnSetUpNow() {
        SingleItem singleItem = new SingleItem();
        singleItem.subscribeAndSaveSubmit.click();
    }

    @And("user goes to cart")
    public void userGoesToCart() {
        MainPage mainPage = new MainPage();
        mainPage.userCart.click();
    }

    @And("qty of ordered product is correct")
    public void qtyOfOrderedProductIsCorrect() {
        CartMain cart = new CartMain();
        Assert.assertEquals("1", cart.singleItemQty.getText());
    }

    @And("delivery frequency is correct")
    public void deliveryFrequencyIsCorrect() {
        CartMain cart = new CartMain();
        Assert.assertTrue(cart.deliveryFrequency.getText().contains("5 months"));
    }
}
