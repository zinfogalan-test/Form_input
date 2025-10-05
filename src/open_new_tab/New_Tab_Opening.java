package open_new_tab;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class New_Tab_Opening {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://www.w3schools.com/html/html_forms.asp");
        driver.manage().window().maximize();
        
        WebElement subm = driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/form/input[3]"));
        subm.click();
        
        String parent = driver.getWindowHandle();
        Set<String> allwindows = driver.getWindowHandles();
        
		for (String i : allwindows) {
			if (!parent.equals(i)) {
				driver.switchTo().window(i);

			}
		}
		
        
    
        

       
     
 
    }
}
