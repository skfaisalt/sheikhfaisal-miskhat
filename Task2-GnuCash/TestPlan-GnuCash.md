### Test Coverage ###

**Fresh Launch Tests**
Tests on initial app configuration of the app via the configuration wizard. These tests are always executed in the beginning since they ensure coverage on the fresh installation of the app. Execution takes priority over all other tests.

Listed below are the proposed tests. **(A)** marks as **_automated_**.
- Finish app configuration wizard on fresh launch. **(A)**
- What's New Dialog lists change-log as defined by product.
- Dismiss What's New Dialog upon finishing configuration wizard. **(A)**

Pros:
- Ensures coverage of app behaviour upon fresh installation.
- Regression on releases.
Cons:
- Requires the app to be installed every time.


**High Priority Tests**
Fundamental test for the product. These tests can be generalised as smoke tests, the coverage these tests bring ensure that the app is operational as per the business needs.

Listed below are the proposed tests. **(A)** marks as **_automated_**.

- User can add an account. **(A)**
- User can navigate to an account. **(A)**
- User can add an Income. **(A)**
- User can add an Expense **(A)**
- User can view Report. **(A)**
- User Expense Report is calculated accurately. **(A)**
- User can view report after transaction in the Reports view. **(A)**
- User can manage Books
  - Import Books.
  - Switch Books and verify transactions stored for each book.
- User can export reports
  - CSV
  - QIF
  - XML
- Reports can be generated with respect to the defined duration.
- User can schedule an export job.
- Records should be persistent across user sessions.
- User can set a passcode

Pros:
- Business logic coverage.
- Good for cyclic releases.
- Good for identifying side-affects when a new fix/feature is implemented.
- Can be used as a stability checker for the app behaviour.

Cons:
- Reports cannot be verified and validated alone with the app. Reports need to be tested as a separate component and only this will allow integrity check on the feature.
- Not all tests are automated.
- Tests need to be further broken down to include checks on the app behaviour for:
  - acceptable data inputs
  - incorrect data inputs.


**Medium Priority Tests**

- User is presented with the Accounts view after app configuration. **(A)**
- User can view all default accounts in the Accounts page. **(A)**
- User can add an account. **(A)**
- User can delete an account.
- User can edit an account.
- User can search an account. **(A)**
- User can view the Expenses account. **(A)**
- User can view the Income account. **(A)**
- User can view Report in Pie Chart Format.
- User can view Report in Bar Chart Format.
- User can view Report in Line Chart Format.
- User can view Report in Balance Sheet Format.
- User can view the recent transactions activities.
- User can set an account has favourite.
- Export operation can be customised to delete transactions

Pros:
- Functional Level Coverage.
- Ensures coverage on detailed functional level along with the UI.
- Should detect bugs that do not affect business logic
-

Cons:
- Any changes in the UI will break the tests.

**Low Priority Tests**
- User can access Menu from all views.
- User can switch between Books directly from General Settings.
- User can create a default account.
  - Creating a default account creates a new book.
  - Existing Books are not affected with a new book.

Pros:
- Provides regression for long term support.

**Additional Test Coverage**

- Report needs to verified and validated under multiple coverages.
- Exported report must also be checked for validity on other platforms such as Drive and Desktop.
  - Import and open file in online spreadsheet viewer for each format.
  - Import and open file in desktop application for each format.
  - Import and open file in mobile for each format.
  - Functional.
    - App can export a report.
      - Writes to storage.
      - Writes to drive
  - Integration
    - Import exported report in a spreadsheet and verify values.

### Prioritisation of Tests ###

Specified below are several use cases of test prioritisation when it comes to ensure test coverage on the app.

**Major Release**
All(fresh-launch, high-prio, medium-prio, low-prio) tests + additional tests based on the change-log(features + fixes).

**Minor Release**
Tests(fresh-launch, high-prio, medium-prio).

**Feature Development**
Tests(fresh-launch, high-prio, medium-prio).

**Bug Fixes**
Tests(fresh-launch, high-prio) + test on bug fix

**Regression on OS/Device support**
All(fresh-launch, high-prio, medium-prio, low-prio) tests.
