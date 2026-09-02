package Tutorial_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/mainFrame.html");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Pratiksha");
		
		// driver.switchTo().frame(0);
		
		// driver.switchTo().frame("mainframe");
		
		WebElement framewb = driver.findElement(By.xpath("//iframe[@src='/subFrame.html']"));
		
		driver.switchTo().frame(framewb);
		
		driver.findElement(By.id("Cucumber")).click();
	}

}
