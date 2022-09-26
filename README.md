# CalculatorProject

Java Calculator project for test automation, covering UI testing. project to write BDD tests with Cucumber and execute with selenium. Tests are written in an ordinary language that bridges the gap between business and technical people.Tests are written using Gherkin syntax. The selenium simplifies the setup and avoids any local installation of browser specific dependencies.

Features-
1. Simple setup, no need for local preinstalled Selenium Server and browser drivers
2. Test with Chrome with zero configuration
3. Integrated with Webdriver
4. BDD tests with Cucumber
5. Possibility to visually see the execution in browser 
6. Detailed report generation in allure and html

Concepts Included-
1. Shared state across cucumber step definitions
2. Page Object Model design pattern
3. Data Driven
4. Commonly used test utility classes

Dependencies-
1. Maven
2. Web Driver Manager
3. Cucumber-JVM
4. Cucumber-TestNG
5. Allure TestNg
6. TestNG
7. Selenium Server

Requirements-
1. Maven
2. Chrome Browser
3. TestNG(in case TestNG plugin in not install in your IDE)
4. Cucumber(in case Cucumber plugin in not install in your IDE)

Steps to run the Test:
1. if you want to execute the project click on the CalculatorTestRunner class and
2. Right click on the run TestNG Test

If you want to see the report in this project 2 reports are generated(allure and html report)
1. Allure Report -- 1. open the cmd allure-result path
                    2. write command allure serve path of the allure-result folder
2. html report --   1. Expand the test output folder 
                    2. open with index.html file in web browser
                  
If you want to change the any inputs or data in this project change the values inside the data.properties file. no need to change source code.


