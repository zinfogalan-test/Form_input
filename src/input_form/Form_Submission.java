package input_form;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Submission {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement firstName= driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		firstName.sendKeys("John");
		
		WebElement SecondName= driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		SecondName.sendKeys("Kennady");
		
		WebElement email= driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
		email.sendKeys("Jhon123@gmail.com");
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
        gender.click();
        
        WebElement mobileNumber= driver.findElement(By.xpath("//*[@id=\"userNumber\"]"));
        mobileNumber.sendKeys("9876543210");
		
	

	}

}
