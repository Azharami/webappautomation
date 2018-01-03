package com.demoapp.seleniumtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	
	
  @Test
  public void f() {

	  
  }
  @BeforeTest
  public void beforeTest() {
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\Ami\\Downloads\\test-automation\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.get("https://www.monki.com/entrance.html");
  }

  @AfterTest
  public void afterTest() {
  }

}
