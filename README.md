# Selenium Java Framework

A minimal Selenium WebDriver framework using Java, Maven, JUnit 5, and the Page Object Model.

## Prerequisites

- Java 17 or newer
- Maven
- Google Chrome

Selenium Manager, included with Selenium, locates or downloads the matching ChromeDriver.

## Run the login test

```shell
mvn test
```

The test opens [SauceDemo](https://www.saucedemo.com), signs in as `standard_user`, and verifies that the Products page is displayed.
