package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobject.HomePage;

public class TestHomePage extends CommonAPI{

    @Test
    public void testlogo(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.gotoHomepage();
    }

    @Test
    public void testsearching(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.searching();
    }

    @Test
    public void testtodaysdeals(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.gotoTodaysDeals();

    }
    @Test
    public void testgiftCards(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.gotoGiftCards();
    }
    @Test
    public void testRegistry(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.gotoRegistry();
    }
    @Test
    public void testSell(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.gotoSell();
    }
}
