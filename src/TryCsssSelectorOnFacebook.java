import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TryCsssSelectorOnFacebook {
    public static void main(String[]args) throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.facebook.com");
        driver.findElement(By.cssSelector("input#email")).sendKeys("sami@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#pass")).sendKeys("pww");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#email")).clear();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#pass")).clear();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Forgot account?']")).click();
    }
}
