package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        try {
            driver.get("https://www.facebook.com/");

            WebElement acceptCookiesButton = driver.findElement(By.xpath("//button[text()='Accept All']"));
            if (acceptCookiesButton.isDisplayed()) {
                acceptCookiesButton.click();
            }

            WebElement createAccountButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
            createAccountButton.click();

            Thread.sleep(2000);

            WebElement daySelect = driver.findElement(By.xpath("//select[@name='birthday_day']"));
            WebElement monthSelect = driver.findElement(By.xpath("//select[@name='birthday_month']"));
            WebElement yearSelect = driver.findElement(By.xpath("//select[@name='birthday_year']"));

            Select dayDropdown = new Select(daySelect);
            Select monthDropdown = new Select(monthSelect);
            Select yearDropdown = new Select(yearSelect);

            // Set the date of birth (e.g., 14th, April, 1912)
            dayDropdown.selectByValue("14"); // Day
            monthDropdown.selectByValue("4");  // Month (April)
            yearDropdown.selectByValue("1912"); // Year


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
