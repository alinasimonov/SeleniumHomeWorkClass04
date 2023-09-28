package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
    //Navigate to http://35.175.58.98/basic-radiobutton-demo.php. Check if the "Female" radio button is displayed.
    //Click on the "Show Button". Check again if the "Female" radio button is displayed or not. Print the results of the checks to the console.
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        WebElement radioBtnFemale=driver.findElement(By.xpath("//input[@value='gender-female']"));
        boolean btnisDisplayedStatus = radioBtnFemale.isDisplayed();
        System.out.println("The female radio button is displayed " + btnisDisplayedStatus);
        WebElement showButton=driver.findElement(By.xpath("//button[@id='toggleRadioButtons']"));
        Thread.sleep(2000);
        showButton.click();
        Thread.sleep(2000);
        boolean status=radioBtnFemale.isDisplayed();
        System.out.println("The female radio  button is displayed "+status);
        driver.close();
    }
}
