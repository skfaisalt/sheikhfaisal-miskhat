package com.faisal.appviews;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReportsView extends BaseView {


    //Resource Id
    String menuDrawerId = "Navigation drawer opened";
    String textViewId = "android.widget.CheckedTextView";
    String totalAssetsId = "org.gnucash.android:id/total_assets";
    String netWorth = "org.gnucash.android:id/net_worth";
    String balanceSheetId = "org.gnucash.android:id/btn_balance_sheet";

    //Resource xPath
    String xPathAssetBalance = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.TextView";

    public ReportsView(AndroidDriver driver) {
        super(driver);
    }

    public void openReports(){
        waitAndClick(By.id(menuDrawerId));

        List<WebElement> listOfAccounts = waitAndFindElements(By.className(textViewId));

        for(WebElement elementAccount:listOfAccounts){
            if (elementAccount.getText().equals("Reports")){
                elementAccount.click();
                break;
            }
        }
    }

    public boolean verifyReportFields(){
        boolean isReportAvailable = false;
        String groundAmount = "€0,00";

        sleep(8000);

        String totalAssetAmount = getText(By.id(totalAssetsId));
        String netWorthAmount = getText(By.id(netWorth));

        if((totalAssetAmount.equals(groundAmount)==false && netWorthAmount.equals(groundAmount) == false))
            isReportAvailable=true;

        return isReportAvailable;
    }

    public String getExpensebalance(){
        return getText(By.xpath(xPathAssetBalance));
    }

    public String getTotalAssets(){
        return getText(By.id(totalAssetsId));
    }

    public String getNetWorth(){
        return getText(By.id(netWorth));
    }

}
