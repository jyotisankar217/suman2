package mavendemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MavenDemoTest {
	 static WebDriver driver=null;
	
@BeforeTest
	public void tc2()
	{
	  System.setProperty("webdriver.gecko.driver", "D:\\Firefox\\geckodriver.exe");
	    driver =new  FirefoxDriver();
	driver.get("https://www.facebook.com/");
	}
@Test
    public void  tc3() 
    {
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("suman1234@gmail.com");
    	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("suman1234");
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
	    System.out.println("Test successfully");
    }
@AfterTest
      public void tc4()
         {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     	driver.close();
	    

         }
}
