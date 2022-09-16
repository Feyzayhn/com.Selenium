package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSource {

    public static void main(String[] args) {

        // amazon sitesine gidip Kaynak kodlarinda "Gateway"" yazdigini test edin


        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        // getPageSource(); string getirdigi icin string'e atadik
        // getPageSource(); kaynak kodlari getirir

        String sayfaKaynakNotlari = driver.getPageSource();
        System.out.println(sayfaKaynakNotlari);
        String arananKelime = "Gateway";

        if (sayfaKaynakNotlari.contains(arananKelime)) {
            System.out.println("Kaynak kodu testi PASSED");
        } else {
            System.out.println("Kaynak kodlarinda" + arananKelime + "yok test FAILED");
        }

        driver.close();
    }
}
