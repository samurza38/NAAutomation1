import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MouseOverAction {

    public static void main(String[]args){
        Browser myBrowser =new Browser();
        WebDriver driver =myBrowser.invokeChromeBrowser();
        driver.get("http://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Actions MyMouse=new Actions(driver);
        MyMouse.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-accountList']/spam[2]"))).build().perform();
        MyMouse.click();
    }
}
