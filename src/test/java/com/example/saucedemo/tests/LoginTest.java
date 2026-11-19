package com.example.saucedemo.tests;

import com.example.saucedemo.pages.InventoryPage;
import com.example.saucedemo.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoginTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }

    @Test
    void standardUserCanLogIn() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();

        InventoryPage inventoryPage = loginPage.login("standard_user", "secret_sauce");

        assertEquals("Products", inventoryPage.getTitle());
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
