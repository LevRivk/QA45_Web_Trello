package manager;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AppManager {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
       driver.manage().window().maximize();
        // Закомментированный метод чтобы менять разрешение и размер окна. тип не максимайз а на свой заданный размер.
        //  Dimension d = new Dimension(300,1080);// там где 300 по ширине можно увеличить размер
        //Resize current window to the set dimension
        //driver.manage().window().setSize(d);
         }
         @AfterMethod
    public void tearDown(){
           //if (driver!=null)
          //  driver.quit();
         }
}
