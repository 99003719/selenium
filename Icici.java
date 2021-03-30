import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {
	public static void main(String[] args) {
		System.out.println("welcome to selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\test.DESKTOP-FVNA02O\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://loan.icicibank.com/asset-portal-all/check-eligibility?loanType=al&WT.mc_id=Desk_OAPN_cms_cl_index_btn_applynow");
		driver.findElement(By.id("carRelbtn")).click();//Select type of loan
		driver.findElement(By.linkText("Used Car Loan")).click();
		driver.findElement(By.id("MOBILENUM")).sendKeys("9999955555");
		driver.findElement(By.id("CUSTFIRSTNAME")).sendKeys("Aishwarya");
		driver.findElement(By.id("CUSTLASTNAME")).sendKeys("K.H");
		driver.findElement(By.id("CUSTCOMMUCITY")).sendKeys("MYSORE");
		driver.findElement(By.id("residancespan")).click();
		driver.findElement(By.linkText("Company Provided")).click();
		driver.findElement(By.id("yrspan_mvce")).click();
		driver.findElement(By.linkText("2021")).click();
		driver.findElement(By.id("mnthspan")).click();
		driver.findElement(By.linkText("Nov")).click();
		driver.findElement(By.id("DATEOFBIRTH")).sendKeys("10-12-1997");
		driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys("INNOVA");
		driver.findElement(By.id("CITY_NAME")).sendKeys("MYSORE");
		driver.findElement(By.id("IDV")).sendKeys("XXX");
		driver.findElement(By.id("NOV_totalworkexp")).click();
		driver.findElement(By.linkText("2")).click();
		driver.findElement(By.id("selSalspan")).click();
		driver.findElement(By.linkText("Self Employed")).click();
		}
}
