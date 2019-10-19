import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton {
    public static void main(String[]args) throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        Thread.sleep(2000);
       /* driver.findElement(By.cssSelector("input[value='Milk']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Butter']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Cheese']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Milk']")).click(); */
       int count=driver.findElements(By.cssSelector("input[type='radio']")).size();
        System.out.println("the number of radio button in group1 is :" + count);
        for (int i=0;i<count; i++){
            driver.findElements(By.cssSelector("input[type='radio']")).get(i).click();
            Thread.sleep(2000);
        }


    }
}
