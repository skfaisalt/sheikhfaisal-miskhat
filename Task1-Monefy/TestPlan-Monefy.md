# **Monefy** - Test Plan Document

#### Platform
Android

#### Features
Features which make tracking enjoyable and powerful:
- Intuitive and easy to use user interface. No redundancy
- Add new records extremely fast
- Handy widgets that could be used on lock screen
- Multi-currency support
- See your spending distribution on the nice and informative chart or get detailed information from the records list
- Manage categories if defaults do not work for you
- Be safely synchronised using your own Google Drive or Dropbox account
- Backup and export data in one click
- Use budget mode
- Passcode protection
- Multiple accounts support
- Built-in calculator
- manage categories, if defaults do not work for you
- passcode, Touch ID and Face ID protection
- dark theme



###### Langugage Support
English, Español, Deutsch, Français, Українська, 한국어, Ελληνικά, Русский, Português, Türkçe, İtaliano, Polski, Norsk, 中文(繁體), 中文(简体), Română, Hrvatski.

#### Test Plan

##### High Prio Tests(P1)

**Installation**
- Install app and launch app.
  - App should launch without any crash or unexpected shutdown in all the supported devices.

**Operation**
- Initial Balance must be zero on app launch after installation.
- Default categories should be displayed in app home.
- Category is mandatory before adding an expense.
  - Default category can be used.
  - Custom category can be used.
- Add an expense with a note
- Add an expense without a note
- Category is mandatory before adding an income.
  - Default category can be used.
  - Custom category can be used.
- Add an Income with with a note.
- Add an Income with without a note.
- Balance is updated on every record.
  - Balance is negative when sum of expense is greater than income for a given period.
  - Balance is positive when sum of expense is less than income for a given period.


**Expenses**

  - Launch Expense view via
    - category from app home.
      - Category is already predefined in the Add button.
    - the Expense button
      - Category needs to be selected.
    - widget
      - from the apps view
      - lock screen
  - Add an expense with value
    - Add an expense when
      - balance is zero.
      - balance is negative.
      - balance is positive.
    - Add an expense
      - 9 digit expense value
      - 0 expense value
      - Negative expense value (if possible)
  - Add expense including a note.
  - Add an expense without a note.


**Income**
- Add an Income
  - Test that add income view is launched via
    - via the Income button
      - Category needs to be selected.
  - Test when adding an expense with value
      - 9 digit income value
      - 0 expense value
      - Negative expense value (if possible)
  - Test adding an income with a note.
  - Test adding an income without a note.

**Records**


- Balance is persistent across user sessions.
- Balance is updated when an expense is added.
- Balance is updated when an income is added.




**General Settings**

- Customise language
- Customise currency
- Customise


- Configure the app home screen
  - Day, Week, Month, Year, All, Choose Date
  -





#### References

1. **General Information:** http://www.monefy.me/
2. **List of Features**: https://play.google.com/store/apps/details?id=com.monefy.app.lite
