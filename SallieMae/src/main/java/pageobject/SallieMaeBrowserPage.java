package pageobject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class SallieMaeBrowserPage{

//    @FindBy(id = "#logo")
//    WebElement logo;

    @FindBy(css = "#search > a")
    WebElement searchButton;

    @FindBy(css = "#nav > ul > li:nth-child(2) > a.tier1.rootHrefOverride.sameheight_handled")
    WebElement searchStudentloans;

    @FindBy(css = "#nav > ul > li:nth-child(3) > a.tier1.sameheight_handled")
    WebElement searchCollegePlanning;

    @FindBy(css = "#nav > ul > li:nth-child(4) > a.tier1.sameheight_handled")
    WebElement searchSaveforcollage;

    @FindBy(xpath = "//*[@id=\"nav\"]/ul/li[5]/a[2]")
    WebElement searchBanking;

    @FindBy(css = "#login > div.content_close > a")
    WebElement loginButton;

    @FindBy(id = "UserIDMobile")
    WebElement usernamefield;

    @FindBy(id = "PasswordMobile")
    WebElement passwordfield;

    @FindBy(css = "#calmFormMobile > p.button.bg_blue > a")
    WebElement logintoloansBtn;

    //    public void gotoLogo(){
//      logo.click();
//    }
    public void gotoSearchButton() {
        searchButton.click();
    }
    public void gotoStudentloans(){
        searchStudentloans.click();
    }
    public void gotoCollegePlanning(){
        searchCollegePlanning.click();
    }
    public void gotoSaveforcollage(){
        searchSaveforcollage.click();
    }
    public void gotoBanking(){
        searchBanking.click();
    }
    public void login(String username, String password){
        loginButton.click();
        usernamefield.sendKeys(username);
        passwordfield.sendKeys(password);
        logintoloansBtn.click();
    }
}