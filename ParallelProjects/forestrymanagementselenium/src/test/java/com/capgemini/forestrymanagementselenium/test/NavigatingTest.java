package com.capgemini.forestrymanagementselenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigatingTest extends BaseTest {
	
	@BeforeMethod
	public void loadDrive() {
		driver.get("http://localhost:4200");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/ul/li[1]/a")).click();
		driver.findElement(By.id("adminName")).sendKeys("admin");
		driver.findElement(By.id("adminPassword")).sendKeys("Admin@123");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/form/div[3]/button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void testNavigating() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarDropdown1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarDropdown2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarDropdown3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/ul/li[3]/a")).click();
		driver.close();

	}

}
