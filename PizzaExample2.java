package com.capg.demo.seleniumexample;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PizzaExample2 {
	static Logger logger=Logger.getLogger(PizzaExample2.class.getName());
	WebDriver driver;
	
	@Test
	public void ExampleForPizza() throws InterruptedException
	{
		try {
		System.setProperty("webdriver.chrome.driver", "D:\\devops\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8084/selenium/pitzza.html");
		Thread.sleep(2000);
		Select toppings=new Select(driver.findElement(By.id("sel")));
		toppings.selectByIndex(1);
		toppings.selectByIndex(3);
		int i=0;
		while(!toppings.getOptions().isEmpty())
		{
		logger.info(toppings.getAllSelectedOptions().get(i).getText());
		toppings.deselectByIndex(i);
		i++;
		}}
		finally {
			driver.close();
		}
}

}
