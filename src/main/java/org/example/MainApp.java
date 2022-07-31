package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.promo.adidas.com");

        Try.these(
                Action.perform("Entering Username and Password", () -> {
                    WebElement username = driver.findElement(By.id("username"));
                    WebElement password = driver.findElement(By.id("password"));

                    username.sendKeys("<username>");
                    password.sendKeys("<password>");

                }),
                Action.perform("Clicking LOGIN button", () ->
                        driver.findElement(By.className("btn")).click()
                ),
                Action.perform("Selecting Reorder", () ->
                        driver.findElement(By.cssSelector("#root > div > main > div > div > div.store_front__left_panel_menu > a:nth-child(1)")).click()
                ),
                Action.perform("Selecting Basketball", () ->
                        driver.findElement(By.cssSelector("#root > div > main > div > div > div.storefrontBanner__content > nav > ul > li:nth-child(7) > a")).click()
                )
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Press ENTER two times");
        scanner.nextLine();
        driver.quit();
        System.out.println("\n Closed the browser");

    }
}




