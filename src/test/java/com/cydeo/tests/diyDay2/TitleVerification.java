package com.cydeo.tests.diyDay2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // 1. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        //2. Search for “wooden spoon”

       // WebElement etsySearchBox=driver.findElement(By.name("search_query"));
         WebElement etsySearchBox= driver.findElement(By.id("global-enhancements-search-query"));

        etsySearchBox.sendKeys("wooden spoon"+ Keys.ENTER);


        //3. Verify title Expected: Wooden spoon | Etsy

        String expectedTitle="Wooden spoon | Etsy";
        //String expectedTitle="Wooden spoon - Etsy";
        String actualTitle=driver.getTitle();

        System.out.println(actualTitle);

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.err.println("Title verification FAİLED!!!");
        }

      driver.close();

    }

}
