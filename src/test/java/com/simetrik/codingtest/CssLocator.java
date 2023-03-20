package com.simetrik.codingtest;
import org.openqa.selenium.By;

//Practice exercise #5
public class CssLocator extends Hooks {

	
	public static void main(String[] args) {
		setUp();
	
		
		String h2Text = driver.findElement(By.cssSelector(".container.mx-auto.max-w-4xl h2:nth-of-type(2)")).getText();
		String pText = driver.findElement(By.cssSelector(".container.mx-auto.max-w-4xl p:nth-of-type(2)")).getText();
		
		tearDown();
	}
}
