package Tutorial_03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopup_01 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		//xpath for 4th click button  //button[text()='Click me']/ancestor::div[@id='javascriptAlertsWrapper']/descendant::button[@id='promtButton']
		driver.findElement(By.xpath("//div[@id='javascriptAlertsWrapper']/descendant::button[@id='promtButton']")).click();
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		alt.sendKeys("Pratiksha is automation test engineer");
		
		String actualText = alt.getText();
		System.out.println(actualText);
		
		Thread.sleep(2000);
		
		alt.accept();
		
		Thread.sleep(2000);
	}

}
