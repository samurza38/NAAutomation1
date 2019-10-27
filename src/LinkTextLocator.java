import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
    public static WebDriver sami;
    public static void main(String[] args) throws InterruptedException {
        String expectedValue="Sizin İçin Buradayız!";
        invokeChromeBrowser();
        sami.manage().window().maximize();
        sami.get("http://www.flypgs.com");
        sami.findElement(By.xpath("//*[@id='divHeaderCurrency']/div/div/div/div[1]/ul/li[5]/a")).click();
        Thread.sleep(3000);
        sami.findElement(By.linkText("BİZE YAZIN")).click();
        Thread.sleep(5000);
        System.out.println("Validation"+isTextTrue(expectedValue));

    }
    public static void invokeChromeBrowser()

    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Abi Auto\\Downloads\\chromedriver_win32\\chromedriver.exe");
        sami = new ChromeDriver();
    }
    public static boolean isTextTrue(String expectedValue){
        String resultValue=sami.findElement(By.xpath("//*[@id='sf-recase-query']/h2")).getText();
        return resultValue.equals(expectedValue);
    }


}
