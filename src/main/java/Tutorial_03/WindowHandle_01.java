package Tutorial_03;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_01 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
		String parentWindowId = driver.getWindowHandle();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Pratiksha");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Visit Orange HRM']")).click();
		
		Set<String> OrangeHRMWindowId = driver.getWindowHandles();
		
		for(String orangeWindow : OrangeHRMWindowId)
		{
			driver.switchTo().window(orangeWindow);
			
			String actualOrangeTitel = driver.getTitle();// orangehrm
			System.out.println(actualOrangeTitel);
			
			if(actualOrangeTitel.equals("OrangeHRM"))//
			{
				break;
			}
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		//Thread.sleep(2000);
		
		driver.switchTo().window(parentWindowId);
		
	//	Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Free CRM Link']")).click();
		
		//Thread.sleep(2000);
		
		Set<String> freeCRMWindowId = driver.getWindowHandles();
		
		for(String FreeCRMWindow : freeCRMWindowId)
		{
			driver.switchTo().window(FreeCRMWindow);
			String actualCurrentUrl = driver.getCurrentUrl();
			
			System.out.println("Actual Current URl : "+actualCurrentUrl);
			if(actualCurrentUrl.equals("https://ui.freecrm.com/login"))
			{
				break;
			}
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prafulp1010@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pr@ful0812");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	//	Thread.sleep(2000);
		
		driver.switchTo().window(parentWindowId);
	
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='SauceDemo Link']")).click();
		Set<String> sauceDemoWindowId = driver.getWindowHandles();
		for(String sauceWindow : sauceDemoWindowId)
		{
			driver.switchTo().window(sauceWindow);
			String actualSauceTitle = driver.getTitle();
			
			System.out.println("Actual Title After Switching Sauce Demo :: "+actualSauceTitle);
			
			if(actualSauceTitle.equals("Swag Labs"))
			{
				break;
			}
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//form/descendant::input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//form/descendant::input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//form/descendant::input[@id='login-button']")).click();
		
		Thread.sleep(1000);
		
		//  switch focus to orange HRM window and add new employee in PIM Page
		Set<String> allWindowId = driver.getWindowHandles();
		for(String windowOrange : allWindowId)
		{
			driver.switchTo().window(windowOrange);
			String actualTitleOrange = driver.getTitle();
			if(actualTitleOrange.equals("OrangeHRM"))
			{
				break;
			}
		}
		
		Thread.sleep(2000);

		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Pratiksha");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Hundekar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Hundekar");
		
		// switch focus to free crm window and create new contact 
		
		for(String windowFreeCRM : allWindowId)
		{
			driver.switchTo().window(windowFreeCRM);
			String freeUrlActual = driver.getCurrentUrl();
			if(freeUrlActual.equals("https://ui.freecrm.com/"))
			{
				break;
			}
		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Pratiksha");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Musande");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		driver.switchTo().window(parentWindowId);
		
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Latur");
		
	}

}

/*
Assignment

https://prafpawar11.github.io/multiplewindows.html

e.g.
	- Open https://prafpawar11.github.io/multiplewindows.html
	- Enter firstName
	- click on orange hrm Link
	- switch focus to Orange HRM and Achieve login functionality
	- switch focus to main window

	- click on free crm link
	- Switch focus to Free CRM and Achieve login functionality in free crm application
	
	- switch focus to main window
	- Click on sauce Demo link
	- Enter credentials in Sauce Demo Application

	- switch focus to orange HRM window and add new employee in PIM Page
	- switch focus to main window and enter lastName
	- switch focus to free crm window and create new contact 
	- switch focus to main window and enter address
*/