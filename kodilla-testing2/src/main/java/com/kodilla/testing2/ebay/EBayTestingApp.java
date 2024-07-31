package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {

    public static final String SEARCH_FIELD = "gh-ac"; // eBay search field id

    public static void main(String[] args) {
        // Initialize WebDriver using the WebDriverConfig class
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);

        if (driver != null) {
            // Open eBay website
            driver.get("https://www.ebay.com/");

            // Find the search field using its ID
            WebElement searchField = driver.findElement(By.id(SEARCH_FIELD));

            // Enter the word "Laptop" into the search field
            searchField.sendKeys("Laptop");

            // Submit the search form
            searchField.submit();

            // Optional: Wait for a few seconds to see the results before closing the browser
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Close the browser
            driver.quit();
        } else {
            System.out.println("WebDriver initialization failed.");
        }
    }
}
