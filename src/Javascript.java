import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Javascript {
    public static  void main(String[] args) throws InterruptedException {
        Browser myBrowser =new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='button']")).click();
        Thread.sleep(2000);
        String expectedValue="Are you sure you want to give us the deed to your house?";
        if (1==1){
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
        }



    }
}
