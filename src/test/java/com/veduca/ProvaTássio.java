package com.veduca;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProvaTássio {
	private WebDriver driver = null;
	
	@Before
	public void preCondition() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tecnico\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.coursera.org/");
	}
	
	@Test
	public void searchingForTheCourse() {
		
		driver.findElement(By.xpath("//*[@id=\"rendered-content\"]/div/div/span/div/header/div[3]/div/div[1]/div/div/div[2]/div/div[2]/form/div/div/div[1]/div/input")).sendKeys("Gestão");
		driver.findElement(By.xpath("//*[@id=\"rendered-content\"]/div/div/span/div/header/div[3]/div/div[1]/div/div/div[2]/div/div[2]/form/div/div/div[1]/div/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rendered-content\"]/div/div/div[1]/div/div/div[1]/div[3]/div[2]/div/div/div/ul/li[1]/div/a/div/div/div[1]/img[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/div[1]/div[1]/div/div/div[1]/div[3]/div/div/div[1]/div/button")).click();
		
	}
	
	@Test
	public void signUp() {
		
		driver.findElement(By.xpath("//*[@id=\"c-ph-right-nav\"]/ul/li[5]/a")).click();
		driver.findElement(By.id("nameInput_27-input")).sendKeys("Po Kalium");
		driver.findElement(By.id("emailInput_55-input")).sendKeys("kalium@mailinator.com");
		driver.findElement(By.id("passwordInput_119-input")).sendKeys("senha123");
		driver.findElement(By.xpath("//*[@id=\"authentication-box-content\"]/div/div[2]/div[1]/div[1]/form/div/button/span")).click();
		
	}
	
	@Test
	public void signIn() {
		
		driver.findElement(By.xpath("//*[@id=\"c-ph-right-nav\"]/ul/li[4]/a")).click();
		driver.findElement(By.id("emailInput_27-input")).sendKeys("kalium@mailinator.com");
		driver.findElement(By.id("passwordInput_70-input")).sendKeys("senha123");
		driver.findElement(By.xpath("//*[@id=\"authentication-box-content\"]/div/div[2]/div/div[1]/form/div[1]/button")).click();
		
	}
}
