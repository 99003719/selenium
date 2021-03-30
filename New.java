import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class New
{

	public static void main(String[] args) 
	{
		System.out.println("welcome to selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test.DESKTOP-FVNA02O\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/maintenance/purgeEmployee");
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList");
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	   //	driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.id("confirm_password")).sendKeys("admin123");
//...........leave..........		
		//driver.findElement(By.id("menu_leave_applyLeave")).click();
		//WebElement ele=driver.findElement(By.linkText("Leave"));

		//Actions act= new Actions(driver);

		//act.moveToElement(ele).build().perform();
//.........entitlement........
		
		WebElement ele1=driver.findElement(By.linkText("Entitlements"));

		Actions act1= new Actions(driver);

		act1.moveToElement(ele1).build().perform();
		
		driver.findElement(By.id("menu_leave_Entitlements")).click();/
		driver.get("https://emicalculator.net");
		driver.findElement(By.id("loanamount")).sendKeys("1000");
		driver.findElement(By.id("loaninterest")).sendKeys("5");
		driver.findElement(By.id("loanterm")).sendKeys("35");
		
		
		
		
