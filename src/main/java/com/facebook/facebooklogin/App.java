package com.facebook.facebooklogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        
       //System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        
        WebDriver driver = new ChromeDriver(chromeOptions);
        
        System.out.println("Script Executing");
        
        //1.Open the browser and get the url
        driver.get("https://www.facebook.com/login/");
        Thread.sleep(1000);
        
        //2.enable wait for 3 seconds
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(1000);
        
        //3.click on email
        driver.findElement(By.id("email")).sendKeys("srikeshrao@xyz.com");
        Thread.sleep(1000);
        
        //4.click password
        driver.findElement(By.id("pass")).sendKeys("xyz");
        Thread.sleep(1000);
        
        //5.Locate last name and enter details
        driver.findElement(By.id("loginbutton")).click();
        Thread.sleep(1000);
        
       driver.quit();
       
       System.out.println("Script executed successfully");
        
    }
}
