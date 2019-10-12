import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PositiveTicketTC {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.facebook.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sami@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pwd");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='email']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@type,'ema')]")).sendKeys("contains ema");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@type,'ema')]")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[starts-with(@type,'ema')]")).sendKeys("starts with ema");


        //this is browser method
        // public WebDriver invokeChromeBrowser(){
        //   System.setProperty("webdriver.chrome.driver","C:\\Users\\Abi Auto\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //   WebDriver sami=new ChromeDriver();
        //    return sami;

    }

}


