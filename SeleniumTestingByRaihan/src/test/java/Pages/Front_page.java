package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Front_page {
	
	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.nexchar.com/");
		//driver.findElement(By.xpath("1")).click();
		driver.findElement(By.linkText("Privacy Policy")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Terms of Use")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Contact")).click();
		
		
	}

}
