# oneFootball-automated-tests
Suite of automated tests, Selenium-TestNG, Maven

### Environment Setup

1. Global Dependecies
    * [Install Eclipse IDE](https://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/oxygen1a)
    * Install TestNG plugin in Eclipse IDE
    * [Install Maven](https://maven.apache.org/install.html)
  	* Or Install Maven with [Homebrew](http://brew.sh/)
    `$ brew install maven`
    
2. Project Dependecies

	``` $ mvn test-compile ```
* You may also want to run the command below to check for outdated dependencies. Please be sure to verify and review     updates before editing your pom.xml file. The updated packages may or may not be compatible with your code.
	```
	$ mvn versions:display-dependency-updates
	```
* To run the tests just run in your project this command in terminal
	```
	$ mvn mvn test -U -Psingle
	
	```
	
* the test will generate reports, reports are located in /Reports/reports.html.
