package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {

    /*
    Main method olusturun ve asagidaki gorevi tamamlayin
    a. http://a.testaddressbook.com adresine gidiniz.
    b. Sign in butonuna basin
    c. email textbox, password textbox, and signin button elementlerini locate ediniz..
    d. Kullanici adini ve sifreyi asagiya girin ve oturum ac( sign in) buttonunu tiklayin:
       i.Username : testtechproed@gmail.com
       ii. Password : Test1234!
    e. Expected user id nin testteschproed@gmail.com oldugunu dogrulayin(verify).
    f. "Addresses" ve "Sign Out" textlerinin goruntulendigini (displated) dogrulayin(verify)
    g. Sayfada kac tane link oldugunu bulun.
    h. linkleri yazdiralim
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //    a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");


        //    b. Sign in butonuna basin
        WebElement singInLinki = driver.findElement(By.linkText("Sign in"));
        singInLinki.click();// bu kisimla tikladik


        //    c. email textbox, password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox =driver.findElement(By.id("session_email")); // İD VEYA NAME KENDİ İSTEGİMİZE GORE SECTİK
        WebElement passwordTextBox = driver.findElement(By.name("session[password]"));
        WebElement signInButonu =driver.findElement(By.name("commit"));



        //    d. Kullanici adini ve sifreyi asagiya girin ve oturum ac( sign in) buttonunu tiklayin:
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys(" Test1234!");
        signInButonu.click();
               //       i.Username : testtechproed@gmail.com
               //       ii. Password : Test1234!



        //    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualKullaniciAdiElementi= driver.findElement(By.className("navbar-text"));
        System.out.println(actualKullaniciAdiElementi.getText());
        String expectedUserMail="testtechproed@gmail.com";
        if (expectedUserMail.equals(actualKullaniciAdiElementi.getText())){
            System.out.println( "Expected kullanici testi PASSED");
        }else
            System.out.println("Expected kullanici testi FAILED");

         // getText() web elementi uzerindeki yaziyi getirir

        // bir webElementin uzerinde ne yazdigini gormak istersek webElementIsmi.getText() kullaniriz
        // bende mail i kabul etmedi suan aktif degil


        //    f. "Addresses" ve "Sign Out" textlerinin goruntulendigini (displated) dogrulayin(verify)

        WebElement adressesElementi = driver.findElement(By.linkText("Adresses"));
        WebElement signOutElemnti=driver.findElement(By.linkText("Sign out"));

       if ( adressesElementi.isDisplayed()){  // isDisplayed() gorunuyor mu? boolean dondurecek
           System.out.println("adresses testi PASSED");
       }else System.out.println("adresses testi FAILED");


       if (signOutElemnti.isDisplayed()){
           System.out.println("signOut testi PASSED");
       }else
           System.out.println("signOut testi FAILED");

        //    3. Sayfada kac tane link oldugunu bulun.

        List<WebElement> linklerListesi=driver.findElements(By.tagName("a"));
        System.out.println("sayfadaki link sayisi : " +linklerListesi.size());

        // linkleri yazdiralim
        // Listemiz webelementlerden olustugu icin, direk yazdirirsak referanslari yazdirir
        // onun yerine for-each loop yapip her bir webelementinin uzerindeki yaziyi yazdirmaliyiz
        for (WebElement each: linklerListesi
             ) {
            System.out.println(each.getText());
        }

        driver.close();
    }
}
