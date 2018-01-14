package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpsTrackingHomePage {
    @FindBy(css = "#ups-header_logo")
    WebElement logo;

//    @FindBy(xpath = "//*[@id=\"ups-menuLinks0\"]")
//    WebElement searchTracking;

    //    @FindBy(css = "#ups-menuLinks1")
//    WebElement searchShipping;
//
//    @FindBy(css = "#ups-menuLinks2")
//    WebElement searchSearvices;
//
//    @FindBy(css = "#ups-mainNav_search_submit > i")
//    WebElement searchButton;
//
    public void gotoLogo() {
        logo.click();
    }
//    public void gotosearchTracking() {
//        searchTracking.click();
//    }
//}
//    }
//    public void gotosearchShipping(){
//        searchShipping.click();
//    }
//    public void gotosearchServices(){
//        searchSearvices.click();
//    }
//    public void gotosearchButton(){
//        searchButton.click();
    }
//}
