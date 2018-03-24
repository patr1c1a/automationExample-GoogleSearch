package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Screenshot {
    public static void capture(WebDriver driver, String screenshotName) {
        try {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            BufferedImage bufferedImage = ImageIO.read(source);
            ImageIO.write(bufferedImage, "jpg", new File("./target/"+ screenshotName + ".jpg"));
        } catch (Exception e) {
            System.out.println("Screenshot not saved: " + e.getMessage());
        }
    }
}