package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobject.HomePage;
import pageobject.MemberLogInPage;
import utility.GoogleSheetAPI;

import java.io.IOException;
import java.util.List;

public class TestMemberLogInPage extends CommonAPI {
    private String spreadsheetId = "1bi1UQB1dy55r48sKfazXRl10SpZXgCzoIQQ4PqrbnAI";
    private String range = "Sheet1!A2:B";
    @Test
    public void testMemberLogIn() throws IOException {
        GoogleSheetAPI sheetAPI = new GoogleSheetAPI();
        List<List<Object>> values = sheetAPI.getSpreadSheetRecords(spreadsheetId, range);

        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.goToMemberLogin();

        for (List<Object> row : values) {
            String username = row.get(0).toString();
            String password = row.get(1).toString();
            MemberLogInPage mlp = PageFactory.initElements(driver, MemberLogInPage.class);
            mlp.memberLogin(username,password);
        }
    }
//    @Test
//    public void testForgetPassword(){
//        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
//        homePage.goToMemberLogin();
//
//        MemberLogInPage mlp = PageFactory.initElements(driver, MemberLogInPage.class);
//        mlp.memberLogin();
//
//        mlp.forgetPassword();
//    }
}
