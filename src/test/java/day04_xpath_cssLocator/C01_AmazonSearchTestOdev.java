package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearchTestOdev {
    /*
    a. google web sayfasina gidin https://wwww.amazon.com
    b. Search(ara) "city bike"
    c. Amazon'da goruntulenen ilgili sonuclarin dayisini yazdirin
    d. Sonra karsiniza cikan ilk sonucun resmine tiklayin

     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a. google web sayfasina gidin https://wwww.amazon.com
        driver.get("https://www.amazon.com");

        //  b. Search(ara) "city bike"
           // NOT : arama yapabilmemiz icin arama cubugunu locate etmemiz gerekir
        WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("city bike" + Keys.ENTER);


        //c. Amazon'da goruntulenen ilgili sonuclarin sayisini yazdirin
        List<WebElement> istenenElementListesi = driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazisiElementi = istenenElementListesi.get(0); // 24 sonuc cikti 1.si bizim old icin 0. index i aldik
        System.out.println(sonucYazisiElementi.getText());


        //d.Sonra karsiniza cikan ilk sonucun resmine tiklayin
        List<WebElement> urunResimleriList=driver.findElements(By.className("s-image"));
        WebElement ilkUrunResmi = urunResimleriList.get(0);
        ilkUrunResmi.click();

        /*
        Not :: Ilk resimde 85 tane cıktı bu yüzden bir listin icine atadik ve 1. yi sectik
         */
    }
}
