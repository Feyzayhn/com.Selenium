package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {

    public static void main(String[] args) throws InterruptedException {

        /*
          En ilkel haliyle bir otomasyon yapmak icin
          Class'imiza otomasyon icin gerekli olan webdriver'in yerini gostermemiz gerekir
          bunun icin Java kutuphanesinden System.setProperty() methodunu kullaniriz
          bu method icinde bir key birde value ister
          method 2 parametre istemektedir
          1.si kullanacagimiz driver : webdriver.chrome.driver
          2.si ise bu driver'in fiziki yolu : bunun icin drivers package sag tıkla copy path/referance
                                              sonra path from content tıkla ve value yapistir
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        // exe windows da cıkar mac lerde cıkmıyor bu yazi

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com"); // gitmek istedigimiz yeri buraya yaziyoruz
        Thread.sleep(2000);
        driver.get("https://www.techproeducation.com");
        Thread.sleep(2000);
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        driver.close();

       /*
         https:// kesinlikle yazilmali
         www yazilmasada olur
         */

    }
}
