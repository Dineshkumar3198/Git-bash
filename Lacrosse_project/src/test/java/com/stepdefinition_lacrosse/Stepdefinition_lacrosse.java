package com.stepdefinition_lacrosse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.runnerclass_lacrosse.Runnerclass_lacrosse;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition_lacrosse {
	
	WebDriver driver=Runnerclass_lacrosse.driver;
	
	@Given("user launch the url and enter the page")
	public void user_launch_the_url_and_enter_the_page() throws InterruptedException {
		driver.get("https://www.lax.com/home");
		Thread.sleep(2000);
	}

	@When("user click on the login page and navigate to the login page")
	public void user_click_on_the_login_page_and_navigate_to_the_login_page() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='user-message']")).click();
		Thread.sleep(2000);
	   
	}

	@When("user click on the email box and send the {string}")
	public void user_click_on_the_email_box_and_send_the(String string) throws InterruptedException {
		driver.findElement(By.id("login-form-email")).sendKeys(string);
		Thread.sleep(2000);
	   
	}

	@When("user click on the password box and send the {string}")
	public void user_click_on_the_password_box_and_send_the(String string) throws InterruptedException {
		driver.findElement(By.id("login-form-password")).sendKeys(string);
		Thread.sleep(2000);
	   
	}

	@Then("user click on the login button")
	public void user_click_on_the_login_button() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	    
	}

}
