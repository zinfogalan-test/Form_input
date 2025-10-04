package input_form;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='dateOfBirthInput']")));
       
        /*String  Month= driver.findElement(By.className("react-datepicker__month-select")).getText();
        String Year= driver.findElement(By.className("react-datepicker__year-select")).getText();
        
       
        while (!(Month.equals("June") && Year.equals("2026"))) {
            WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/button[2]"));
            nextButton.click();

	}
	WebElement date = driver
			.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[4]"));
	date.click();*/
        
        WebElement dateOfBirthField = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirthField.click();
        
        WebElement DrpDownMonth = driver.findElement(By.className("react-datepicker__month-select"));
        
        Select selectMonth= new Select(DrpDownMonth);
        
        selectMonth.selectByVisibleText("June");
        
        WebElement DrpDownYear = driver.findElement(By.className("react-datepicker__year-select"));
        Select selctyear =new Select(DrpDownYear);
        
        selctyear.selectByVisibleText("2026");
        
        WebElement date =driver.findElement(By.xpath("//div[@class='react-datepicker__week']//div[text()='10']"));
        date.click();
        
        WebElement subjects= driver.findElement(By.id("subjectsInput"));
        subjects.sendKeys("English");
        subjects.sendKeys(Keys.ENTER);
        
        WebElement hobbies= driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label"));
        hobbies.click();
        
        WebElement uploadPicture = driver.findElement(By.xpath("//*[@id='uploadPicture']"));
        uploadPicture.sendKeys("C:\\Users\\User\\Pictures\\Screenshots\\Screenshot 2025-01-01 155827.png");

        WebElement currentAddress= driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Kozhikode, Kerala, India, 673571, Asia,");
        
        WebElement state= driver.findElement(By.id("react-select-3-input"));
        state.sendKeys("NCR");
        state.sendKeys(Keys.ENTER);
        
        WebElement city= driver.findElement(By.id("react-select-4-input"));
        city.sendKeys("Delhi");
        city.sendKeys(Keys.ENTER);
        
        WebElement submit= driver.findElement(By.id("submit"));
        submit.sendKeys(Keys.ENTER);
        
       
        
        
        
        
        	
        
        
        
        

        

}
	}
