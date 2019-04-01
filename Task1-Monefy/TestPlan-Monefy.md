# **Monefy** - Test Plan Document

The test Priority is proposed to have direct relationship with the business impact in the following plan. It is important to consider the priority as the basis of identifying severity of a feature or a bug.

#### Plan

1. Use automation tests for the high priority tests.
- Flaky tests can be rerun.
- Failed tests can be manually executed.
2. Use automation/manual execution on the medium and low priority tests.
- automation is good however is not the primary here. If automation is feasible, it can be used. A manual run may prove to be more effective.
3. Use exploratory tests on areas where bugs are encountered at random.
4. List of high priority tests can be revised as per product/business needs.

#### Platform
Android and iOS

##### Test Priority: High

**Installation**
- Install app and launch app.
  - App should launch without any crash or unexpected shutdown in all the supported devices.

**App Behaviour**
  - Initial Balance must be zero on app launch after installation.
  - Category is mandatory before adding an expense.
    - Default category can be used.
    - Custom category can be used.
  - Category is mandatory before adding an income.
    - Default category can be used.
    - Custom category can be used.
    - Balance is persistent across user sessions.
    - Balance is updated on every record.
      - Balance is negative when sum of expense is greater than income for a given period.
      - Balance is positive when sum of expense is less than income for a given period.  

**UI**  
  - Default categories should be displayed in app home.
  - Current month is displayed in the app home.
  - Pie Chart is displayed for every transaction.
    - Pie Chart is displayed in the home.
    - Pie Chart is refreshed upon transaction add/update.
  - Notification to user on every transaction.
  - UI is updated as per account configuration
  - UI is updated as per time interval configuration
    - day, week, month, year and all.
    - date picked by the date picker.

**Operation**
  - Add an expense with a note
  - Add an expense without a note
  - Use built-in calculator while adding an expense
  - Add an Income with with a note.
  - Add an Income with without a note.
  - Use built-in calculator while adding an income
  - Check detailed Balance from Home
      - Transaction records are displayed with category and amount.
  - User can customise app with several currencies.
  - User can customise app with several language.
  - User can transfer money between accounts.
  - User can set Passcode.
  - User can backup data.
  - User can restore data from previous backup.
  - User can upgrade to Pro mode
    - App is synchronised across multiple devices
      - Test using two devices with different platforms(iOS and Android)
        - Google Drive
        - Dropbox


##### Test Priority: Medium
**App Launch**
- Launch app view directly using widgets.
  - Expense
  - Income
  - Transfer

**App Behaviour**
- Notification displayed to user on transfer within the same account.

**Operation**
- User can add records under Balance view
  - '+'' for Income
  - '-' for Expense
- User can check monthly transactions via swiping horizontally under app home  
- User can check monthly balance list via swiping horizontally under Balance
- User can cancel a transaction from the Notification popup

**UI**
- Test with multiple displays
  - different sizes of displays.
  - displays with notch.
- Categories are marked with lines in the Home view.
- Balance background is red when balance is < 0
- Balance background is green when balance > 0
- List of transactions are displayed with category icons
- Notification is provided to user when there are no records on a specific duration.
- User can upgrade to Pro mode
  - Additional Widgets are enabled
  - App can be customised to Dark theme
    - UI of existing features must not be affected.

##### Test Priority: Low

**Operation**
- Add an income with value
  - Add an income when
    - balance is zero.
      - verify update on balance.
    - balance is negative.
      - verify update on balance.
    - balance is positive.
      - verify update on balance.
- Test when adding an income with value
    - 9 digit income value
    - 0 income value
- Add an expense with value
  - Add an expense when
    - balance is zero.
      - verify update on balance.
    - balance is negative.
      - verify update on balance.
    - balance is positive.
      - verify update on balance.
- Test when adding an expense with value
    - 9 digit income value
    - 0 expense value
- User can clear data

**UI**
- Customise the app home screen
  - Day, Week, Month, Year, All, Choose Date
- Device Orientation has no impact on the UI.


#### References

1. **General Information:** http://www.monefy.me/
2. **List of Features**: https://play.google.com/store/apps/details?id=com.monefy.app.lite
