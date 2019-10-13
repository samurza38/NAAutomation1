import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CssSelectorId {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        driver.findElement(By.cssSelector("input#package-origin-hp-package")).sendKeys("Atlanta");
        for(int i=0; i<4;i++) {
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
        }
        Thread.sleep(1000);
            driver.findElement(By.cssSelector("#package-origin-hp-package")).sendKeys(Keys.ENTER);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("input#package-destination-hp-package")).sendKeys("Las Vegas");
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("input#package-destination-hp-package")).sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("input#package-destination-hp-package")).sendKeys(Keys.ENTER);
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input#package-departing-hp-package")).sendKeys("11/27/2019");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#package-returning-hp-package")).sendKeys("11/30/2019");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input#partialHotelBooking-hp-package")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#package-checkin-hp-package")).sendKeys("11/27/2019");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input#package-checkout-hp-package")).sendKeys("11/30/2019 ");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("select#package-advanced-preferred-class-hp-package")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("select#package-advanced-preferred-class-hp-package")).sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("select#package-advanced-preferred-class-hp-package")).sendKeys(Keys.ENTER);
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("button#search-button-hp-package")).click();



    }
}
