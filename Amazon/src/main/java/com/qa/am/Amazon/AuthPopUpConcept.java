package com.qa.am.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUpConcept
{

	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		String username = "admin";
		String password = "admin";

		driver.get("http://"+username + ":"+ password+ "@"+"the-internet.herokuapp.com/basic_auth");
		
		//String user ="vidhu34681";
		
		//"https://www.capita.uk"+":"+ user/in
		
	}

}
