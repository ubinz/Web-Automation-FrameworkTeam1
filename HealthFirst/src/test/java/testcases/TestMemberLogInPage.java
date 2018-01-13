package testcases;


import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobject.HomePage;
import pageobject.MemberLogInPage;


public class TestMemberLogInPage extends CommonAPI {

    @Test
    public void testMemberLogIn(){

        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.goToMemberLogin();

        MemberLogInPage mlp = PageFactory.initElements(driver, MemberLogInPage.class);
        mlp.memberLogin();
    }

    @Test
    public void testForgetPassword(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.goToMemberLogin();

        MemberLogInPage mlp = PageFactory.initElements(driver, MemberLogInPage.class);
        mlp.memberLogin();

        mlp.forgetPassword();
    }
}
