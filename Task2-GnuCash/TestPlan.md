### Test Coverage ###

**Fresh Launch Tests**
Tests on initial app configuration of the app via the configuration wizard. These tests are always executed in the beginning since they ensure coverage on the fresh installation of the app. Execution takes priority over all other tests.

Listed below are the proposed tests. **(A)** marks as **_automated_**.
- Finish app configuration wizard on fresh launch. **(A)**
- What's New Dialog lists change-log as defined by product.
- Dismiss What's New Dialog upon finishing configuration wizard. **(A)**

**High Priority Tests**
Tests that are fundamental to the business and the product. These tests can be generalised as smoke tests, the coverage these tests bring ensure that the app is operational as per the business needs.

Listed below are the proposed tests. **(A)** marks as **_automated_**.

- User can add an account. **(A)**
- User can navigate to an account. **(A)**
- User can add an Income. **(A)**
- User can add an Expense **(A)**
- User can view Report. **(A)**
- User Expense Report is calculated accurately. **(A)**
- User can view report in the Reports view
- User can export Report.

**Medium Priority Tests**

- User is presented with the Accounts view after app configuration. **(A)**
- User can view all default accounts in the Accounts page. **(A)**
- User can add an account. **(A)**
- User can search an account. **(A)**
- User can view the Expenses account. **(A)**
- User can view the Income account. **(A)**
- User can view Report in Pie Chart Format.
- User can view Report in Bar Chart Format.
- User can view Report in Balance Sheet Format.

**Low Priority Tests**

**Additional Test Coverage**

- Reports need to verified and validated under multiple coverages.
  - Functional.
    - App can export report.
      - Writes to storage.
      - Writes to drive
  - Integration
    - Import exported report in a spreadsheet and verify values.
    - Import repor







1. User must configure app when launching for the first time.
2. App is configured with user configuration.
  - By Default User is provided 5 default accounts.
  - Currency is user defined.
  - User can add an expense under an account.
  - User can add an income under an account.
  - User can see reports
      - Pie Chart
      - Bar Chart
      - Line Chart
      - Sheet
      - Customise view of reports

3. Asset account is automatically updated when the Income account is updated.
4. Asset account is automatically updated when the Expense account is updated.
5. Asset account is automatically updated when the Liabilities account is updated.
6. Asset account is automatically updated when the Equity account is updated.
4. User can add a primary account.
4. User can delete a primary account.
5. User defined favourite accounts can be viewed under Favourites tab.
6. Recent tab displays list of accounts that have been updated recently.
7. User can search accounts
  - All
  - Recent
  - Favourites
8. User can view different types of reports on the account transactions.

9. User can export transactions
  - CSV
  - QIF
  - XML


Existing Issues
1. Add account is displayed in every tab/view. This operation only makes sense in the Accounts view.
2. Favourites tab is not updated if user navigates from the All tab.
3. Pie Report is not updated as per user definition. Text is always "Expense for last 3 months"
  - Month
  - Quarter
  - Year






###Prioritisation of Tests###

###Possibilities of proposed test cases with respect to their levels###
####Pros####

####Cons####
