package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver(); // OBJEYI OLUSTURDUGUMUZ ANDA DRIVER ACILIR
        //WebDriver bir interface

        driver.manage().window().maximize(); // window yönetecek ve tam sayfa yapacak
        //functionel program gibi dusun

        driver.get("https://amazon.com");
        System.out.println("actual title : " +driver.getTitle()); // baslık getirecek
        System.out.println("actual url : "+driver.getCurrentUrl()); // url getirir
        driver.close(); // isi bitince kapatacak



    }
}
