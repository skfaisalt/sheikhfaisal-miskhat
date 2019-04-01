#### Platform ####
Android

#### The Stack ####
The automation stack consists of
- Cucumber(BDD tests)
- Java (Glue Code)
- TestNG (test suite manager)
- Maven (Build & Dependency management)
- Appium (Server to run the tests, acts as the interface between the device/emulator and the automation scripts).
- UiAutomatorViewer(additional tool for development)
(comes with the Android SDK)
- Appium Inspector(additional tool for development)
(comes with Appium for Desktop)

#### Pre-requisites ####
1. Appium must be installed in the test environment. The version used in 1.12.1
2. Java 8 must be installed.
3. Android SDK must be present.
4. GnucashAndroid_v2.4.0-beta3.apk must be installed in the test device.

#### Importing the project ####

1. The automation project is a Maven project. This saves us from the misery of managing the dependencies. Import the project as a Maven project in the IntelliJ or a suitable IDE. For development purpose it is important to have installed in the IDE
- Cucumber For Java
- TestNG

2. Ensure auto-import is turned ON so that Maven downloads all the dependencies.

#### Project Structure ####

The automation project consists of **src** and **test** packages.

1. The app views are nested inside the __src__ package. These files correspond to the operational controls associated to the respective app view.

2. Features, steps and glue code reside under cucumber nested inside the __test__ package.

  - Feature files contain the tests written BDD(gherkin) style syntax.
  - Step Definitions contain the glue code, meaning that the low level implementations of the tests are scripted here.
  - Tests point the test runner as per the definition of priority.

#### How to Add a new Test ####
Adding a new test involves at least 2 steps

**Step 1: Create a Feature File**
Add the feature file under cucumber/features
  - Follow the gherkin syntax.
  - Assess and assign the priority.

**Step 2: Add Step Definition**
Add the step definition file under cucumber/steps
  - A new step definition class must extend the BaseSteps class

**Step 3: Add View file**
This step must be carried out if the new Test involves a new View that is not present in the project.
  - A new View must extend the BaseView class.

#### Test Execution ####

1. Ensure Appium server is running.
(Run 'appium' in the mac terminal).

2. Create a TestNG run configuration
  - **Test kind**: Suite
  - **Suite**: [location of the test suite]
  (**_This has to be done manually in the current implementation_**. The tests will not run unless this part of the setup is done using the Run Configurations.)
  - **Use classpath of module**: [the project root]

3. Run the configuration.
  - By default, all tests will be executed following priority.
  - To allow test execution based on a specific priority, comment the ones that are not required. Fresh launch tests must not be commented. Incase this is required, ensure to launch app and finish the configuration wizard on app launch manually.


#### Limitations ####
Automating tests for the given app has indeed been cumbersome since the developers did not maintain a neat list of accessibility, resource and element identifiers. In several occasions, xPath resource needed to be used to reference the elements.

### Scalability ###
he architecture of the project is highly scalable. Since TestNG is used, multiple test suites can be designed and tests can just run in parallel devices.

### Reports
A light weight cucumber report is generated after execution and can be located under
