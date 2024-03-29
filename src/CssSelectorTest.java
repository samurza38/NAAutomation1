import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CssSelectorTest {
    public static void main(String[]args) throws InterruptedException {
        Browser myBrowser =new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.amazon.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#twotabsearchtextbox[type='text']")).sendKeys("computers");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input.nav-input[type='submit']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#twotabsearchtextbox[type='text']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("books");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input.nav-input")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).clear();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".nav-a")).click();

    }


}
