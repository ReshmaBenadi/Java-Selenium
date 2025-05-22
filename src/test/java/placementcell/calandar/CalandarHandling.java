package placementcell.calandar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalandarHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://campus.sicsglobal.co.in/Project/placementcell");
		 Thread.sleep(4000);
			
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/header/div/nav/div/ul/li[3]/a")).click();
			driver.findElement(By.xpath("/html/body/div/section[1]/div[2]/div/div[2]/form/div[1]/input")).sendKeys("00001");
			WebElement user = driver.findElement(By.xpath("/html/body/div/section[1]/div[2]/div/div[2]/form/div[2]/select"));
			Select a=new Select(user);                     
			a.selectByIndex(1);
			driver.findElement(By.xpath("/html/body/div/section[1]/div[2]/div/div[2]/form/div[3]/input")).sendKeys("Bsc/C5/2022-2025");
			driver.findElement(By.xpath("/html/body/div/section[1]/div[2]/div/div[2]/form/div[4]/input")).sendKeys("2005");
			driver.findElement(By.xpath("/html/body/div/section[1]/div[2]/div/div[2]/form/div[5]/input")).sendKeys("Anu");
			//String date="2024-Aug-15";
			
			//Java script code 
		//WebElement dateInput =driver.findElement(By.xpath("/html/body/div/section[1]/div[2]/div/div[2]/form/div[6]/input"));
			/*JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '1990-08-12';", dateInput);
			

	        // Optional: Verify the date was set correctly
	        String selectedDate = dateInput.getAttribute("value");
	        System.out.println("Selected Date: " + selectedDate);*/
			//Not working
			/*dateInput.click(); // Open the date picker
			 Thread.sleep(2000); 
			// Navigate through the calendar using keyboard keys
			dateInput.sendKeys(Keys.ARROW_DOWN); // Move down (change month or select a day)
			dateInput.sendKeys(Keys.ENTER); 
			dateInput.sendKeys(Keys.ARROW_LEFT);*/
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dateInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/section[1]/div[2]/div/div[2]/form/div[6]/input")));
		dateInput.click();
		 dateInput.sendKeys("19-08-1220");
	        
	        
			/*WebElement user1 = driver.findElement(By.xpath("/html/body/div/section[1]/div[2]/div/div[2]/form/div[6]/input"));
			Select a1=new Select(user1);                     
			a1.selectByIndex(0);*/
			driver.findElement(By.xpath("/html/body/div/section[1]/div[2]/div/div[2]/form/div[7]/input")).sendKeys("9546878733");
			driver.findElement(By.xpath("/html/body/div/section[1]/div[2]/div/div[2]/form/div[8]/input[1]")).click();
			driver.findElement(By.xpath("/html/body/div/section[1]/div[2]/div/div[2]/form/div[9]/input")).sendKeys("anu@gmail.com");
			driver.findElement(By.xpath("/html/body/div/section[1]/div[2]/div/div[2]/form/div[10]/input")).sendKeys("Technopark;kazhaakuttam");
			driver.findElement(By.xpath("/html/body/div/section[1]/div[2]/div/div[2]/form/div[11]/input")).sendKeys("1234567");
		//	driver.findElement(By.xpath("/html/body/div/section[1]/div[2]/div/div[2]/form/div[14]/input[1]")).click();
driver.findElement(By.xpath("/html/body/div/section[1]/div[2]/div/div[2]/form/div[12]/input")).sendKeys("C:\\\\Users\\\\DELL\\\\Downloads\\\\img.jpeg");
	    driver.findElement(By.xpath("/html/body/div/section[1]/div[2]/div/div[2]/form/div[13]/input")).sendKeys("C:\\Users\\DELL\\Downloads\\img.jpeg");
	    driver.findElement(By.xpath("/html/body/div/section[1]/div[2]/div/div[2]/form/div[14]/input[1]")).click();

	}

}
