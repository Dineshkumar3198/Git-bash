package com.runnerclass_lacrosse;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\lacrosse_features\\lacrosse.feature",
glue="com.stepdefinition_lacrosse",
dryRun=false,
monochrome=true)

public class Runnerclass_lacrosse {
	
	 public static WebDriver driver;
	
	@BeforeClass
	public static  void Setup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Dell\\eclipse-workspace\\Lacrosse_project\\webdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();

	}
	@AfterClass
	public static void Teardown() {
		//driver.quit();

	}

}
