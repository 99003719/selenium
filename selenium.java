import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicDemo {

	
        
        //Login Page
		/*driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    Thread.sleep(2000);
		driver.findElement(By.className("at4-close")).click();
	    Thread.sleep(2000);*/
        
        
        
        //Forms page with xpath implementation
	/*	driver.findElement(By.xpath("//*[text()='Input Forms']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[text()='Simple Form Demo']")).click();
	     driver.findElement(By.linkText("/selenium-tutorials")).click();
		driver.findElement(By.xpath("//*[text()='Selenium with Java']")).click();*/
        
        
        
        //Drop Down
//		Select dd = new Select(driver.findElement(By.id("select-demo")));
//		dd.selectByVisibleText("Sunday");
//		Thread.sleep(2000);
//		dd.selectByValue("Friday");
//		Thread.sleep(2000);
//		dd.selectByIndex(3);
//		Thread.sleep(2000);
        
        
//		Multiple Drop Down
//		Select dd1 = new Select(driver.findElement(By.id("multi-select")));
//		dd1.selectByValue("California");
//		Thread.sleep(2000);
//		driver.findElement(By.id("printMe")).click();
//		Thread.sleep(2000);
//		dd1.selectByValue("Pennsylvania");
//		Thread.sleep(2000);
//		driver.findElement(By.id("printMe")).click();
//		Thread.sleep(2000);
		
	}
}
	
	
	
public static void main(String[] args) {

		System.out.println("--------Selenium----------");

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\test.DESKTOP-FVNA02O\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver b = new ChromeDriver();

		

		b.get("https://www.facebook.com/campaign/landing.php?&campaign_id=973072061&extra_1=s%7Cc%7C231348943369%7Ce%7Cfacebook%7C&placement=&creative=231348943369&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D1007773%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIvavltZnQ7wIVVaaWCh2s1wUeEAAYASAAEgLY5_D_BwE ");

		

		b.findElement(By.className("_8esa")).click();
		//b.getelement(By.className("inputtext_58mg_50dba_2ph-"))
		b.findElement(By.name("firstname")).sendKeys("aish" );
		b.findElement(By.name("lastname")).sendKeys("kh");
		b.findElement(By.name("reg_email__")).sendKeys("99999");
		b.findElement(By.name("reg_passwd__")).sendKeys("xxxxx");
		Select dd=new Select(b.findElement(By.id("day")));
		dd.selectByIndex(1);
	
        Select dd1=new Select(b.findElement(By.id("month")));
		dd1.selectByIndex(1);
	
		Select dd2=new Select(b.findElement(By.id("year")));
		dd2.selectByIndex(1);




	
