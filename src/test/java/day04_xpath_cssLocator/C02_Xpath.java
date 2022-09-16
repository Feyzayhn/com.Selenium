package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Watchable;
import java.time.Duration;

public class C02_Xpath {

    /*
    Xpath yazmak :: icin tag,attribute ve attribute degeri olmasi lazim

                   //tagName[@attributeIsmi='attributeValue'] bu sekilde olusturulur

                   (//tagName[@attributeIsmi='attributeValue'])[] bu sekilde yazarsak index ile arama yapiyoruz

                   [] icine aradigimiz indexi yazarak istedigimiz urune gidebiliriz
                   index girdigimizde uniqe yapmis oluruz

    cssSelector olusturma ::
                           tagName[attributeismi='value'] seklinde  olur kullanimi Xpath'e benzer
     */

     /* SORU
     1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
     2- Add Element butonuna basin
     3- Delete butonu'nun gorunuyor oldugunu test edin
     4- Delete tusuna basin
     5- "Add/Remove Elements" yazisinin gorunur oldugunu test edin
      */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //driver.findElement(By.xpath("//button[text()='Add Element']")).click(); //BOYLEDE CALISIR yazi oldugunda text ile yapilabilir
        // driver.findElement(By.xpath("//*[text()='Add Element']")).click; // BOYLEDE CALISIR
        // bir web elementte yazi varsa yukaridaki iki sekilde de yaparsak calisir

         // click yapma islemini bir daha kullanmicaksam bu sekilde yazabilirim
         /* ama kullanacaksam asagidaki gibi  yazilmali
        WebElement addButonu= driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addButonu.click();

          */


        //   3- Delete butonu'nun gorunuyor oldugunu test edin
        WebElement deleteButonu=driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("delete butonu testi PASSED");
        }else
            System.out.println("delete butonu testi FAILED");

        // isDisplayed() GORUNUYOR MU TEST EDİYOR BOOLEAN DONDURUYOR


        //4- Delete tusuna basin
        Thread.sleep(3000);
        deleteButonu.click();

       // 5- "Add/Remove Elements" yazisinin gorunur oldugunu test edin

        WebElement addRemove = driver.findElement(By.xpath("//h3"));
        if (addRemove.isDisplayed()){
            System.out.println("addRemove butonu testi PASSED");
        }else
            System.out.println("addRemove butonu testi FAILED");

        Thread.sleep(3000);
        driver.close();



    }




}
