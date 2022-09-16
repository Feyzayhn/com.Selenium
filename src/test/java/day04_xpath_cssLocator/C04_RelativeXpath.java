package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C04_RelativeXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        WebElement bostonWE=driver.findElement(By.id("pid6_thumb"));
        WebElement sailorWE=driver.findElement(By.id("pid11_thumb"));
        WebElement mountieWE=driver.findElement(RelativeLocator.with(By.tagName("img")) // tagName bildigimiz bir urun girdik ve ariyoruz
                .below(bostonWE).toLeftOf(sailorWE));
        // below altinda // toLeftOf solunda
        System.out.println(mountieWE.getAttribute("id")); //pid10_thumb

        /*
        NOT : COK KULLANILAN BIR OZELLIK DEGIL SELENIUM4 ILE CIKTI
              LOCATE EDEMEDIMIZ BIR DURUM OLDUGUNDA ŞUNUN ALTINDA BUNUN SAGINDA SOLUNDA GIBI
              YONLENDIRMELERLE YAPABILIRIZ
         */



    }
}
