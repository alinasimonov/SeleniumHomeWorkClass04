package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWork1 {
    //Navigate to http://35.175.58.98/basic-checkbox-demo.php. Check the if Checkbox1 is enabled.If Checkbox1 is disabled:
    //Click on the "enable checkboxes" button. Verify that Checkbox1 is now enabled. Click on Checkbox1. Confirm that Checkbox1 is selected. (edited)
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='Checkbox-1']"));
        boolean selectState = checkbox1.isEnabled();
        if (selectState) {
            System.out.println("The checkbox1 is Enable");
        } else {
            WebElement EnableBtn = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
            Thread.sleep(2000);
            EnableBtn.click();
            Thread.sleep(2000);
            System.out.println("The checkbox1 is now Enabled");
        }
        Thread.sleep(2000);
        checkbox1.click();
        Thread.sleep(2000);
        boolean select=checkbox1.isSelected();
        System.out.println("CheckBox1 is selected "+select);
        driver.close();

    }


            }

