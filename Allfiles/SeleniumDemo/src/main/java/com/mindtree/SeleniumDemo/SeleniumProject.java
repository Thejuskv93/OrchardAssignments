package com.mindtree.SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class SeleniumProject 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium Testing\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://vibgyorpaints2018.azurewebsites.net");
        driver.manage().window().maximize();//to maximize the window
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[2]/li[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-login/div/form/input[1]")).sendKeys("9633596880");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-login/div/form/input[2]")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@value='Reset']")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
