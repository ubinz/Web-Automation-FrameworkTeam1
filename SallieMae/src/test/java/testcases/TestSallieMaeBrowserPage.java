package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobject.SallieMaeBrowserPage;
import utility.ReadExcelFile;

public class TestSallieMaeBrowserPage extends CommonAPI {
//
////    @Test
////    public void testLogo(){
////        SallieMaeBrowserPage browserPage = PageFactory.initElements(driver,SallieMaeBrowserPage.class);
////        browserPage.gotoLogo();
//
//    }
//    @Test
//    public void testSearchButton(){
//        SallieMaeBrowserPage browserPage = PageFactory.initElements(driver,SallieMaeBrowserPage.class);
//      browserPage.gotoSearchButton();
//      }
//      @Test
//      public void testStudentloans(){
//        SallieMaeBrowserPage browserPage = PageFactory.initElements(driver,SallieMaeBrowserPage.class);
//        browserPage.gotoStudentloans();
//    }
//    @Test
//     public void testCollegePlanning(){
//        SallieMaeBrowserPage browserPage = PageFactory.initElements(driver,SallieMaeBrowserPage.class);
//        browserPage.gotoCollegePlanning();
//    }
//    @Test
//    public void testSaveforcollege(){
//        SallieMaeBrowserPage browserPage = PageFactory.initElements(driver,SallieMaeBrowserPage.class);
//        browserPage.gotoSaveforcollage();
//    }
//        @Test void testBanking(){
//        SallieMaeBrowserPage browserPage = PageFactory.initElements(driver,SallieMaeBrowserPage.class);
//        browserPage.gotoBanking();
//        }
        @Test(dataProvider = "testdata")
        public void testloginButton(String username, String password)throws InterruptedException{
            SallieMaeBrowserPage browserPage = PageFactory.initElements(driver,SallieMaeBrowserPage.class);
            browserPage.login(username,password);
        }

        @DataProvider(name = "testdata")
        public Object[][] TestDataFeed(){
            ReadExcelFile config = new ReadExcelFile("../SallieMae/data/file.xls");
            int rows = config.getRowCount(0);
            Object[][] credentials = new Object[rows][2];
            for (int i = 0; i < rows; i++){
                for (int j = 0; j < 2; j++) {
                    credentials[i][j] = config.getData(0, i, j);
                    credentials[i][j] = config.getData(0, i, j);
                }
            }
            return credentials;
        }
}
