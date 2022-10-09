package week2.day;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChrmBrowsr {
	public static void main(String[] args) {
 		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("MURALI");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("THARAN");
		driver.findElement(By.name("submitButton")).click();
		String tittle=driver.getTitle();
	    System.out.println(tittle);
}}

	

