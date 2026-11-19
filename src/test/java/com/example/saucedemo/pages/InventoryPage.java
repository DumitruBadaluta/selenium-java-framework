package com.example.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    static final By TITLE = By.cssSelector("[data-test='title']");

    private final WebDriver driver;

    InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.findElement(TITLE).getText();
    }
}
