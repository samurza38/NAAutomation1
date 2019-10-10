import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    public WebDriver invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Abi Auto\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver sami=new ChromeDriver();
        return sami;
    }
}
