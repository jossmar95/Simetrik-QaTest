package com.simetrik.codingtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks {

public static WebDriver driver;
	
	//@Before
	
	public static void setUp() {		
		//Set up the driver
		WebDriverManager.chromedriver().setup();		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 	 
	}
	
	//@After
	public static  void tearDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
		
	}
}

