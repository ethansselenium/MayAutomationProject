package com.qa.am.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		String title = driver.getTitle();
		
		System.out.println("title of a page is--> " + title);
		
		
		if (title.equals("jQuery UI Droppable - Default functionality"))
		{
			System.out.println("Title is correct");
			
		}
		else 
		{
			
			System.out.println("Title is not Correct");
			
		}
		
		
		driver.manage().window().maximize(); //screen maximize
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		//or
		
		//driver.findElement(By.id("draggable"));
		
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		
		
		Actions action = new Actions(driver);

		//action.dragAndDrop(source, target).build().perform();
		
		action.clickAndHold(source).moveToElement(target).release().build().perform();
		
		driver.quit();
		
		
	}

}
