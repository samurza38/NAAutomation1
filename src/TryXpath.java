import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TryXpath {
    public static void main(String[]args) throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.skyscanner.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
