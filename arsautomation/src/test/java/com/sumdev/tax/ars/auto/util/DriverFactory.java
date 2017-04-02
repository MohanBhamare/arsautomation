package com.sumdev.tax.ars.auto.util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DriverFactory {

	//private static 
private static WebDriver factorydriver = null;

	public static WebDriver getDriver(){
		System.out.println("DriverFactory|getDriver|factorydriver|"+factorydriver);
		System.setProperty("webdriver.chrome.driver", "C:\\Apps\\qa\\selenium\\driver\\chromedriver.exe");
		factorydriver = new ChromeDriver();
		System.out.println("DriverFactory|getDriver|factorydriver|"+factorydriver);
		return factorydriver;
		
		
	}
}
