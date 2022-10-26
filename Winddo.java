package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Winddo {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver fb=new ChromeDriver();
		fb.get("https://www.irctc.co.in/");
		
		fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		fb.manage().window().maximize();
		fb.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		fb.getTitle();
		fb.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> w=fb.getWindowHandles();
        System.out.println(fb.getTitle());
        List<String> window=new ArrayList<String>(w);
        fb.switchTo().window(window.get(1));
        System.out.println(fb.getTitle());
        fb.findElement(By.xpath("//button[text()='Later']")).click();
        fb.close();
        fb.switchTo().window(window.get(0));
        System.out.println(fb.getTitle());
}}
