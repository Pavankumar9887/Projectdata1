  package com.flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_product {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pavan kumar\\eclipse-workspace\\Selinium\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		WebElement ele= driver.findElement(By.id("search"));
		ele.sendKeys("Hero Hoodie");
		ele.submit();
		//click the image
		driver.findElement(By.className("product-image-photo")).click();
		//click the size
		driver.findElement(By.cssSelector("div[id='option-label-size-143-item-167']")).click();
		//click the color
		driver.findElement(By.cssSelector("div[id='option-label-color-93-item-49']")).click();
		//click the add to cart
		driver.findElement(By.cssSelector("button[id='product-addtocart-button']")).click();
		Thread.sleep(3000);
		//click on the settings 
		driver.findElement(By.cssSelector("a[class='action showcart']")).click();
		//click on proceed to 
		driver.findElement(By.id("top-cart-btn-checkout")).click();
		
	}
}
