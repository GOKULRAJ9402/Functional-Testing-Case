package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTestingCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.dealsdray.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[contains(@class,'MuiOutlinedInput-input MuiInputBase-input')])[1]")).sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@class,'MuiOutlinedInput-input MuiInputBase-input')])[2]")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//button[contains(@class,'MuiButton-root MuiButton-contained')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root has-submenu')]")).click();
		driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root css-1hytwp4'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'MuiButton-root MuiButton-contained')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'MuiOutlinedInput-input MuiInputBase-input')]")).sendKeys("D:\\Download\\demo-data.xlsx");
		driver.findElement(By.xpath("(//button[contains(@class,'MuiButton-root MuiButton-contained')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(@class,'MuiButton-root MuiButton-contained')])[2]")).click();
		Thread.sleep(3000);
		driver.quit();



	}

}
