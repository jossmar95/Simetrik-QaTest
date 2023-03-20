package com.simetrik.codingtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Practice Exercise # 2
public class BrowserManagement {
	static String url = "http://www.deadlinkcity.com/";
	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();		
		WebDriver chDriver = new ChromeDriver();
		chDriver.manage().window().maximize();
		 test(chDriver);
		
		WebDriverManager.firefoxdriver().setup();		
		WebDriver ffDriver = new FirefoxDriver();
		ffDriver.manage().window().maximize();
		test(ffDriver);
		
		
	}
	
	public static void test(WebDriver driver) {
		driver.get(url);
		// write your test script
		driver.quit();
	}
}
