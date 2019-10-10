import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
    static WebDriver sami;
    public static void main(String[]args) throws InterruptedException {
        InvokeChromeBrowser();
        sami.get("https://www.turkishairlines.com/");
        Thread.sleep(3000);
        sami.findElement(By.className("thyHeaderLink")).click();

    }


    public static void InvokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Abi Auto\\Downloads\\chromedriver_win32\\chromedriver.exe");
        sami=new ChromeDriver();
    }
}
