import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Basics{
@BeforeClass
public void main() {
System.out.println("Before");
}
@AfterClass
public void after()
{
System.out.println("After-Method");
}
@Test
public void a()
{
System.out.println("A");
}
@Test
public void b()
{
System.out.println("B");
}
@Test
public void c()
{
System.out.println("C");
}
}