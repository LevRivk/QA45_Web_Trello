package pages;

import manager.AppManager;
import org.openqa.selenium.WebDriver;

public class BasePage extends AppManager {
    static WebDriver driver;
    public static void setDriver(WebDriver wd){
        driver = wd;
    }

    public void pause(int time){
        try {
            Thread.sleep(time*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
