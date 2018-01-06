package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(css = "#nav-logo > a.nav-logo-link > span.nav-logo-base.nav-sprite")
    WebElement logo;

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"nav-search\"]/form/div[2]/div/input")
    WebElement  searchButton;

    @FindBy(css = "#nav-xshop > a:nth-child(3)")
    WebElement todaysDeals;

    @FindBy(css = "#nav-xshop > a:nth-child(4)")
    WebElement giftCards;

    @FindBy(css = "#nav-xshop > a:nth-child(5)")
    WebElement registry;

    public void gotoHomepage(){
        logo.click();
    }

    public void searching(){
        searchBox.sendKeys("pents");
        searchButton.click();
    }
    public  void gotoTodaysDeals(){
        todaysDeals.click();
    }
    public void gotoGiftCards(){
        giftCards.click();
    }
    public void gotoRegistry(){
        registry.click();
    }
}
