package Utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.appium.java_client.android.AndroidDriver;

import org.apache.commons.io.FileUtils;

public class ScreenShotutility extends base {
	
	public static String ScreenShotutilits(String imgName, AndroidDriver driver) throws IOException {
		/*String dateName = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(src, new File("D:\\ScreenShots\\"+imgName+".png"));

return imgName;*/

        TakesScreenshot ts = (TakesScreenshot)driver;
        
        
        File source = ts.getScreenshotAs(OutputType.FILE);
        
        String dest = System.getProperty("user.dir") +""+imgName+".png";
        
        File destination = new File(dest);
        
        FileUtils.copyFile(source, destination);        
                     
        return dest;
	}
}
