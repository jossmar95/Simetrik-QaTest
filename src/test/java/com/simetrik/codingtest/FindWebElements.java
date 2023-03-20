package com.simetrik.codingtest;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindWebElements extends Hooks {
	public static void main(String[] args) {
		setUp();
		String url = "https://www.google.com/"; // add the url of targeted web page
		driver.get(url);
		String elementXPath = "//div[@class='gb_Fa gb_6d gb_8a gb_Uc']";
		String elListXPath = "//div[@class='gb_r gb_s']";
		WebElement element = driver.findElement(By.xpath(elementXPath));
		List<WebElement> elList = element.findElements(By.xpath("."+elListXPath)); // search inside (element)
		tearDown();
		
	}

}
