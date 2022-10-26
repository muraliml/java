package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frm {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver fb=new ChromeDriver();
		fb.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		fb.manage().window().maximize();
		fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		fb.switchTo().frame(fb.findElement(By.xpath("//iframe[@id='iframeResult']")));
		fb.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert=fb.switchTo().alert();
		alert.accept();
//	 String	text=alert.getText();
//	 System.out.println(text);

	}

}
