package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		
		El.findElement(By.xpath("//input[@name='firstName']/following::input[28]")).sendKeys("murali");
		
		
		El.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		
		
		El.findElement(By.xpath("//a[text()='11358']")).click();


		String title=El.getTitle();
	    System.out.println(title);
	
		El.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		
		El.findElement(By.className("inputBox")).clear();
		
		El.findElement(By.className("inputBox")).sendKeys("tele");
		
		El.findElement(By.name("submitButton")).click();
	   
		 System.out.println("The company name is changed ");
	}

	
		
	}


