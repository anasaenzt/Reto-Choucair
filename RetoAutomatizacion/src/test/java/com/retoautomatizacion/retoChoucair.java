package com.retoautomatizacion;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class retoChoucair {
	
	private WebDriver driver;
		
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver =new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}


	@Test
	public void accederEmpleos() throws Exception {
		driver.get("https://www.choucairtesting.com/");
		driver.findElement(By.linkText("Empleos")).click();
		}
	
	  @Test
	  public void paginaEmpleos() throws Exception {
	    driver.get("https://www.choucairtesting.com/empleos-testing/");
	    driver.findElement(By.xpath("//img [@src=\"https://www.choucairtesting.com/wp-content/uploads/2019/07/banner.png\"]")).click();
	  }

	@After
	public void tearDown(){
	driver.quit();	
	}
}
