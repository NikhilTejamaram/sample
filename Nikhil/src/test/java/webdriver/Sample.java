package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	

		@Test
		public void testingbutton() throws InterruptedException {
			
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\maram\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver b1;
		b1=new ChromeDriver();
		Thread.sleep(2000);
		b1.get("http://leafground.com/");
		b1.findElement(By.linkText("Button")).click();
		b1.findElement(By.id("position")).click();
		b1.findElement(By.id("home")).click();
		b1.findElement(By.linkText("Button")).click();
		b1.findElement(By.id("color")).click();
		b1.findElement(By.id("home")).click();
		b1.findElement(By.linkText("Button")).click();
		b1.findElement(By.id("home")).click();
		b1.findElement(By.linkText("Button")).click();
		b1.findElement(By.id("size")).click();
		b1.findElement(By.id("home")).click();
		b1.close();

}
}
