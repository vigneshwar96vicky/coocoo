package com.telecom.stopdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomerSteps {
	public static WebDriver driver;
	@Given("user launches telecom application")
	public void user_launches_telecom_application() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.guru99.com/");
	    driver.findElement(By.xpath("//a[text()='Telecom Project']")).click();
	}

	@Given("user click on Add customer")
	public void user_click_on_Add_customer() {
		 driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
	}

	@When("user filles up the required field")
	public void user_filles_up_the_required_field() {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys("vigneshwar");
		driver.findElement(By.id("lname")).sendKeys("marimuthu");
		driver.findElement(By.id("email")).sendKeys("vigneshwar@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("Neyveli");
		driver.findElement(By.id("telephoneno")).sendKeys("9587833749");
		
		
	}

	@When("user click submit")
	public void user_click_submit() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("user verifies customer ID generation")
	public void user_verifies_customer_ID_generation() {
	    Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());
	}

}
