package com.faisal.appviews;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class AccountsView extends BaseView {

    List<String> defaultAccounts;

    //Resource className
    String textViewClassName = "android.widget.TextView";

    //Resource ID
    String searchId = "org.gnucash.android:id/menu_search";
    String searchTextId = "org.gnucash.android:id/search_src_text";
    String primaryTextId = "org.gnucash.android:id/primary_text";
    String accountNameTextId = "org.gnucash.android:id/input_account_name";
    String accountDescriptionTextId = "org.gnucash.android:id/input_account_description";
    String newAccountSave = "org.gnucash.android:id/menu_save";
    String addAccountButton = "org.gnucash.android:id/fab_create_account";
    String titleId = "android:id/text1";

    //Resource class

    //Resource xPath
    String xPathAccounts = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView";
    String xPathAssets = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout";
    String xPathEquity = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]";
    String xPathExpenses = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]";
    String xPathIncome = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]";
    String xPathLiabilities = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[5]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]";
    String xPathRecent = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.TextView";
    String xPathAll="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.TextView";
    String xPathFavorites = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]/android.widget.TextView";
    String xPathincomeBalanceAccountHome = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.RelativeLayout/android.widget.TextView";

    //Resource name
    String packageName = "org.gnucash.android";


    public AccountsView(AndroidDriver driver) {
        super(driver);
        defaultAccounts = new ArrayList<String>();
        defaultAccounts.add("Assets");
        defaultAccounts.add("Equity");
        defaultAccounts.add("Expenses");
        defaultAccounts.add("Income");
        defaultAccounts.add("Liabilities");
    }



    // check if the title mentions "Accounts"
    public boolean isDisplayedAccountsTitle(){
        return isElementPresent(By.xpath(xPathAccounts));

    }

    //check if all default accounts are loaded in the view
    public boolean verifyDefaultAccounts(){

        final int finalCount=5;
        int count = 0;

        List<WebElement> listOfAccounts = waitAndFindElements(By.className("android.widget.TextView"));

        for(String defaultAccount:defaultAccounts){

            System.out.println("Checking for: " + defaultAccount);

            for(WebElement elementAccount:listOfAccounts){
                if(elementAccount.getText().equals(defaultAccount)){
                    System.out.println("FOUND MATCH on Account name: "+elementAccount.getText());
                    ++count;
                }
            }
        }
        if(count==finalCount)
            return true;
        else
            return false;

    }

    public boolean isAppLaunched(){
        return packageName.equals(getCurrentPackage());
    }

    public void searchAccount(String searchAccountName){
        waitAndClick(By.id(searchId));
        sendText(By.id(searchTextId),(searchAccountName));

    }

    public boolean isSearchAccurate(String searchAccountName){

        hideKeyboard();

        return isAccountAdded(searchAccountName);
    }

    public void addAccount(String accountName, String accountDescription){

        waitAndClick(By.id(addAccountButton));
        waitAndFindElement(By.id(accountNameTextId)).sendKeys(accountName);
        hideKeyboard();
        waitAndFindElement(By.id(accountDescriptionTextId)).sendKeys(accountDescription);
        waitAndClick(By.id(newAccountSave));

    }

    public boolean isAccountAdded(String accountName){

        boolean isPresent = false;

        List<WebElement> listOfAccounts = waitAndFindElements(By.className(textViewClassName));

        for(WebElement elementAccount:listOfAccounts){
            if(elementAccount.getText().equals(accountName)){
                System.out.println("Retrieved Account name: "+elementAccount.getText());
                isPresent = true;
            }
        }
        return isPresent;
    }

    public void navigateTo(String accountName){
        List<WebElement> listOfAccounts = waitAndFindElements(By.className(textViewClassName));

        for(WebElement elementAccount:listOfAccounts){
            if (elementAccount.getText().equals(accountName)){
                elementAccount.click();
                break;
            }
        }
    }

    public String incomeBalanceAmount(){
        return waitAndFindElement(By.xpath(xPathincomeBalanceAccountHome)).getText();
    }


    public boolean isTitleDisplayed(String accountTitle){
        return waitAndFindElement(By.id(titleId)).getText().equals(accountTitle);
    }

}
