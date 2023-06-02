package com.project.project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day6 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Nirmal");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("s");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("nirmal@gamil.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("nirmal");
		JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,2000)", "");
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
		
	}

}
