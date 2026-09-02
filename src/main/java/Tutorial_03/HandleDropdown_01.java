package Tutorial_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown_01 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://copyright.gov.in/UserRegistration/frmNewUser.aspx");
		
		Thread.sleep(3000);
		
		WebElement titleWb = driver.findElement(By.xpath("//select[@name='ctl00$ContentPlaceHolder1$ddlTitle']"));
		Select selTitle = new Select(titleWb);
		selTitle.selectByVisibleText("Ms.");
		
		Thread.sleep(3000);
		
	
		WebElement countryWb = driver.findElement(By.xpath("//select[@name='ctl00$ContentPlaceHolder1$ddlCountry']"));
		Select selCountry = new Select(countryWb);
		selCountry.selectByIndex(80);
		
		Thread.sleep(3000);
		
		WebElement stateWb = driver.findElement(By.xpath("//select[@name='ctl00$ContentPlaceHolder1$ddlState']"));
		Select selState = new Select(stateWb);
		selState.selectByValue("3");
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
