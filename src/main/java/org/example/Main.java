package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        // Configure chrome web driver
        System.setProperty("webdriver.chrome.driver", "/home/deimos/dev/web/chromedriver-linux64/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.setBinary("/home/deimos/dev/web/chrome-linux64/chrome");

        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://www.google.com");

        try {
            // Pause execution for 1000 milliseconds (1 second)
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // Handle the exception, though it's unlikely to occur in this simple context
            Thread.currentThread().interrupt();
            System.out.println("The thread was interrupted.");
        }

        webDriver.quit();
    }
}