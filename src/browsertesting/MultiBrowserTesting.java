package browsertesting;
/**
 * Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MultiBrowserTesting {

    public static void main(String[] args) throws InterruptedException {

        //Step 1: Setup Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        //Step 2: Open URL
        String baseURL = " https://courses.ultimateqa.com/";
        driver.get(baseURL);
        Thread.sleep(5000);
        //Step 3: Print the title of the page
        System.out.println("Title of the page: " + driver.getTitle());
        //Step 4: Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //Step 5: Print the page source
        System.out.println("Page Source: " + driver.getPageSource());
        //Step 6: Click on 'Sign in' link
        WebElement signInLink = driver.findElement(By.xpath("//a[normalize-space()='Sign In']"));
        signInLink.click();
        //Step 7: Print the current URL
        System.out.println("Current URL after clicking Sign in: " + driver.getCurrentUrl());
        //Step 8: Enter email to email field
        WebElement emailField = driver.findElement(By.xpath("//button[@type='submit']"));
        emailField.sendKeys("prime@gmail.com");
        //Step 9: Enter password to password field
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("123456");
        //Step 10: Click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        //Step 11: Navigate to BaseURL
        driver.navigate().to(baseURL);
        //Step 12: Navigate forward to Homepage
        driver.navigate().forward();
        //Step 13: Navigate back to baseURL
        driver.navigate().back();
        //Step 14: Refresh the page
        driver.navigate().refresh();
        //Step 15: Close the browser
        driver.quit();

    }
}
