package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobject.UpsTrackingHomePage;

public class TestUpsTrackingHomePage extends CommonAPI {
    @Test
    public void testLogo(){
      UpsTrackingHomePage homePage = PageFactory.initElements(driver, UpsTrackingHomePage.class);
      homePage.gotoLogo();
      }
}

//    @Test
//    public void testsearchTracking(){
//        UpsTrackingHomePage homePage = PageFactory.initElements(driver, UpsTrackingHomePage.class);
//        homePage.gotosearchTracking();
//    }
////    @Test
////    public void testsearchShipping(){
////        UpsTrackingHomePage homePage = PageFactory.initElements(driver, UpsTrackingHomePage.class);
////        homePage.gotosearchShipping();
////    }
////    @Test
////    public void testsearchSearvices(){
////        UpsTrackingHomePage homePage = PageFactory.initElements(driver, UpsTrackingHomePage.class);
////        homePage.gotosearchServices();
////    }
////    @Test
////    public void testsearchButton(){
////        UpsTrackingHomePage homePage = PageFactory.initElements(driver, UpsTrackingHomePage.class);
////        homePage.gotosearchButton();
//    }
////}
//




