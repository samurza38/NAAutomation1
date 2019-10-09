import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
    public static WebDriver sami;
    public static void main(String[] args){
        invokeChromeBrowser();
        sami.get("http://www.facebook.com");
        sami.findElement(By.name("firstname")).sendKeys("Sami");
        sami.findElement(By.name("lastname")).sendKeys("Mirzo");

    }
    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Abi Auto\\Downloads\\chromedriver_win32\\chromedriver.exe");
        sami=new ChromeDriver();
    }
}
