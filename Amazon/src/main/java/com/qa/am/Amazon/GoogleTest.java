package com.qa.am.Amazon;

public class GoogleTest {

	public static void main(String[] args) {

		
		BrowserActions br = new BrowserActions(); // creating a object of a class
		
		br.launchBrowser("chrome");
		
		br.launchUrl("http://www.google.com");
		
		String title = br.doGetTitle();
		
		System.out.println("page title is "+ title);
		
		
		if(title.equals("Google"))
		{
			System.out.println("coorect title");
		}
		else
		{
			System.out.println("in correct title");
		}
		
		
	}

}
