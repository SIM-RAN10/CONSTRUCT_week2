   ![Alt Text](https://th.bing.com/th/id/OIP._yAco1HOcUFQkmSmG-0SEAHaCm?pid=ImgDet&w=151&h=52.93737236215112&c=7)
# Page Object Model Selenium Java Project
## Introduction
#### This project is a robust automation framework designed for testing the Naaptol e-commerce platform. Using Selenium WebDriver and Java, it implements the Page Object Model (POM) design pattern to ensure maintainable and scalable test automation. The framework features detailed reporting via Extent Reports and is managed using Maven for build automation. It provides comprehensive testing capabilities for the Naaptol website's Shopping Categories, specially focusing on the Tablets & Computers Category.
## Project Type 
### Frontend
## Tech Stack used in this project
- **Selenium WebDriver**: Tool for browser automation and interaction.
- **Extent Reports**: Provides detailed and interactive test execution reports.
- **Maven**: Manages project dependencies and build automation.
- **Java**: Programming language used for writing the automation scripts.
- **PageFactory**: Facilitates initialization of web elements in POM.
- **TestNG**: Framework for managing and executing test cases.

## Version Control and Testing Tools used:
- **Git**
- **GitHub**
- **Selenium**
- **Spring Tool Suite**
## Operating System and browsers used:
- **Windows**
- **Edge**
- **Chrome**
## Application Under Test
AUT URL:  https://www.naaptol.com/ 

##  Installation & Getting Started
### Follow these steps to set up and run the project
### Prerequisites
1. **Ensure Maven is installed**: If Maven is not installed, download and install it from [Maven Official Site](https://maven.apache.org/).
2. **Install dependencies**:
    ```bash
    mvn install
    ```

3. **Run the tests**:
    ```bash
    mvn test
    ```

## Usage
To execute specific tests or configure test execution:

- **Run All Tests**:
    ```bash
    mvn test
    ```

- **Run a Specific Test Class**:
    ```bash
    mvn -Dtest=YourTestClassName test
    ```

4. Install Java JDK 8 or higher
5. An IDE such as Spring Tool Suite or IntelliJ IDEA or Eclipse
   
## Features
- **Page Object Model (POM)**: Utilizes POM for better organization and reusability of page-specific code.
- **Detailed Reporting**: Implements Extent Reports to provide comprehensive test execution reports.
- **Build Automation**: Uses Maven for dependency management and build automation.
- **Cross-Browser Testing**: Supports running tests across multiple browsers (e.g., Chrome, Firefox).
- **Test Management**: Utilizes TestNG for test case management, execution, and reporting.
  
## Design Decisions or Assumptions
- **Page Object Model**: Applied to encapsulate page interactions and elements, ensuring a clean separation between test logic and page-specific code.
- **Extent Reports**: Chosen for detailed and interactive test reports that provide insights into test execution.
- **Maven**: Selected for its ease of managing dependencies and automating the build process.
- **Java**: Used for its robust support and integration with Selenium WebDriver.
- **PageFactory**: Utilized within POM to initialize page elements efficiently.
- **TestNG**: Implemented for its flexible test configuration and management features.

## About Me
### I'm passionate learner with an interest in Software Development Engineer in Test. Currently, I'm working on personal projects and building my skills in Cypress, Selenium, Java etc. I'm eager to grow and collaborate on new opportunities.

## Feedback
### If you have any feedback,please reach out to me at sharmilasaren10@gmail.com.
