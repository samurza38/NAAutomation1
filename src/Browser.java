import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Browser {
    public WebDriver invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Abi Auto\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver sami=new ChromeDriver();
        return sami;
    }
    public  WebDriver invokeOperaBrowser(){
        System.setProperty("webdriver.opera.driver","C:\\Users\\Abi Auto\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\opera.exe");
        WebDriver sami=new OperaDriver();
        return sami;

    }
}
