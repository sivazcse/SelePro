package readFile;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoRead {
	@Test
	public void getPageSource() throws InterruptedException, MalformedURLException
	{
		WebDriver driver = new ChromeDriver();
		//DesiredCapabilities capa = DesiredCapabilities.chrome();
		
		//driver = new RemoteWebDriver(new URL("http://localhost:32769/wd/hub"), capa);
		
        driver.get("https://lakebacorp-my.sharepoint.com/personal/s_ramasamy_lakeba_com/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fs_ramasamy_lakeba_com%2FDocuments%2FSixUploads");		
		Thread.sleep(8000);
		driver.findElement(By.id("i0116")).sendKeys("s.ramasamy@lakeba.com");
		Thread.sleep(5000);
        driver.findElement(By.id("idSIButton9")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("i0118")).sendKeys("8807628952cseB");
		Thread.sleep(5000);
        driver.findElement(By.id("idSIButton9")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("idBtn_Back")).click();
        Thread.sleep(8000);
	}
	@Test
	public void getPageSource1() throws InterruptedException, MalformedURLException
	{
		WebDriver driver;
		DesiredCapabilities capa = DesiredCapabilities.firefox();
		
		driver = new RemoteWebDriver(new URL("http://localhost:32769/wd/hub"), capa);
		
        driver.get("https://lakebacorp-my.sharepoint.com/personal/s_ramasamy_lakeba_com/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fs_ramasamy_lakeba_com%2FDocuments%2FSixUploads");		
		Thread.sleep(8000);
		driver.findElement(By.id("i0116")).sendKeys("s.ramasamy@lakeba.com");
		Thread.sleep(5000);
        driver.findElement(By.id("idSIButton9")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("i0118")).sendKeys("8807628952cseB");
		Thread.sleep(5000);
        driver.findElement(By.id("idSIButton9")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("idBtn_Back")).click();
        Thread.sleep(8000);
	}
}
