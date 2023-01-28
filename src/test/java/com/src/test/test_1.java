package com.src.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class test_1 {
	
	WebDriver driver ;
	@Test
	
	public void TC_001() 
	{
		
		driver.get("https://www.thetestingworld.com/");
		
		String expected_title= "Testing World Experienced in making experts";
		
		String actual_title =driver.getTitle();
		
	    Assert.assertEquals(actual_title, expected_title);
	    
	    System.out.println("TC_001 Passed");
		
	}	
	
	  @BeforeMethod
	  public void start_browser()  
	  {
		   driver = new ChromeDriver();
			
			WebDriverManager.chromedriver().setup();
			
			driver.get("https://www.thetestingworld.com/");
			
		
	  }
	  
	  @AfterMethod
	  public void close_browser() throws InterruptedException
	  {
		  driver.quit();
		  
		  Thread.sleep(3000);

	   } 
	  
	  @Test
	  public void TC_002() 
		{
			
			driver.get("https://www.google.co.in/");
			
			String expected_title= "Google";
			
			String actual_title =driver.getTitle();
			
		    Assert.assertEquals(actual_title, expected_title);
		    
		    System.out.println("TC_002 Passed");

			
		}	
		
	
	

}
