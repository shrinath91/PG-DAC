package com.cdac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {
	

	
	public void fdshgdgjcdjhvkjjkkjhkjkjh() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\aadish\\Desktop\\selenium\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		// ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.saucedemo.com/v1/index.html");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElementById("user-name").sendKeys("standard_user");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElementById("password").sendKeys("secret_sauce");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElementById("login-button").click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String text = driver.findElementByClassName("product_label").getText();

		System.out.println(text);
		
		driver.close();

		Assertions.assertEquals("Products", text);
	}
	
	@Test
	public void testAdd() {
		Calculator c=new Calculator();
		Assertions.assertEquals(5, c.add(3, 2));
		
	}

}
