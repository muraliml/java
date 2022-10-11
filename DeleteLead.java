package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead{
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver El=new ChromeDriver();
		El.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		El.get("http://leaftaps.com/opentaps/control/main");
		El.manage().window().maximize();
		El.findElement(By.id("username")).sendKeys("demosalesManager");
		El.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		El.findElement(By.className("decorativeSubmit")).click();
		El.findElement(By.linkText("CRM/SFA")).click();
		El.findElement(By.linkText("Leads")).click();
		El.findElement(By.xpath("//a[text()='Find Leads']")).click();
		El.findElement(By.linkText("Phone")).click();
		
		El.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		
		El.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");

		El.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("4");
		El.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8056747757");
		El.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		El.findElement(By.xpath("//a[text()='11358']")).click();
	
		El.findElement(By.xpath("//a[text()='Delete']")).click();
		
		El.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		El.findElement(By.xpath("//input[@name='id']")).sendKeys("11358");
		El.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		
	}}
