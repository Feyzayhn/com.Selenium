package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_managaMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // yuklenene kadar gecen zaman
        // sayfaya max 15 sn icinde baglan baglanamazsan bana rapor et
        /*
        Ilerde wait konusunu daha genis olarak ele alacagiz
        Bir sayfa acilirken, ilk basta sayfanin icerisinde bulunan elementlere gore
        bir yukleme suresine ihtiyac vardir
        veya bir web elementinin kullanilabilmesi icin zamana ihtiyac olabilir
        implicitlyWait() bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek
        MAXIMUM sureyi belirleme olanagi tanir
         */

        driver.close();

        // not : driver.close() son acilan browseri kapatir
        // driver.quit() acik olan tum browser'lari kapatir

        /*
        her class'ımızın basina window u tam ekran yapip implicityWait() da eklemeliyiz
         */
    }
}
