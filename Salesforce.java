package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver fb=new ChromeDriver();
		fb.get("https://login.salesforce.com/");		
		fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		fb.manage().window().maximize();
		fb.findElement(By.xpath("//input[@name='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		fb.findElement(By.xpath("//input[@name='pw']")).sendKeys("Password#123");
		fb.findElement(By.xpath("//input[@name='Login']")).click();
		fb.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> w=fb.getWindowHandles();
		List<String> window=new ArrayList<String>(w);
		 fb.switchTo().window(window.get(1));
		 fb.findElement(By.xpath("//button[text()='Confirm']")).click();
		 fb.switchTo().window(window.get(0));
		 System.out.println(fb.getTitle());
		 fb.quit();
		}

}
