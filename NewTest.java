package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  
	public WebDriver driver = new FirefoxDriver();;
  
  @Test
  public void method() {
	  
	//Invoke a web Browser
			WebDriver driver = new FirefoxDriver();
			
			//Open Facebook
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			
			String CurrentTitle=driver.getTitle();
			System.out.println("Title of the page is = "+ CurrentTitle );
			
			if (CurrentTitle.equalsIgnoreCase("Facebook - log in or sign up" ))
			{ 	System.out.println ("Facebook page is displayed") ;}
			else 
			{	System.out.println ("Facebook page is not displayed");}
			driver.close();
				
  }
	
  @Test
  public void method1() {	  
		  
		//Open google
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			System.out.println("-----------------------------------------------");
			
			String CurrentTitle=driver.getTitle();
			System.out.println("Title of the page is = "+ CurrentTitle );
			
			System.out.println("-----------------------------------------------");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			WebElement searchBox= driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
			searchBox.sendKeys("TestNG");	
		
  
  }
  
  @Test
  public void method2() {
	  
	//Open google
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(5));
		
		System.out.println("-----------------------------------------------");
		WebElement searchBox= driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		searchBox.sendKeys("Selenium");
		driver.close();
		
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }
  
  @AfterMethod
  public void afterMethod() {
  }
  
  @BeforeClass
  public void beforeClass() {
  }
  
  @AfterClass
  public void afterClass() {
  }
  
  @BeforeTest
  public void beforeTest() {
  }
  
  
  @AfterTest
  public void afterTest() {
  }
  
  
  @BeforeSuite
  public void beforeSuite() {
  }
  
  
  @AfterSuite
  public void afterSuite() {
  }
}
	