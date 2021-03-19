package Utils;

import Driver.Web;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Helper {



    public static void pause(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void doPrintScreen(String fname) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) Web.getDriver();
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("./ScreenShots/"+fname+".png");
        FileUtils.copyFile(src, dest);


    }


}
