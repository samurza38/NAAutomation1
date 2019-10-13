import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TryCsssSelectorOnFacebook {
    public static void main(String[]args){
        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.facebook.com");
        driver.findElement(By.cssSelector("input#email")).sendKeys("sami@gmail.com");
    }
}
