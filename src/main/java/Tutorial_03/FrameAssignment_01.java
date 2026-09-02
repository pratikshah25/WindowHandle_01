package Tutorial_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameAssignment_01 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://praf002.github.io/");
		
		// using frame name
		driver.switchTo().frame("mobileFrame");
		
		// using frame id
		driver.switchTo().frame("showcheckbox");
		
		driver.findElement(By.xpath("//input[@name='Jenkins']")).click();
		
		// switch ti parent tag
		driver.switchTo().defaultContent();
		
		// using frame index
		driver.switchTo().frame(1);
		
		// frame WebElement
		WebElement frameWb = driver.findElement(By.xpath("//iframe[@name='toolframe']"));
		driver.switchTo().frame(frameWb);
		
		WebElement dropdownWb = driver.findElement(By.xpath("//select[@name='course']"));
		Select selDropdown = new Select(dropdownWb);
		selDropdown.selectByVisibleText("GitHub");
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}

/*
  Assignment 1

	- https://praf002.github.io/
	- select Jenkins checkbox
	- Select GitHub value from dropdown
	- Enter mobile number
	- Enter address
	- Enter Full Name
	- Click on Selenium Link

 */
