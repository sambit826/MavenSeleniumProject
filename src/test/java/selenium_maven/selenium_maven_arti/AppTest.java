package selenium_maven.selenium_maven_arti;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	WebDriver driver  = new ChromeDriver();
    	System.out.println("Chrome browser launched");
    	driver.get("https://www.google.com");
        assertTrue( true );
    }
}
