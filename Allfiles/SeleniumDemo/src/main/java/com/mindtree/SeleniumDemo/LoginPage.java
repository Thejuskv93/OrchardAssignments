package com.mindtree.SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage
{
	
	@Test(priority=1)
	public void signUp1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium Testing\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vibgyorpaints2018.azurewebsites.net");
        driver.manage().window().maximize();//to maximize the window
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[2]/li[2]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("Sandesh");
        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("Mathur");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("9078987656");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("987656");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("12345678");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("12345678");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("Green");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys("Shivmoga");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("KVKN");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/signup/form/div/div/button[1]")).click();
        Thread.sleep(3000);
        driver.close();
	}
	
	
	@Test(priority=2)
	public void login1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
        Thread.sleep(7000);
        driver.close();
	}
	
	@Test(priority=3)
	public void login2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium Testing\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://vibgyorpaints2018.azurewebsites.net");
        driver.manage().window().maximize();//to maximize the window
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[2]/li[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-login/div/form/input[1]")).sendKeys("9999999999");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-login/div/form/input[2]")).sendKeys("123406");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@value='Reset']")).click();
        Thread.sleep(7000);
        driver.close();
	}
	
}
