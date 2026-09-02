package Tutorial_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_01 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_myh38910b_e&adgrpid=1324913121555467&hvadid=82807403493887&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=148738&hvtargid=kwd-82807957656483:loc-90&hydadcr=5620_2502671&mcid=bf83b4991e2f3eb79d07c8f0ac1b5488&msclkid=e2cacbaa153b16d34108a1249de8b16a");
		
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		driver.navigate().to("https://www.redbus.in/");
		String redBusActualTitle = driver.getTitle();
		System.out.println(redBusActualTitle);
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		String amazonActualUrl = driver.getCurrentUrl();
		System.out.println(amazonActualUrl);
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		String redBusActualUrl = driver.getCurrentUrl();
		System.out.println(redBusActualUrl);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}

/*
 * Req:
	- Open amazon URL
			-  maximize browser
			- capture title and print	

	- Navigate to redbus URL
			- capture title and print on console.

	- Navigate back
			- capture url and print in console

	- Navigate forward
			- capture url and print in console

	- Refresh page
	
	- close window
 */
