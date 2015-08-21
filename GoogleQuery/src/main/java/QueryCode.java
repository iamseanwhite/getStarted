/**
 * Created by iamseanwhite on 8/20/2015.
 */

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QueryCode  {
    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter what you would like to search for...");
        String search = in.nextLine();
        System.out.println("Opening Google to search for that...");

        WebDriver driver = new FirefoxDriver();                     // new instance of the Firefox driver
        driver.get("http://www.google.com");                        // navigate to Google
        WebElement element = driver.findElement(By.name("q"));      // search field
        element.sendKeys(search);                                   // enter something to search for
        element.submit();                                           // submit

        Thread.sleep(1000);                                         // to ensure result stats have loaded

        System.out.println("You had " + driver.findElement(By.id("resultStats")).getText().toLowerCase());     //print results stats in lowercase
        System.out.println("Cool, huh?");

        //driver.quit();                                            //close the browser if you prefer such things
    }
}