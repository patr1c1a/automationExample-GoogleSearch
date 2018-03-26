**AutomationExercise by Patricia E. Miguel**

------------------------------------------------------------------

* Tools used: Selenium Webdriver (v. 3.11), Cucumber (v. 1.2.5), Java JDK (v. 1.8), JUnit (4.12), Maven (v. 3.2.5), Chromedriver (v. 2.36.540470 for Windows).
* Environment: IntelliJ IDEA Community 2017.3, Windows (v. 10 - 64 bit), Chrome (v. 65.0.3325.181).

------------------------------------------------------------------

**Running the project**

Make sure you have Maven and Java JDK installed and MAVEN_HOME as well as JAVA_HOME pointing to the right directories.

Clone or download the project to the local drive. Within a command prompt window/terminal, navigate to it. Then run "mvn clean test".

E.g.:
cd C:/automationExample-GoogleSearch
mvn clean test

------------------------------------------------------------------

**Please note:**

The project performs the following test:
- Given I want to go to the 'www.seleniumhq.org' Page
- When I go to 'www.google.com'
- and I type 'Seleniumhq' in the searchbox
- and I press 'ENTER' in the searchbox
- and I click on 'Selenium HQ' link
- Then I´m on Selenium HQ Page

These test steps have been slightly modified as "_I want to go to the 'www.seleniumhq.org' Page_" was not a suitable precondition for the "Given" setup step, but a test description/expected behavior instead.

------------------------------------------------------------------

**Project structure and patterns used:**

A single test might use more than one of these page objects (e.g.: when they navigate from one page to another).
The project uses the Page Object Model pattern to separate the actions that deal with elements in a page from the actual test logic. 
Location strategy chosen is CSS selectors, and it was done by using a PageFactory object (which provides POM support).

If there is a failed step, a screenshot will be captured and stored in the /target directory.

Project structure is as follows:
* src/test/features: Cucumber feature file using Gherkin language.
* src/test/resources/drivers: browser drivers used by Selenium (only Chrome driver available in this example).
* src/test/java/steps: implementation of test steps in feature file. Also, hooks are placed in this package.
* src/test/pageObjects: classes representing each page used in test steps (Page Object Model)
* src/test/utils: other utilities (Screenshot class)
* src/test/runner: JUnit runner to set up project configuration.

The Hooks class contains a static WebDriver object that will be used throughout the test suite, as well as test setup and teardown actions.

