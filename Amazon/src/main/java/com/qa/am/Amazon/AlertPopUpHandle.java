package com.qa.am.Amazon;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();// switch to alert-- yes [accept]
		
		//driver.switchTo().alert().dismiss(); //switch to alert--- No [Cancel] 
		
		 Alert al = driver.switchTo().alert(); // switch to alert--- No [switching to alert returns the value]
		 al.getText();
		 //al.sendKeys("test");
		driver.switchTo().activeElement(); // return to your original web application
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
		if(text.equals("Please enter a valid user name")){
			System.out.println("correct error messg");
		}else{
			System.out.println("in correct error messg");
		}
		
		alert.accept();//click on OK
		
		//alert.dismiss(); //cancel the alert
		
		
		
	}

}
