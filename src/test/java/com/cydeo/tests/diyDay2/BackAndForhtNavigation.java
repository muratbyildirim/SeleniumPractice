package com.cydeo.tests.diyDay2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForhtNavigation {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

//        2- Go to: https://google.com
        driver.navigate().to("https://google.com");
//        3- Click to Gmail from top right.
        WebElement gmailLink= driver.findElement(By.linkText("Gmail"));
        gmailLink.click();

//        4- Verify title contains:
//        Expected: Gmail
        String expectedTitle="Gmail";
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Verification PASSED!");
        }else {
            System.out.println("Verification FAİLED!!!");
        }


//        5- Go back to Google by using the .back();
        driver.navigate().back();

//        6- Verify title equals:
//        Expected: Google
        expectedTitle="Google";
        actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Verification PASSED!");
        }else {
            System.out.println("Verification FAİLED!!!");
        }
        driver.close();

    }

}
