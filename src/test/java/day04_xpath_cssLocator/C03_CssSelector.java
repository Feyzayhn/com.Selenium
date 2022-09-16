package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) {

        // 1-) Bir class olusturun : Locators_css
        // 2-) Main method olusturun
        // a. Verilen web sayfasina gidin. http://a.testaddressbook.com/sign_in
        // b. Locate email textbox
        // c. Locate password textbox ve
        // d. Locate signin button
        // e. Asagidaki kullanici adini ve sifreyi girin ve sign in dügmesini tiklayin

           // i. Usarname : testtechproed@gmail.com
           // ii. Password : Test1234!


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a. Verilen web sayfasina gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        // b. Locate email textbox
        WebElement mailTextBox =driver.findElement(By.cssSelector("input[type='email']"));

        // c. Locate password textbox ve
        WebElement passwordTextBox=driver.findElement(By.cssSelector("#session_password")); // id ile aldigimiz icin bu  # isaret yetti

        // d. Locate signin button
        WebElement signInButton=driver.findElement(By.cssSelector("input[type='submit']"));

        mailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButton.click();

        driver.close();
    }
}
