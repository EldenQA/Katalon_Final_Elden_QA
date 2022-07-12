import org.apache.commons.io.FileUtils
import org.openqa.selenium.OutputType
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver


public class ScreenShot{
	
	

	public static void getScreenShot()
	{
	ChromeDriver driver = new ChromeDriver();
		File f = driver.getScreenshotAs(OutputType.FILE)
		FileUtils.copyFile(f, new File('ScreenShots' + System.currentTimeMillis()+ '.jpg' ))
		
	}
	
	
	
	
	
	
	
}