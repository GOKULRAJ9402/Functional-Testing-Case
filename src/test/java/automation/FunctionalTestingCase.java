package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTestingCase {

	public static void main(String[] args) throws InterruptedException {
		// Initialize the ChromeDriver
		WebDriver driver=new ChromeDriver();
		  // Navigate to the website and maximize the window
		driver.get("https://demo.dealsdray.com/");
		driver.manage().window().maximize();
		// Enter email in the first input field
		driver.findElement(By.xpath("(//input[contains(@class,'MuiOutlinedInput-input MuiInputBase-input')])[1]")).sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(2000);
		// Enter password in the second input field
		driver.findElement(By.xpath("(//input[contains(@class,'MuiOutlinedInput-input MuiInputBase-input')])[2]")).sendKeys("prexo.mis@dealsdray.com");
		// Click the login button
		driver.findElement(By.xpath("//button[contains(@class,'MuiButton-root MuiButton-contained')]")).click();
		Thread.sleep(2000);
		// Click on a menu button (simulating a navigation step)
		driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root has-submenu')]")).click();
		// Click on a submenu item
		driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root css-1hytwp4'])[2]")).click();
		Thread.sleep(2000);
		// Simulate clicking a button (likely to initiate a file upload or another action)
		driver.findElement(By.xpath("//button[contains(@class,'MuiButton-root MuiButton-contained')]")).click();
		Thread.sleep(2000);
		// Enter file path in the input field for file upload
		driver.findElement(By.xpath("//input[contains(@class,'MuiOutlinedInput-input MuiInputBase-input')]")).sendKeys("D:\\Download\\demo-data.xlsx");
		// Click the next button
		driver.findElement(By.xpath("(//button[contains(@class,'MuiButton-root MuiButton-contained')])[2]")).click();
		Thread.sleep(2000);
		// Click the next button again (likely to confirm or proceed)
		driver.findElement(By.xpath("(//button[contains(@class,'MuiButton-root MuiButton-contained')])[2]")).click();
		Thread.sleep(3000);
		// Close the browser
		driver.quit();



	}

}
