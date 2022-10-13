package MARATHON;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver fb=new ChromeDriver();
		fb.get("https://www.amazon.in/");
		fb.manage().window().maximize();
		fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		fb.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		
		fb.findElement(By.id("twotabsearchtextbox")).sendKeys("for boys");
		
		fb.findElement(By.id("nav-search-submit-button")).click();
		String searches = fb.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[text()='1-48 of over 30,000 results for']")).getText();
		System.out.println(searches);
	
		fb.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		fb.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		
		fb.findElement(By.id("nav-search-submit-button")).click();
		String search = fb.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]")).getText();
		System.out.println(search);
		
		fb.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		fb.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();

		String baginfo = fb.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-colo')])[2]")).getText();
		System.out.println(baginfo);
		
		String discnt = fb.findElement(By.xpath("//span[contains(@class,'a-price-whole')]")).getText();
		System.out.println(discnt);
	}
	
	}
