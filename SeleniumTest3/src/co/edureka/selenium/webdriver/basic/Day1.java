package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Day1 {

	WebDriver browserDrv;
	public void invokeBrowser() 
	{
		try {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\islam.ARCOM\\Downloads\\Compressed\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			browserDrv = new FirefoxDriver();
			browserDrv.manage().deleteAllCookies();
			//driver.manage().window().maximize();
			browserDrv.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
			browserDrv.get("https://edureka.co");
			browserDrv.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}		
	}
	
	public void executeTest() 
	{	
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement searchBox = browserDrv.findElement(By.id("homeSearchBar"));
		searchBox.sendKeys("selenium");
		searchBox.sendKeys(Keys.ENTER);
	
		try {
			Thread.sleep(20000);
		    } 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement weekDayCount = browserDrv.findElement(By.id("weekday_count"));
		weekDayCount.click();
		/*JavascriptExecutor jse = (JavascriptExecutor) browserDrv;
		jse.executeScript("window.scrollBy(0,400)", "");*/
		//searchBox.submit();
	}
	
	public static void main(String[] args) {
		
		Day1 myObj = new Day1();
		myObj.invokeBrowser();
		myObj.executeTest();
	}

}
