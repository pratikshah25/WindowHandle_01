package Tutorial_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleFrame_Assignment_01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://praf002.github.io/");
		
		driver.switchTo().frame("mobileFrame");
		
		
		// using frame id
		driver.switchTo().frame("showcheckbox");
		
		driver.findElement(By.xpath("//input[@name='Jenkins']")).click();
		
		// switch focus to main frame
		driver.switchTo().defaultContent();
		
		// using frame WebElement
		WebElement frameWb = driver.findElement(By.xpath("//iframe[@name='addressframe']"));
		driver.switchTo().frame(frameWb);
		
		driver.switchTo().frame("toolframe");
		
		// handle drop down
		WebElement dpWb = driver.findElement(By.xpath("//select[@name='course']"));
		Select dpSel = new Select(dpWb);
		dpSel.selectByVisibleText("GitHub");
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("mobileFrame");
		driver.findElement(By.xpath("//input[@name='mob']")).sendKeys("9845125412");
		
		
		
		
		

	}

}
